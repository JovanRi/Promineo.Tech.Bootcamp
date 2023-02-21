package com.promineotech.blockbuster.service;

import java.util.List;
import com.promineotech.blockbuster.entity.Movie;

public interface MovieService {
  
  List<Movie> fetchMovies (String name);
  
  Movie addMovie(Movie movie);
  
  Movie updateMovie(Movie movie);
  
  boolean removeMovie(Movie movie);

}
