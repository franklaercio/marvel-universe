package com.marvel.backend.character.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
public class CharacterDTO {

    @NotNull(message = "Id cannot be null")
    private Integer id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    private String description;

    private String modified;

    private String resourceURI;

    private List<CharacterComicDTO> comics;

    private List<CharacterSeriesDTO> series;

    private List<CharacterStoriesDTO> stories;

    private List<CharacterEventDTO> events;

    public void setModified(Date modified) {
        this.modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(modified);
    }

}
