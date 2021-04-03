package com.marvel.backend.series.infrastructure;

import org.springframework.stereotype.Service;

@Service
public class SeriesService {

    SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }
}
