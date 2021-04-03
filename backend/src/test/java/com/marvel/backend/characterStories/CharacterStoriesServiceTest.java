package com.marvel.backend.characterStories;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterStoriesServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterStoriesRepository charactereStoriespository;
    private CharacterStoriesService characterStoriesService = Mockito.mock(CharacterStoriesService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();
        this.characterStoriesService = new CharacterStoriesService(charactereStoriespository);
    }

    @Test
    void whenFindCharacterStoriesWithId1ShouldBeReturnResult() {
        Character character = this.characterStoriesService.charactersStoriess(1);
        assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterStoriesNotSavedShouldBeReturnNull() {
        Character character = this.characterStoriesService.charactersStoriess(100);
        assertThat(character).isNull();
    }
}
