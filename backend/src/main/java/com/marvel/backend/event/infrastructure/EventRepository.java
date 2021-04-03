package com.marvel.backend.event.infrastructure;

import com.marvel.backend.event.domain.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("FROM Event event WHERE upper(event.name) = upper(:name)")
    Optional<Event> findByName(String name);

    @Query("FROM Event c INNER JOIN CharacterEvent ce ON c.id = ce.eventId WHERE ce.characterId = :characterId")
    List<Event> findByCharacterId(Integer characterId);
}
