package com.marvel.backend.characterSeries;

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
public class CharacterSeriesServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private CharacterSeriesRepository charactereSeriespository;

    private CharacterSeriesService characterSeriesService = Mockito.mock(CharacterSeriesService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.characterSeriesService = new CharacterSeriesService(charactereSeriespository);
    }

    @Test
    void whenFindCharacterSeriesWithId1ShouldBeReturnResult() {
        Character character = this.characterSeriesService.charactersSeriess(1);
        assertThat(character).isNotNull();
    }

    @Test
    void whenFindCharacterSeriesNotSavedShouldBeReturnNull() {
        Character character = this.characterSeriesService.charactersSeriess(100);
        assertThat(character).isNull();
    }
}
