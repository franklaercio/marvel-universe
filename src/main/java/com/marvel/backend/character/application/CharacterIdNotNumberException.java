package com.marvel.backend.character.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CharacterIdNotNumberException extends RuntimeException {

    public CharacterIdNotNumberException(String exception) {
        super(exception);
    }
}
