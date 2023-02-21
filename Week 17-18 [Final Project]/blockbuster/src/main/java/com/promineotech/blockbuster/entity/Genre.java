package com.promineotech.blockbuster.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Genre {
private Long genre_id;
private String genre_name;
private List<Movie> movies;

@JsonIgnore
public Long genre_id() {
  return genre_id;
}

}
