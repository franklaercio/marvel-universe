package com.marvel.backend.character.infrastructure;

import com.marvel.backend.character.domain.Character;
import com.marvel.backend.character.domain.CharacterDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    private CharacterDTO populateCharacterDTO(Character character) {
        CharacterDTO characterDTO = new CharacterDTO();

        characterDTO.setId(character.getId());
        characterDTO.setName(character.getName());
        characterDTO.setDescription(character.getDescription());
        characterDTO.setModified(character.getModified());

        return characterDTO;
    }

    public List<CharacterDTO> findAll() {
        Iterable<Character> savedCharacters = characterRepository.findAll();
        List<CharacterDTO> characters = new ArrayList<>();

        savedCharacters.forEach(character -> characters.add(populateCharacterDTO(character)));

        return characters;
    }
}
