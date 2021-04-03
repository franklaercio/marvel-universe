package com.marvel.backend.characterEvent;

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
public class CharacterEventServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterEventRepository charactereEventpository;

    private CharacterEventService characterEventService = Mockito.mock(CharacterEventService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.characterEventService = new CharacterEventService(charactereEventpository);
    }

    @Test
    void whenFindCharacterEventWithId1ShouldBeReturnResult() {
        Character character = this.characterEventService.charactersEvents(1);
        assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterEventNotSavedShouldBeReturnNull() {
        Character character = this.characterEventService.charactersEvents(100);
        assertThat(character).isNull();
    }
}
