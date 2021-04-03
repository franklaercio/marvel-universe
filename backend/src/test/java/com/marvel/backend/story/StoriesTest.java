package com.marvel.backend.story;

import com.marvel.backend.stories.domain.Story;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class StoriesTest {

    @Autowired
    private CharacterStoriesRepository characterStoriesRepository;

    @Test
    public void shouldBeSavedCharacter() {
        Story story = new Story();
        story.setTitle("Lorem ipsum");
        story.setDescription("Lorem ipsum dolor sit amet");
        story.setType("Test");

        characterStoriesRepository.save(story);

        Story storySaved = characterStoriesRepository.findByName("Lorem ipsum").orElse(null);

        assertThat(storySaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidStory() {
        Story story = new Story();
        story.setTitle("");

        fail("Story title cannot be blank", characterStoriesRepository.save(story));
    }

    @Test
    public void shouldBeNotSavedRepeatedStory() {
        Story storyTest = characterStoriesRepository.findById(1).orElse(null);;

        fail("Story title cannot be repeated", characterStoriesRepository.save(storyTest));
    }

}
