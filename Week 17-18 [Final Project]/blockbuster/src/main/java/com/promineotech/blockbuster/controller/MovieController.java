package com.promineotech.blockbuster.controller;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.blockbuster.entity.Genre;
import com.promineotech.blockbuster.entity.Movie;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.validation.Valid;

@Validated
@RequestMapping("/movies")
@OpenAPIDefinition(info = @Info(title = "Genres"),
    servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
public interface MovieController {
  
  //region GET MOVIE
  @Operation(
      // @formatter:off
      summary = "Returns the movie catalog",
      description = "Returns a list of movies",
      responses = {
          @ApiResponse(responseCode = "200", 
              description = "A list of movies is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Movie.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "the request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No movies were found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json")),
      },
      parameters = {
          @Parameter(
              name = "name", 
              allowEmptyValue = true, 
              required = false, 
              description = "The movie (e.g., 'The Avengers')"),
      }
      )

  //@formatter:on
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Movie> fetchMovies(
      @Length(max = 128)
      @RequestParam(required = false) 
      String name);
  //endregion
  
//region POST MOVIE
  @Operation(

      // @formatter:off
      summary = "Create a movie",
      description = "Returns a created movie entry",
      responses = {
          @ApiResponse(responseCode = "201", 
              description = "The created movie entry is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Genre.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "the request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A movie was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json")),
      },
      parameters = {
          @Parameter( 
              name = "name",
              required = true, 
              description = "The criteria as JSON"),
      }
      )

  //@formatter:on
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
 Movie addMovie(@Valid @RequestBody Movie movie);
  //endregion
  
//region PUT MOVIE
  @Operation(

      // @formatter:off
      summary = "Update a movie entry",
      description = "Returns an updated movie entry",
      responses = {
          @ApiResponse(responseCode = "201", 
              description = "The updated movie entry is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Genre.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "the request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A movie was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json")),
      },
      parameters = {
          @Parameter( 
              name = "name",
              required = true, 
              description = "The criteria as JSON"),
      }
      )

  //@formatter:on
  @PutMapping
  @ResponseStatus(code = HttpStatus.OK)
 Movie updateMovie(@Valid @RequestBody Movie movie);
  //endregion
  
//region DELETE MOVIE
  @Operation(

      // @formatter:off
      summary = "Remove a movie entry",
      description = "Delete a movie entry from the catalog",
      responses = {
          @ApiResponse(responseCode = "201", 
              description = "The movie entry has been removed", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Movie.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "the request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A movie was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json")),
      },
      parameters = {
          @Parameter( 
              name = "name",
              required = true, 
              description = "The criteria as JSON"),
      }
      )

  //@formatter:on
  @DeleteMapping
  @ResponseStatus(code = HttpStatus.ACCEPTED)
 boolean removeMovie(@Valid @RequestBody Movie movie);
  //endregion

}
