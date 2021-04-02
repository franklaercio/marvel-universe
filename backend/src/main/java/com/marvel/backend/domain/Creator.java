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
@Table(name = "creator")
public class Creator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creator_generator")
    @SequenceGenerator(name = "creator_generator", sequenceName = "creator_seq", allocationSize = 1)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    private String suffix;

    @Column(name = "full_name")
    private String fullName;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @Column(name = "resource_uri")
    private String resourceURI;

    private String thumbnail;
}
