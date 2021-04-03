package com.marvel.backend.event.infrastructure;

import com.marvel.backend.event.domain.Event;
import com.marvel.backend.event.domain.EventDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventDTO> findByCharacterId(Integer characterId) {
        Iterable<Event> savedEvents = eventRepository.findByCharacterId(characterId);
        List<EventDTO> events = new ArrayList<>();

        savedEvents.forEach(event -> events.add(populateEventDTO(event)));

        return events;
    }

    private EventDTO populateEventDTO(Event event) {
        EventDTO eventDTO = new EventDTO();

        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setModified(event.getModified());
        eventDTO.setStart(event.getStart());
        eventDTO.setEnd(event.getEnd());
        eventDTO.setResourceURI("/v1/public/characters/" + event.getId() + "/events");

        return eventDTO;
    }
}
