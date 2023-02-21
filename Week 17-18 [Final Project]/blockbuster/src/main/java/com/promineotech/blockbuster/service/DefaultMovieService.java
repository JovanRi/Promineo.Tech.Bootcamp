package com.promineotech.blockbuster.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.blockbuster.dao.MovieDao;
import com.promineotech.blockbuster.entity.Movie;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultMovieService implements MovieService {
  
  @Autowired
  private MovieDao movieDao;

  @Transactional(readOnly = true)
  @Override
  public List<Movie> fetchMovies(String name) {
    return movieDao.fetchMovies(name);
  }

  @Transactional
  @Override
  public Movie addMovie(Movie movie) {
    
    log.debug("Added movie={}", movie);
    return movieDao.addMovie(movie);
  }

  @Override
  public Movie updateMovie(Movie movie) {
    
    log.debug("Updated movie={}", movie);
    return movieDao.updateMovie(movie);
  }

  @Override
  public boolean removeMovie(Movie movie) {
    
    log.debug("Removed movie={}", movie);
    return movieDao.removeMovie(movie);
  }

}
