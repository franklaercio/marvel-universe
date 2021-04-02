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
@Table(name = "story")
public class Story implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "story_generator")
    @SequenceGenerator(name = "story_generator", sequenceName = "story_seq", allocationSize = 1)
    private UUID id;

    private String title;

    private String description;

    @Column(name = "resource_uri")
    private String resourceURI;

    private String type;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    private String thumbnail;
}
