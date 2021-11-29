package com.api.pokemon.restful.repository;

import com.api.pokemon.restful.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface which implements the JpaRepository's methods in order to query the BBDD
 */


@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    //Queries by Method name
    List<Pokemon> findByNameIgnoreCaseStartingWith(String prefix);

    List<Pokemon> findFirst3ByWeightOrderByWeightDesc();

    List<Pokemon> findFirst3ByExperienceOrderByExperienceDesc();




}
