package com.api.pokemon.restful.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PokemonNotFoundException extends RuntimeException{

    public PokemonNotFoundException(){
        super("It does not exist a pokemon with that id");
    }
}
