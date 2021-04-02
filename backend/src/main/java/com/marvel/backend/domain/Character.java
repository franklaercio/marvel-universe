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
@Table(name = "character")
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_generator")
    @SequenceGenerator(name = "character_generator", sequenceName = "character_seq", allocationSize = 1)
    private UUID id;

    //@NotBlank(message = "Character name cannot be blank")
    private String name;

    private String description;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @Column(name = "resource_uri")
    private String resourceURI;

    //private String urls;

    private String thumbnail;
}
