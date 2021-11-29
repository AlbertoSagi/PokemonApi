package com.api.pokemon.restful.controller;

import com.api.pokemon.restful.exceptions.PokemonNotFoundException;
import com.api.pokemon.restful.model.Pokemon;
import com.api.pokemon.restful.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller mapping the requests to /api.
 */
@RestController
@RequestMapping(path = "/api")
public class PokemonAPI {

  @Autowired
  PokemonService pokemonService;

  /**
   * Mapping a GET for the route /api/pokemon
   * @return List<Pokemon>
   */
  @GetMapping("/pokemon")
  public List<Pokemon> getAllPokemon() {
    return pokemonService.findAll();
  }

  /**
   * Mapping a GET for the route /pokemon/id
   * @param id
   * @return Pokemon with id requested. If it does not exist a exception is displayed.
   */
  @GetMapping("/pokemon/{id}")
  public Pokemon getPokemon(@PathVariable Integer id){
    return pokemonService.findById(id).orElseThrow(PokemonNotFoundException::new);
  }

  /**
   * Mapping a POST for the route /pokemon
   * @param pokemon
   * @return Response according the Pokemon has been saved successfully
   */
  @PostMapping("/pokemon")
  public ResponseEntity<Pokemon> savePokemon(@RequestBody Pokemon pokemon){
    Pokemon p = pokemonService.savePokemon(pokemon);
    return new ResponseEntity<>(p, HttpStatus.CREATED);
  }

  /**
   * Mapping a PUT for the route /pokemon/update
   * @param pokemon
   * @return Pokemon updated
   */
  @PutMapping("/pokemon/update")
  public Pokemon updatePokemon(@RequestBody Pokemon pokemon){
    return pokemonService.updatePokemon(pokemon);
  }

  /**
   * Mapping a DELETE for route /pokemon/id
   * @param id
   */
  @DeleteMapping("/pokemon/{id}")
  public void deletePokemon(@PathVariable Integer id){
    pokemonService.deletePokemon(id);
  }
  /**
   * Mapping a GET for route /pokemon/prefix
   * @param prefix
   * @return List<Pokemon> that started with the prefix indicated in the parameter
   */
  @GetMapping("/pokemon/{prefix}")
  public List<Pokemon>getPokemonStartingWith(@PathVariable String prefix){
    return pokemonService.findByNameStartingWith(prefix);
  }

  /**
   * Mapping a GET for the route /pokemon/heavist
   * @return List<Pokemon> which contains the 3 heaviest pokemon
   */
  @GetMapping("/pokemon/heaviest")
  public List<Pokemon>getFirst3HeaviestPokemon(){
    return pokemonService.findFirst3ByWeight();
  }

  /**
   * Mapping a GET for the route /pokemon/experience
   * @return List<Pokemon> which contains the 3 pokemon with more experience
   */
  @GetMapping("/pokemon/experience")
  public List<Pokemon>getFirst3PokemonByExperience(){
    return pokemonService.findFirst3ByExperience();
  }
}
