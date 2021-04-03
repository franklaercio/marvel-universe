package com.marvel.backend.series.infrastructure;

import com.marvel.backend.series.domain.Series;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SeriesRepository extends CrudRepository<Series, Integer> {

    @Query("FROM Series series WHERE upper(series.title) = upper(:title)")
    Optional<Series> findByTitle(String title);

    @Query("FROM Series s INNER JOIN CharacterSeries cs ON s.id = cs.seriesId WHERE cs.characterId = :characterId")
    List<Series> findByCharacterId(Integer characterId);
}
