package com.marvel.backend.story;

import com.marvel.backend.story.infrastructure.StoryRepository;
import com.marvel.backend.story.infrastructure.StoryService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class StoryServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private StoryRepository storyRepository;
    private StoryService storyService = Mockito.mock(StoryService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();
        this.storyService = new StoryService(storyRepository);
    }

    @Test
    void whenFindCharacterStoriesWithId1ShouldBeReturnResult() {
        //Character character = this.storyService.charactersStoriess(1);
        //assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterStoriesNotSavedShouldBeReturnNull() {
        //Character character = this.storyService.charactersStoriess(100);
        //assertThat(character).isNull();
    }
}
