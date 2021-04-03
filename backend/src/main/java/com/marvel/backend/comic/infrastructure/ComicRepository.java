package com.marvel.backend.comic.infrastructure;

import com.marvel.backend.comic.domain.Comic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ComicRepository extends CrudRepository<Comic, Integer> {

    @Query("FROM Comic comic WHERE upper(comic.title) = upper(:title)")
    Optional<Comic> findByTitle(String title);
}
