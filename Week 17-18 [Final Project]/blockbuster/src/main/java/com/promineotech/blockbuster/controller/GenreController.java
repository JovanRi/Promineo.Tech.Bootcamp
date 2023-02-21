package com.promineotech.blockbuster.controller;

import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.blockbuster.entity.Genre;
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
  @RequestMapping("/genre")
  @OpenAPIDefinition(info = @Info(title = "Genres"),
      servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
  public interface GenreController {

    //region POST GENRE
    @Operation(

        // @formatter:off
        summary = "Create a genre",
        description = "Returns a created genre entry",
        responses = {
            @ApiResponse(responseCode = "201", 
                description = "The created genre entry is returned", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Genre.class))),
            @ApiResponse(
                responseCode = "400", 
                description = "the request parameters are invalid", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "404", 
                description = "A genre was not found with the input criteria", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "500", 
                description = "An unplanned error occurred.", 
                content = @Content(mediaType = "application/json")),
        },
        parameters = {
            @Parameter( name = "name",
                required = true,
                description = "The criteria as JSON"),
        }
        )

    //@formatter:on
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
   Genre addGenre(@Valid @RequestBody Genre genre);
    //endregion
    
   //region GET GENRE
    @Operation(
        // @formatter:off
        summary = "Returns available genres",
        description = "Returns a list of genres",
        responses = {
            @ApiResponse(responseCode = "200", 
                description = "A list of movies is returned", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Genre.class))),
            @ApiResponse(
                responseCode = "400", 
                description = "the request parameters are invalid", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "404", 
                description = "No genres were found with the input criteria", 
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
                description = "The genre (e.g., 'Action')"),
        }
        )

    //@formatter:on
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Genre> fetchGenres(
        @Length(max = 60)
        @RequestParam(required = false) 
        String name);
    //endregion
    

}
