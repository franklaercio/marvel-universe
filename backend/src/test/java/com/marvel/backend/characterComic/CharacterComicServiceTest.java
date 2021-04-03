package com.marvel.backend.characterComic;

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
public class CharacterComicServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterComicRepository charactereComicpository;

    private CharacterComicService characterComicService = Mockito.mock(CharacterComicService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.characterComicService = new CharacterComicService(charactereComicpository);
    }

    @Test
    void whenFindCharacterComicWithId1ShouldBeReturnResult() {
        Character character = this.characterComicService.charactersComics(1);
        assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterComicNotSavedShouldBeReturnNull() {
        Character character = this.characterComicService.charactersComics(100);
        assertThat(character).isNull();
    }
}
