package com.promineotech.blockbuster.service;

import java.util.List;
import com.promineotech.blockbuster.entity.Director;

public interface DirectorService {
  List<Director> fetchDirectors(String name);
  
  Director addDirector(Director director);

}
