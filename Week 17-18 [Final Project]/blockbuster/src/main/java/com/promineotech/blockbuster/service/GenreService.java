package com.promineotech.blockbuster.service;

import java.util.List;
import com.promineotech.blockbuster.entity.Genre;

public interface GenreService {
  
  List<Genre> fetchGenres(String name);
  
  Genre addGenre(Genre genre);
}
