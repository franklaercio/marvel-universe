package com.marvel.backend.event.infrastructure;

import com.marvel.backend.event.domain.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("FROM Event event WHERE upper(event.name) = upper(:name)")
    Optional<Event> findByName(String name);
}
