package com.promineotech.blockbuster.controller;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.blockbuster.entity.Movie;
import com.promineotech.blockbuster.service.MovieService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultMovieController implements MovieController {

  @Autowired
  private MovieService movieService;
  
  @Override
  public List<Movie> fetchMovies(@Length(max = 128) String name) {
    return movieService.fetchMovies(name);
  }

  @Override
  public Movie addMovie(@Valid Movie movie) {
    log.debug("added movie={}",movie);
    return movieService.addMovie(movie);
  }

  @Override
  public Movie updateMovie(@Valid Movie movie) {
    log.debug("updated movie={}",movie);
    return movieService.updateMovie(movie);
  }

  @Override
  public boolean removeMovie(@Valid Movie movie) {
    log.debug("deleted movie={}",movie);
    return movieService.removeMovie(movie);
  }

}
