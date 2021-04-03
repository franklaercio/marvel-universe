package com.marvel.backend.character.infrastructure;

import com.marvel.backend.character.domain.Character;
import com.marvel.backend.character.domain.*;
import com.marvel.backend.comic.domain.Comic;
import com.marvel.backend.comic.infrastructure.ComicRepository;
import com.marvel.backend.event.domain.Event;
import com.marvel.backend.event.infrastructure.EventRepository;
import com.marvel.backend.series.domain.Series;
import com.marvel.backend.series.infrastructure.SeriesRepository;
import com.marvel.backend.story.domain.Story;
import com.marvel.backend.story.infrastructure.StoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    CharacterRepository characterRepository;
    ComicRepository comicRepository;
    SeriesRepository seriesRepository;
    StoryRepository storyRepository;
    EventRepository eventRepository;

    public CharacterService(
            CharacterRepository characterRepository,
            ComicRepository comicRepository,
            SeriesRepository seriesRepository,
            StoryRepository storyRepository,
            EventRepository eventRepository) {
        this.characterRepository = characterRepository;
        this.comicRepository = comicRepository;
        this.seriesRepository = seriesRepository;
        this.storyRepository = storyRepository;
        this.eventRepository = eventRepository;
    }

    public List<CharacterDTO> findAll() {
        Iterable<Character> savedCharacters = characterRepository.findAll();
        List<CharacterDTO> characters = new ArrayList<>();

        savedCharacters.forEach(character -> characters.add(populateCharacterDTO(character)));

        return characters;
    }

    public CharacterDTO findByCharacterId(Integer characterId) {
        Character savedCharacters = characterRepository.findById(characterId).orElse(null);
        return populateCharacterDTO(savedCharacters);
    }

    private CharacterDTO populateCharacterDTO(Character character) {
        CharacterDTO characterDTO = new CharacterDTO();

        characterDTO.setId(character.getId());
        characterDTO.setName(character.getName());
        characterDTO.setDescription(character.getDescription());
        characterDTO.setModified(character.getModified());
        characterDTO.setResourceURI("/v1/public/characters/" + character.getId());
        characterDTO.setComics(insertCharacterComic(character.getId()));
        characterDTO.setSeries(insertCharacterSeries(character.getId()));
        characterDTO.setStories(insertCharacterStories(character.getId()));
        characterDTO.setEvents(insertCharacterEvent(character.getId()));

        return characterDTO;
    }

    private CharacterComicDTO insertCharacterComic(Integer characterId) {
        List<Comic> comics = comicRepository.findByCharacterId(characterId);

        CharacterComicDTO characterComicDTO = new CharacterComicDTO();
        characterComicDTO.setAvailable(comics.size());
        characterComicDTO.setItems(new ArrayList<>());

        if(!comics.isEmpty()) {
            comics.forEach(comic -> characterComicDTO.getItems().add(comic.getTitle()));
        }

        return characterComicDTO;
    }

    private CharacterSeriesDTO insertCharacterSeries(Integer characterId) {
        List<Series> series = seriesRepository.findByCharacterId(characterId);

        CharacterSeriesDTO characterSeriesDTO = new CharacterSeriesDTO();
        characterSeriesDTO.setAvailable(series.size());
        characterSeriesDTO.setItems(new ArrayList<>());

        if(!series.isEmpty()) {
            series.forEach(comic -> characterSeriesDTO.getItems().add(comic.getTitle()));
        }

        return characterSeriesDTO;
    }

    private CharacterStoriesDTO insertCharacterStories(Integer characterId) {
        List<Story> stories = storyRepository.findByCharacterId(characterId);

        CharacterStoriesDTO characterStoriesDTO = new CharacterStoriesDTO();
        characterStoriesDTO.setAvailable(stories.size());
        characterStoriesDTO.setItems(new ArrayList<>());

        if(!stories.isEmpty()) {
            stories.forEach(story -> characterStoriesDTO.getItems().add(story.getTitle()));
        }

        return characterStoriesDTO;
    }

    private CharacterEventDTO insertCharacterEvent(Integer characterId) {
        List<Event> events = eventRepository.findByCharacterId(characterId);

        CharacterEventDTO characterEventDTO = new CharacterEventDTO();
        characterEventDTO.setAvailable(events.size());
        characterEventDTO.setItems(new ArrayList<>());

        if(!events.isEmpty()) {
            events.forEach(event -> characterEventDTO.getItems().add(event.getName()));
        }

        return characterEventDTO;
    }
}
