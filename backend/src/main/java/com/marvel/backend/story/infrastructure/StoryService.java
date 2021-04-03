package com.marvel.backend.story.infrastructure;

import org.springframework.stereotype.Service;

@Service
public class StoryService {

    StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }
}
