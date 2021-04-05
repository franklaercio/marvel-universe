package com.marvel.backend.character.domain;

import com.marvel.backend.global.domain.EntityDefaultResponse;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class CharacterDTO {

    @NotNull(message = "Id cannot be null")
    private Integer id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    private String description;

    private String modified;

    private String resourceURI;

    private EntityDefaultResponse comics;

    private EntityDefaultResponse series;

    private EntityDefaultResponse stories;

    private EntityDefaultResponse events;

    public void setModified(Date modified) {
        this.modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(modified);
    }

}
