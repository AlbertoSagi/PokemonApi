package com.api.pokemon.restful.service;

import com.api.pokemon.restful.model.Pokemon;
import com.api.pokemon.restful.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> findAll(){
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> findById(Integer id){
        return pokemonRepository.findById(id);
    }

    public Pokemon savePokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Pokemon updatePokemon(Pokemon newPokemon){
        Integer id = newPokemon.getId();
        if (pokemonRepository.findById(id).isPresent()){
            Pokemon pokemon = new Pokemon();
            pokemon.setId(newPokemon.getId());
            pokemon.setName(newPokemon.getName());
            pokemon.setType(newPokemon.getType());
            pokemon.setExperience(newPokemon.getExperience());
            pokemon.setHeight(newPokemon.getHeight());
            pokemon.setWeight(newPokemon.getWeight());
            pokemonRepository.save(pokemon);
            return pokemon;
        }
        return newPokemon;
    }

    public void deletePokemon(Integer id){
        pokemonRepository.deleteById(id);
    }

    public List<Pokemon> findByNameStartingWith(String prefix){
        return pokemonRepository.findByNameIgnoreCaseStartingWith(prefix);
    }

    public List<Pokemon> findFirst3ByWeight(){
        return pokemonRepository.findFirst3ByWeightOrderByWeightDesc();
    }

    public List<Pokemon> findFirst3ByExperience(){
        return pokemonRepository.findFirst3ByExperienceOrderByExperienceDesc();
    }
}
