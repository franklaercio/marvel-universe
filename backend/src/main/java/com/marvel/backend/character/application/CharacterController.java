package com.marvel.backend.character.application;

import com.marvel.backend.character.domain.CharacterDTO;
import com.marvel.backend.character.infrastructure.CharacterService;
import com.marvel.backend.comic.domain.ComicDTO;
import com.marvel.backend.comic.infrastructure.ComicService;
import com.marvel.backend.event.domain.EventDTO;
import com.marvel.backend.event.infrastructure.EventService;
import com.marvel.backend.series.domain.SeriesDTO;
import com.marvel.backend.series.infrastructure.SeriesService;
import com.marvel.backend.story.domain.StoryDTO;
import com.marvel.backend.story.infrastructure.StoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/public/characters")
public class CharacterController {

    CharacterService characterService;
    ComicService comicService;
    EventService eventService;
    SeriesService seriesService;
    StoryService storyService;

    public CharacterController(
            CharacterService characterService,
            ComicService comicService, EventService eventService,
            SeriesService seriesService, StoryService storyService) {
        this.characterService = characterService;
        this.comicService = comicService;
        this.eventService = eventService;
        this.seriesService = seriesService;
        this.storyService = storyService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CharacterDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.findAll());
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> findById(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.findByCharacterId(Integer.parseInt(characterId)));
    }

    @GetMapping("/{characterId}/comics")
    public ResponseEntity<List<ComicDTO>> findComicsByCharacterId(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(comicService.findByCharacterId(Integer.parseInt(characterId)));
    }

    @GetMapping("/{characterId}/events")
    public ResponseEntity<List<EventDTO>> findEventsByCharacterId(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(eventService.findByCharacterId(Integer.parseInt(characterId)));
    }

    @GetMapping("/{characterId}/series")
    public ResponseEntity<List<SeriesDTO>> findSeriesByCharacterId(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(seriesService.findByCharacterId(Integer.parseInt(characterId)));
    }

    @GetMapping("/{characterId}/stories")
    public ResponseEntity<List<StoryDTO>> findStoriesByCharacterId(@PathVariable("characterId") String characterId) {
        return ResponseEntity.status(HttpStatus.OK).body(storyService.findByCharacterId(Integer.parseInt(characterId)));
    }

}
