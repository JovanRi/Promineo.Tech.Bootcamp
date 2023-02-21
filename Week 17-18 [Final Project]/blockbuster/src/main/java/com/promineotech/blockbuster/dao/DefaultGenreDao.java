package com.promineotech.blockbuster.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import com.promineotech.blockbuster.entity.Genre;
import com.promineotech.blockbuster.entity.Movie;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultGenreDao implements GenreDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Genre> fetchGenres(String name) {
    log.debug("Genres fetched");
    
    //@formatter:off
    String sql = ""
        + "SELECT g.genre_id, g.genre_name FROM genre g ";
    //@formatter:on
    
    Map<String, Object> params = new HashMap<>();
    
    if(name!=null && name!="") {
      sql += "WHERE g.genre_name ="+"'"+name+"'";
  }
    
    List<Genre> genres = jdbcTemplate.query(sql, params,
        new RowMapper<>() {
      @Override
      public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
        return Genre.builder()
            .genre_id(Long.parseLong(rs.getString("genre_id")))
            .genre_name(rs.getString("genre_name"))
            .build();
        // @formatter:on
      }});
    

    
    for(Genre genre : genres) {
      //@formatter:off
      sql = ""
          +"SELECT m.movies_name \n"
          + "    FROM movies m \n"
          + "    INNER JOIN movies_genre mg on m.movies_id  = mg.movies_id \n"
          + "    WHERE mg.genre_id  = "+ genre.genre_id();
    //@formatter:on
    
      genre.setMovies(
          jdbcTemplate.query(sql,
              new RowMapper<>() {
            @Override
            public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
              return Movie.builder()
                  //@formatter:off
                  .movies_name(rs.getString("movies_name"))
                  .build();
                  //@formatter:on
            }})
          );
     
    }
    
    return genres;
  }

  @Override
  public Genre addGenre(Genre genre) {
    log.debug("Genres added");
    
    SqlParams params = GenerateSQL(genre);
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(params.sql, params.source, keyHolder);
    
    return Genre.builder()
        //@formatter:off
        .genre_id(keyHolder.getKey().longValue())
        .genre_name(genre.getGenre_name())
        .build();
    //@formatter:on
    
  }
  
  private SqlParams GenerateSQL(Genre genre) {
 // @formatter:off
    String sql = ""
        + "INSERT INTO genre ("
        + "genre_name"
        + ") VALUES ("
        + ":genre_name"
        + ")";
    // @formatter:on

    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("genre_name", genre.getGenre_name());
    
    return params;
  }
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }
  

}
