package com.marvel.backend.comic.infrastructure;

import com.marvel.backend.comic.domain.Comic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComicRepository extends CrudRepository<Comic, Integer> {

    @Query("FROM Comic c INNER JOIN CharacterComic cc ON c.id = cc.comicId WHERE cc.characterId = :characterId")
    List<Comic> findByCharacterId(Integer characterId);
}
