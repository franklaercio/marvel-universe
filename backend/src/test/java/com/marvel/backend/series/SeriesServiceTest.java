package com.marvel.backend.series;

import com.marvel.backend.series.infrastructure.SeriesRepository;
import com.marvel.backend.series.infrastructure.SeriesService;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class SeriesServiceTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private SeriesRepository seriesRepository;

    private SeriesService seriesService = Mockito.mock(SeriesService.class);

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        this.seriesService = new SeriesService(seriesRepository);
    }

    @Test
    void whenFindCharacterSeriesWithId1ShouldBeReturnResult() {
        //Character character = this.seriesService.charactersSeriess(1);
        fail("Not implemented");
    }

    @Test
    void whenFindCharacterSeriesNotSavedShouldBeReturnNull() {
        //Character character = this.seriesService.charactersSeriess(100);
        //assertThat(character).isNull();
        fail("Not implemented");
    }
}
