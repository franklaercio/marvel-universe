package com.marvel.backend.character;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterRepository characterepository;

    private CharacterService characterService = Mockito.mock(CharacterService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.characterService = new CharacterService(characterepository);
    }

    @Test
    void whenFindCharacterWithoutParamsShouldBeReturnResults() {
        Optional<Character> characters = this.characterService.characters();
        assertThat(characters).asList().isNotNull();
    }

    @Test
    void whenFindCharacterHulkShouldBeReturnOneResult() {
        Character character = this.characterService.characters("Hulk");
        assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterNotSavedShouldBeReturnNull() {
        Character character = this.characterService.characters("Lorem Ipsum");
        assertThat(character).isNull();
    }
}
