package com.marvel.backend.character.infrastructure;

import com.marvel.backend.character.domain.Character;
import com.marvel.backend.character.domain.CharacterDTO;
import com.marvel.backend.comic.infrastructure.ComicRepository;
import com.marvel.backend.event.infrastructure.EventRepository;
import com.marvel.backend.global.insfrastructure.EntityDefaultResponseService;
import com.marvel.backend.series.infrastructure.SeriesRepository;
import com.marvel.backend.story.infrastructure.StoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<CharacterDTO> findAll(String name, String nameStartsWith) {
        Iterable<Character> savedCharacters = characterRepository.findAllByParams(name, nameStartsWith);
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
        characterDTO.setComics(EntityDefaultResponseService.insertEntity(Arrays.asList(this.comicRepository.findByCharacterId(character.getId()).toArray())));
        characterDTO.setSeries(EntityDefaultResponseService.insertEntity(Arrays.asList(this.seriesRepository.findByCharacterId(character.getId()).toArray())));
        characterDTO.setStories(EntityDefaultResponseService.insertEntity(Arrays.asList(this.storyRepository.findByCharacterId(character.getId()).toArray())));
        characterDTO.setEvents(EntityDefaultResponseService.insertEntity(Arrays.asList(this.eventRepository.findByCharacterId(character.getId()).toArray())));

        return characterDTO;
    }

}
