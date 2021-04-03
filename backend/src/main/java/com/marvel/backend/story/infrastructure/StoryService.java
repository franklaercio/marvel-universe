package com.marvel.backend.story.infrastructure;

import com.marvel.backend.story.domain.Story;
import com.marvel.backend.story.domain.StoryDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoryService {

    StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<StoryDTO> findByCharacterId(Integer characterId) {
        Iterable<Story> savedStories = storyRepository.findByCharacterId(characterId);
        List<StoryDTO> stories = new ArrayList<>();

        savedStories.forEach(story -> stories.add(populateStoriesDTO(story)));

        return stories;
    }

    private StoryDTO populateStoriesDTO(Story story) {
        StoryDTO storyDTO = new StoryDTO();

        storyDTO.setId(story.getId());
        storyDTO.setTitle(story.getTitle());
        storyDTO.setType(story.getType());
        storyDTO.setModified(story.getModified());
        storyDTO.setResourceURI("/v1/public/characters/" + story.getId() + "/stories");

        return storyDTO;
    }
}
