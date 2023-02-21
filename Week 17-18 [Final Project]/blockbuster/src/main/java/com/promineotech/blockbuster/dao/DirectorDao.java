package com.promineotech.blockbuster.dao;

import java.util.List;
import com.promineotech.blockbuster.entity.Director;

public interface DirectorDao {
  
  List<Director> fetchDirectors(String name);
  
  Director addDirector(Director director);

}
