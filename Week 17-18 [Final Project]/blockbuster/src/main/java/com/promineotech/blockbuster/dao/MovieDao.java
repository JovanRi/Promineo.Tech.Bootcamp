package com.promineotech.blockbuster.dao;

import java.util.List;
import com.promineotech.blockbuster.entity.Movie;

public interface MovieDao {
  
  List<Movie> fetchMovies(String name);
  
  Movie addMovie(Movie movie);
  
  Movie updateMovie(Movie movie);
  
  boolean removeMovie(Movie movies);
  

}
