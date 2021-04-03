package com.marvel.backend.event.infrastructure;

import org.springframework.stereotype.Service;

@Service
public class EventService {

    EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
