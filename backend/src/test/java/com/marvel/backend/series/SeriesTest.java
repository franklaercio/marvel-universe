package com.marvel.backend.series;

import com.marvel.backend.domain.Series;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class SeriesTest {

    @Autowired
    private CharacterSeriesRepository characterSeriesRepository;

    @Test
    public void shouldBeSavedSeries() {
        Series series = new Series();
        series.setTitle("Lorem ipsum");
        series.setDescription("Lorem ipsum dolor sit amet");
        series.setStartYear(2021);
        series.setEndYear(2021);

        characterSeriesRepository.save(series);

        Series seriesSaved = characterSeriesRepository.findByTitle("Lorem ipsum").orElse(null);

        assertThat(seriesSaved).isNotNull();
    }

    @Test
    public void shouldBeNotSavedInvalidSeries() {
        Series series = new Series();
        series.setTitle("");

        fail("Series name cannot be blank", characterSeriesRepository.save(character));
    }

    @Test
    public void shouldBeNotSavedInvalidSeriesStartYear() {
        Series series = new Series();
        series.setTitle("Lorem ipsum");

        fail("Series start year cannot be blank", characterSeriesRepository.save(character));
    }

    @Test
    public void shouldBeNotSavedRepeatedSeries() {
        Series seriesTest = characterSeriesRepository.findById(1).orElse(null);;

        fail("Series name cannot be repeated", characterSeriesRepository.save(seriesTest));
    }
}
