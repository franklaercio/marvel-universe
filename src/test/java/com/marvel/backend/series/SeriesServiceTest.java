package com.marvel.backend.series;

import com.marvel.backend.series.domain.SeriesDTO;
import com.marvel.backend.series.infrastructure.SeriesService;
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
public class SeriesServiceTest {

    @Autowired
    private Flyway flyway;

    @Mock
    private SeriesService seriesService;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();

        MockitoAnnotations.openMocks(this);

        this.seriesService = Mockito.mock(SeriesService.class);
    }

    @Test
    void whenFindCharacterSeriesWithId1ShouldBeReturnResult() {
        List<SeriesDTO> list = seriesService.findByCharacterId(1);

        assertThat(list).isNotNull();

        verify(this.seriesService, times(1)).findByCharacterId(1);
    }

    @Test
    void whenFindCharacterSeriesNotSavedShouldBeReturnEmpty() {
        List<SeriesDTO> list = seriesService.findByCharacterId(1);

        assertThat(list).isEmpty();

        verify(this.seriesService, times(1)).findByCharacterId(1);
    }
}
