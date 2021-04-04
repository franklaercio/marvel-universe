package com.marvel.backend.story;

import com.marvel.backend.story.domain.Story;
import com.marvel.backend.story.infrastructure.StoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
public class StoryTest {

    @Mock
    private StoryRepository storyRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedCharacter() {
        Story story = Mockito.mock(Story.class);
        story.setTitle("Lorem ipsum");
        story.setDescription("Lorem ipsum dolor sit amet");
        story.setType("Test");

        storyRepository.save(story);

        assertThat(story.getId()).isNotNull();

        verify(storyRepository, times(1)).save(story);
    }

    @Test
    public void shouldBeNotSavedInvalidStory() {
        Story story = new Story();
        story.setTitle("");

        storyRepository.save(story);

        assertThat(story.getId()).isNull();

        verify(storyRepository, times(1)).save(story);
    }

}
