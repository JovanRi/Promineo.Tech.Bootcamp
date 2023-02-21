package com.promineotech.blockbuster.service;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.blockbuster.dao.DirectorDao;
import com.promineotech.blockbuster.entity.Director;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultDirectorService implements DirectorService {

  @Autowired
  private DirectorDao directorDao;
  
  @Transactional(readOnly = true)
  @Override
  public List<Director> fetchDirectors(@Length (max = 128) String name) {
    return directorDao.fetchDirectors(name);
  }

  @Override
  public Director addDirector(Director director) {
    log.debug("director={}", director);
    return directorDao.addDirector(director);
  }

}
