package com.marvel.backend.comic.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class ComicDTO {

    @NotNull(message = "Id cannot be null")
    private Integer id;

    private Integer digitalId;

    @NotBlank(message = "Title cannot be blank")
    private String Tittle;

    private String variantDescription;

    private String modified;

    private String isbn;

    private String upc;

    private String diamondCode;

    private String ean;

    private String issn;

    private String format;

    private Integer pageCount;

    private String resourceURI;

    public void setModified(Date modified) {
        this.modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(modified);
    }
}
