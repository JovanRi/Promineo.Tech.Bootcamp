package com.promineotech.blockbuster.entity;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {
private Long movies_id;
private String movies_name;
private BigDecimal rating;
private String synopsis;
private Director director;
private List<Genre> genres;

@JsonIgnore
public Long movies_id() {
  return movies_id;
}


public List<Genre> getGenres(){
  return genres;
}

public void setGenres(List<Genre> genres) {
  this.genres = genres;
}
}
