package com.marvel.backend.event.domain;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class EventDTO {

    private Integer id;

    private String name;

    private String description;

    private String modified;

    private String start;

    private String end;

    private String resourceURI;

    public void setModified(Date modified) {
        this.modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(modified);
    }

    public void setStart(Date start) {
        this.start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(start);
    }

    public void setEnd(Date end) {
        this.end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(end);
    }
}
