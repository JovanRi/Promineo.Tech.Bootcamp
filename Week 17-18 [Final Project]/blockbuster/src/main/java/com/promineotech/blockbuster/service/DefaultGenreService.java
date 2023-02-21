package com.promineotech.blockbuster.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.blockbuster.dao.GenreDao;
import com.promineotech.blockbuster.entity.Genre;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultGenreService implements GenreService {

  @Autowired
  private GenreDao genreDao;

  @Transactional(readOnly = true)
  @Override
  public List<Genre> fetchGenres(String name) {
    return genreDao.fetchGenres(name);
  }

  @Transactional
  @Override
  public Genre addGenre(Genre genre) {


    log.debug("Genre={}", genre);
    return genreDao.addGenre(genre);
  }

}
