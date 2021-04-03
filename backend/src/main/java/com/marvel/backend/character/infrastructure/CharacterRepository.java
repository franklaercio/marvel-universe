package com.marvel.backend.character.infrastructure;

import com.marvel.backend.character.domain.Character;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CharacterRepository extends CrudRepository<Character, Integer> {

    @Query("FROM Character character WHERE upper(character.name) = upper(:name)")
    Optional<Character> findByName(String name);
}
