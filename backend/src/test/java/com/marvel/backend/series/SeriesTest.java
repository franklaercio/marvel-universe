package com.marvel.backend.series;

import com.marvel.backend.series.domain.Series;
import com.marvel.backend.series.infrastructure.SeriesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@AutoConfigureMockMvc
public class SeriesTest {

    @Mock
    private SeriesRepository seriesRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldBeSavedSeries() {
        Series series = Mockito.mock(Series.class);
        series.setTitle("Lorem ipsum");
        series.setDescription("Lorem ipsum dolor sit amet");
        series.setStartYear(2021);
        series.setEndYear(2021);

        seriesRepository.save(series);

        assertThat(series.getId()).isNotNull();

        verify(seriesRepository, times(1)).save(series);
    }

    @Test
    public void shouldBeNotSavedInvalidSeries() {
        Series series = new Series();
        series.setTitle("");

        seriesRepository.save(series);

        assertThat(series.getId()).isNull();

        verify(seriesRepository, times(1)).save(series);
    }

    @Test
    public void shouldBeNotSavedInvalidSeriesStartYear() {
        Series series = new Series();
        series.setTitle("Lorem ipsum");

        seriesRepository.save(series);

        assertThat(series.getId()).isNull();

        verify(seriesRepository, times(1)).save(series);
    }

}
