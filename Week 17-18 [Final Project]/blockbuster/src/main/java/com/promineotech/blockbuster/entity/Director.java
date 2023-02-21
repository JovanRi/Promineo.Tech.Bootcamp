package com.promineotech.blockbuster.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Director {
  private Long director_id;
  private String director_name;
  private String nationality;
  private String gender;
  private int awards;
  private List<Movie> movies;


  public Director() {
    
  }
  
  public Director(Long director_id,String director_name, String nationality, 
      String gender, int awards,
      List<Movie> movies) {
    this.director_id = director_id;
    this.director_name = director_name;
    this.nationality = nationality;
    this.gender = gender;
    this.awards = awards;
  }

  public Director(String director_name, String nationality, 
      String gender, int awards) {
    this.director_name = director_name;
    this.nationality = nationality;
    this.gender = gender;
    this.awards = awards;
  }
  
  @JsonIgnore
  public Long director_id() {
    return director_id;
  }

}
