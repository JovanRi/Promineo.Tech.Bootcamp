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
import com.promineotech.blockbuster.entity.Director;
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
  @RequestMapping("/director")
  @OpenAPIDefinition(info = @Info(title = "Director"),
      servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
  public interface DirectorController {

    //region POST DIRECTOR
    @Operation(

        // @formatter:off
        summary = "Create a director",
        description = "Returns a created director",
        responses = {
            @ApiResponse(responseCode = "201", 
                description = "The created director is returned", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Director.class))),
            @ApiResponse(
                responseCode = "400", 
                description = "the request parameters are invalid", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "404", 
                description = "A director was not found with the input criteria", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "500", 
                description = "An unplanned error occurred.", 
                content = @Content(mediaType = "application/json")),
        },
        parameters = {
            @Parameter( name = "directorRequest",
                required = true, 
                description = "The criteria as JSON"),
        }
        )

    //@formatter:on
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
   Director addDirector(@Valid @RequestBody Director director);
    //endregion
    
   //region GET DIRECTOR
    @Operation(
        // @formatter:off
        summary = "Returns a list of Director",
        description = "Returns a list of directors given an optional model and/or trim",
        responses = {
            @ApiResponse(responseCode = "200", 
                description = "A list of directors is returned", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Director.class))),
            @ApiResponse(
                responseCode = "400", 
                description = "the request parameters are invalid", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "404", 
                description = "No directors were found with the input criteria", 
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
                description = "The director's name (e.g., 'Guillermo del Toro')"),
        }
        )

    //@formatter:on
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Director> fetchDirectors(
        @Length(max = 60)
        @RequestParam(required = false) 
        String name);
    //endregion
    

}

