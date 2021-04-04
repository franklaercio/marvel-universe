package com.marvel.backend.story;

import com.marvel.backend.story.domain.StoryDTO;
import com.marvel.backend.story.infrastructure.StoryService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
public class StoryServiceTest {

    @Autowired
    private Flyway flyway;

    @Mock
    private StoryService storyService;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        MockitoAnnotations.openMocks(this);

        this.storyService = Mockito.mock(StoryService.class);
    }

    @Test
    void whenFindCharacterStoriesWithId1ShouldBeReturnResult() {
        List<StoryDTO> list = storyService.findByCharacterId(1);

        assertThat(list).isNotNull();

        verify(this.storyService, times(1)).findByCharacterId(1);
    }

    @Test
    void whenFindCharacterStoriesNotSavedShouldBeReturnEmpty() {
        List<StoryDTO> list = storyService.findByCharacterId(1);

        assertThat(list).isEmpty();

        verify(this.storyService, times(1)).findByCharacterId(1);
    }
}
