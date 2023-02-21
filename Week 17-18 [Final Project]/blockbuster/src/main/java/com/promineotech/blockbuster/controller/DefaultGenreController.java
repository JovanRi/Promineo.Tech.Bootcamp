package com.promineotech.blockbuster.controller;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.blockbuster.entity.Genre;
import com.promineotech.blockbuster.service.GenreService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultGenreController implements GenreController {

  @Autowired
  private GenreService genreService;
  
  @Override
  public Genre addGenre(@Valid Genre genre) {
    log.debug("genre={}",genre);
    return genreService.addGenre(genre);
  }

  @Override
  public List<Genre> fetchGenres(@Length(max = 60) String name) {
    return genreService.fetchGenres(name);
  }

}
