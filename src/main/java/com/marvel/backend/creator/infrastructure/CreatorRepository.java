package com.marvel.backend.creator.infrastructure;

import com.marvel.backend.creator.domain.Creator;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CreatorRepository extends CrudRepository<Creator, Integer> {

    @Query("FROM Creator creator WHERE upper(creator.name) = upper(:name)")
    Optional<Creator> findByName(String name);
}
