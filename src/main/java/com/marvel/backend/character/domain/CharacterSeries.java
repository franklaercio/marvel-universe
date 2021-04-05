package com.marvel.backend.character.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "character_series")
public class CharacterSeries implements Serializable {

    @Id
    @Column(name = "character_id")
    private Integer characterId;

    @Id
    @Column(name = "series_id")
    private Integer seriesId;
}
