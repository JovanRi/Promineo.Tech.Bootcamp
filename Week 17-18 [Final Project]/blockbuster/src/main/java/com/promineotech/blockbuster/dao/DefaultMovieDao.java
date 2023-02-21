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
import com.promineotech.blockbuster.entity.Director;
import com.promineotech.blockbuster.entity.Genre;
import com.promineotech.blockbuster.entity.Movie;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultMovieDao implements MovieDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  @Autowired
  private DirectorDao directorDao;
  @Autowired
  private GenreDao genreDao;
  
  @Override
  public List<Movie> fetchMovies(String name) {
    log.debug("Movies fetched");

    //@formatter:off
    String sql = ""
        +"SELECT m.movies_id ,movies_name ,rating , synopsis,"
        + "d.director_name , d.nationality ,d.gender , d.awards  "
        + "FROM movies m \n"
        + "INNER JOIN director d ON m.director_id = d.director_id ";
    //@formatter:on

    Map<String, Object> params = new HashMap<>();

    if (name != null && name != "") {
      sql += "WHERE m.movies_name ="+"'"+name+"'";
    }

    List<Movie> movies = jdbcTemplate.query(sql, new RowMapper<>() {
      @Override
      public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
            return Movie.builder()
                .movies_id(Long.parseLong(rs.getString("movies_id")))
                .movies_name(rs.getString("movies_name"))
                .rating(rs.getBigDecimal("rating"))
                .synopsis(rs.getString("synopsis"))
                .director(new Director(
                    rs.getString("director_name"),
                    rs.getString("nationality"),
                    rs.getString("gender"),
                    rs.getInt("awards")
                    ))
                .build();
            // @formatter:on
      }
    });



    for (Movie movie : movies) {
      //@formatter:off
      sql = ""
          +"SELECT g.genre_name "
          + "FROM movies_genre mg \n"
          + "INNER JOIN genre g ON mg.genre_id = g.genre_id \n"
          + "WHERE mg.movies_id  = "+movie.getMovies_id();
    //@formatter:on

      movie.setGenres(jdbcTemplate.query(sql, params, new RowMapper<>() {
        @Override
        public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
          return Genre.builder()
          //@formatter:off
                  .genre_name(rs.getString("genre_name"))
                  .build();
                  //@formatter:on
        }
      }

      ));

    }

    return movies;
  }

  @Override
  public Movie addMovie(Movie movie) {
    log.debug("Movies added");
    
    //Get Director Data
    List<Director> directors = directorDao.fetchDirectors(movie.getDirector().getDirector_name());
    movie.setDirector(directors.get(0));
    
    SqlParams params = GenerateSQL(movie);
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(params.sql, params.source, keyHolder);
    
    long movie_id = keyHolder.getKey().longValue();
    
    for(Genre genre : movie.getGenres()) {
      List<Genre> genres = genreDao.fetchGenres(genre.getGenre_name());
      
      SqlParams paramsMovie_Genre = GenerateSQL(movie_id,genres.get(0).getGenre_id());
      jdbcTemplate.update(paramsMovie_Genre.sql, paramsMovie_Genre.source);
    }
    
    return Movie.builder()
    //@formatter:off
        .movies_id(movie_id)
        .movies_name(movie.getMovies_name())
        .rating(movie.getRating())
        .synopsis(movie.getSynopsis())
        .genres(movie.getGenres())
        .director(movie.getDirector())
        .build();
        //@formatter:on 
  }

  private SqlParams GenerateSQL(Movie movie) {

    //@formatter:off
    String sql = ""
        + "INSERT INTO movies ("
        + "movies_name, rating, synopsis, director_id"
        + ") VALUES ("
        + ":movies_name, :rating, :synopsis, :director_id"
        + ")";
    //@formatter:on
    
    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("movies_name", movie.getMovies_name());
    params.source.addValue("rating", movie.getRating());
    params.source.addValue("synopsis", movie.getSynopsis());
    params.source.addValue("director_id", movie.getDirector().getDirector_id());
    
    return params;
  }
  
  private SqlParams GenerateDeleteSQL(Movie movie) {

    //@formatter:off
    String sql = ""
        + "DELETE FROM MOVIES "
        + " WHERE movies_id  = :movies_id"
        + " AND director_id = :director_id";
    //@formatter:on
    
    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("movies_id", movie.getMovies_id());
    params.source.addValue("director_id", movie.getDirector().getDirector_id());
    
    return params;
  }
  
  private SqlParams GenerateUpdateSQL(Movie movie) {

    //@formatter:off
    String sql = ""
        + "UPDATE MOVIES "
        + "SET rating = :rating,"
        +" synopsis = :synopsis"
        + " WHERE movies_id  = :movies_id"
        + " AND director_id = :director_id";
    //@formatter:on
    
    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("movies_id", movie.getMovies_id());
    params.source.addValue("director_id", movie.getDirector().getDirector_id());
    params.source.addValue("rating", movie.getRating());
    params.source.addValue("synopsis", movie.getSynopsis());
    
    return params;
  }
  
  private SqlParams GenerateSQL(long movie_id, long genre_id) {

    //@formatter:off
    String sql = ""
        + "INSERT INTO movies_genre ("
        + "movies_id, genre_id"
        + ") VALUES ("
        + ":movies_id, :genre_id"
        + ")";
    //@formatter:on
    
    SqlParams params = new SqlParams();

    params.sql = sql;
    params.source.addValue("movies_id", movie_id);
    params.source.addValue("genre_id", genre_id);
    
    return params;
  }

  @Override
  public Movie updateMovie(Movie movie) {
    log.debug("Movie updated");
    try {
      List<Movie> movies = fetchMovies(movie.getMovies_name());
      List<Director> directors = directorDao.fetchDirectors(movie.getDirector().getDirector_name());
      
      
      movie.setMovies_id(movies.get(0).getMovies_id());
      movie.setDirector(directors.get(0));
      
      SqlParams params = GenerateUpdateSQL(movie);
      
     
      jdbcTemplate.update(params.sql, params.source);
       
      return movie;
      
    }catch(Exception e) {
      throw e;
    }
  }

  @Override
  public boolean removeMovie(Movie movie) {
    log.debug("Movie removed");
    
    try {
      List<Movie> movies = fetchMovies(movie.getMovies_name());
      List<Director> directors = directorDao.fetchDirectors(movie.getDirector().getDirector_name());
      
      
      movie = movies.get(0);
      movie.setDirector(directors.get(0));
      
      SqlParams params = GenerateDeleteSQL(movie);
      
     
      jdbcTemplate.update(params.sql, params.source);
       
      return true;
      
    }catch(Exception e) {
      throw e;
    }
  }
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }

}
