package com.marvel.backend.series.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class SeriesDTO {

    @NotNull(message = "Id cannot be null")
    private Integer id;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    private String description;

    private Integer startYear;

    private Integer endYear;

    private String rating;

    private String modified;

    private String resourceURI;

    public void setModified(Date modified) {
        this.modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(modified);
    }
}
