package com.promineotech.blockbuster.dao;

import java.util.List;
import com.promineotech.blockbuster.entity.Genre;

public interface GenreDao {
  
  List<Genre> fetchGenres(String name);
  
  Genre addGenre(Genre genre);

}
