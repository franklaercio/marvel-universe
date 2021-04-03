package com.marvel.backend.character;

import com.marvel.backend.character.domain.CharacterDTO;
import com.marvel.backend.character.infrastructure.CharacterRepository;
import com.marvel.backend.character.infrastructure.CharacterService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class CharacterServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterRepository characterRepository;

    private CharacterService characterService = Mockito.mock(CharacterService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.characterService = new CharacterService(characterRepository);
    }

    @Test
    void whenFindCharacterWithoutParamsShouldBeReturnResults() {
        List<CharacterDTO> characters = this.characterService.findAll();
        assertThat(characters).asList().isNotNull();
    }

    @Test
    void whenFindCharacterHulkShouldBeReturnOneResult() {
        //Character character = this.characterService.findAll("Hulk");
        //assertThat(character).isNotNull();
        fail("Not implemented");
    }

    @Test
    void whenFindCharacterNotSavedShouldBeReturnNull() {
        //Character character = this.characterService.characters("Lorem Ipsum");
        // assertThat(character).isNull();
        fail("Not implemented");
    }
}
