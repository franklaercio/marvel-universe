package com.marvel.backend.character.infrastructure;

import com.marvel.backend.character.domain.Character;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterRepository extends CrudRepository<Character, Integer> {

    @Query("FROM Character c WHERE c.name like :name and c.name LIKE :nameStartsWith%")
    List<Character> findAllByParams(@Param("name") String name, @Param("nameStartsWith") String nameStartsWith);
}
