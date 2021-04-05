package com.marvel.backend.character;

import com.marvel.backend.character.domain.CharacterDTO;
import com.marvel.backend.character.infrastructure.CharacterService;
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
public class CharacterServiceTest {

    @Autowired
    private Flyway flyway;

    @Mock
    private CharacterService characterService;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        MockitoAnnotations.openMocks(this);

        this.characterService = Mockito.mock(CharacterService.class);
    }

    @Test
    void whenFindCharacterWithoutParamsShouldBeReturnResults() {
        List<CharacterDTO> list = characterService.findAll("%", "");

        assertThat(list).isNotNull();

        verify(this.characterService, times(1)).findAll("%", "");
    }

    @Test
    void whenFindCharacterHulkShouldBeReturnOneResult() {
        List<CharacterDTO> list = characterService.findAll("Hulk", "");

        assertThat(list).isNotNull();

        verify(this.characterService, times(1)).findAll("Hulk", "");
    }

    @Test
    void whenFindCharacterNotSavedShouldBeReturnEmpty() {
        List<CharacterDTO> list = characterService.findAll("", "");

        assertThat(list).isEmpty();

        verify(this.characterService, times(1)).findAll("", "");
    }

    @Test
    void whenFindCharacterByIdShouldBeReturnOneResult() {
        characterService.findByCharacterId(1);

        verify(this.characterService, times(1)).findByCharacterId(1);
    }
}
