package com.marvel.backend.series.infrastructure;

import com.marvel.backend.series.domain.Series;
import com.marvel.backend.series.domain.SeriesDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeriesService {

    SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<SeriesDTO> findByCharacterId(Integer characterId) {
        Iterable<Series> savedSeries = seriesRepository.findByCharacterId(characterId);
        List<SeriesDTO> series = new ArrayList<>();

        savedSeries.forEach(i -> series.add(populateSeriesDTO(i)));

        return series;
    }

    private SeriesDTO populateSeriesDTO(Series series) {
        SeriesDTO seriesDTO = new SeriesDTO();

        seriesDTO.setId(series.getId());
        seriesDTO.setTitle(series.getTitle());
        seriesDTO.setDescription(series.getDescription());
        seriesDTO.setStartYear(series.getStartYear());
        seriesDTO.setEndYear(series.getEndYear());
        seriesDTO.setRating(series.getRating());
        seriesDTO.setModified(series.getModified());
        seriesDTO.setResourceURI("/v1/public/characters/" + series.getId() + "/series");

        return seriesDTO;
    }
}
