package com.marvel.backend.character.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "character_comic")
public class CharacterComic implements Serializable {

    @Id
    @Column(name = "character_id")
    private Integer characterId;

    @Id
    @Column(name = "comic_id")
    private Integer comicId;
}
