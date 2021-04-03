package com.marvel.backend.character.application;

import com.marvel.backend.character.domain.CharacterDTO;
import com.marvel.backend.character.infrastructure.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/public/characters")
public class CharacterController {

    CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CharacterDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.findAll());
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> findById(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.findByCharacterId(Integer.parseInt(characterId)));
    }
}
