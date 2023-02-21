package com.promineotech.blockbuster.controller;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.blockbuster.entity.Director;
import com.promineotech.blockbuster.service.DirectorService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultDirectorController implements DirectorController {

  @Autowired
  private DirectorService directorService;
  
  @Override
  public Director addDirector(@Valid Director director) {
    log.debug("director={)", director);
    return directorService.addDirector(director);
  }

  @Override
  public List<Director> fetchDirectors(@Length(max = 60) String name) {
    return directorService.fetchDirectors(name);
  }

}
