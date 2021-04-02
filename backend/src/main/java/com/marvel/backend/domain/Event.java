package com.marvel.backend.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_generator")
    @SequenceGenerator(name = "event_generator", sequenceName = "event_seq", allocationSize = 1)
    private UUID id;

    private String name;

    private String description;

    @Column(name = "resource_uri")
    private String resourceURI;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @Timestamp
    @Column(name = "start_event")
    private Date start;

    @Timestamp
    @Column(name = "end_event")
    private Date end;

    private String thumbnail;
}
