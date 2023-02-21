package com.promineotech.blockbuster.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import com.promineotech.blockbuster.entity.Director;
import com.promineotech.blockbuster.entity.Movie;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultDirectorDao implements DirectorDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Director> fetchDirectors(String name) {
    log.debug("Directors fetched");
    
    //@formatter:off
    String sql = ""
        +"SELECT d.director_id, d.director_name, d.nationality, d.gender, d.awards "
        + "FROM director d \n";
        
    //@formatter:on
    
    if(name!=null && name!="") {
      sql += "WHERE d.director_name = '"+name+"'";  
    }
    
    List<Director> directors = jdbcTemplate.query(sql,
        new RowMapper<>() {

          @Override
          public Director mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
          return Director.builder()
              .director_id(Long.parseLong(rs.getString("director_id")))
              .director_name(rs.getString("director_name"))
              .nationality(rs.getString("nationality"))
              .gender(rs.getString("gender"))
              .awards(rs.getInt("awards"))
              .build();
        // @formatter:on
          }});
    
    
    
    for(Director director : directors) {
      
    //@formatter:off
      sql = ""
          +"  SELECT m.movies_name \n"
          + " FROM movies m "
          + " WHERE m.director_id = "
          + director.getDirector_id();
      //@formatter:on
      
      director.setMovies(
          jdbcTemplate.query(sql,
              new RowMapper<>() {
            @Override
            public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
              return Movie.builder()
                  //@formatter:off
                  .movies_name(rs.getString("movies_name"))
                  .build();
                  //@formatter:on
            }}
              
              )
          );
     
    }

    return directors;
  }

  @Override
  public Director addDirector(Director director) {
    log.debug("Director added");
    
    SqlParams params = GenerateSQL(director);
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(params.sql, params.source, keyHolder);
    
    return Director.builder()
        //@formatter:off
        .director_id(keyHolder.getKey().longValue())
        .director_name(director.getDirector_name())
        .nationality(director.getNationality())
        .gender(director.getGender())
        .awards(director.getAwards())
        .build();
        //@formatter:on
  }
  
  private SqlParams GenerateSQL(Director director) {
 // @formatter:off
    String sql = ""
        + "INSERT INTO director ("
        + "director_name, nationality, gender, awards"
        + ") VALUES ("
        + ":director_name, :nationality, :gender, :awards"
        + ")";
    // @formatter:on

    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("director_name", director.getDirector_name());
    params.source.addValue("nationality", director.getNationality());
    params.source.addValue("gender", director.getGender());
    params.source.addValue("awards", director.getAwards());
    
    return params;
  }
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }

}
