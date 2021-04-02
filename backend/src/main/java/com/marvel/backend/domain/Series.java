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
@Table(name = "series")
public class Series implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @SequenceGenerator(name = "series_generator", sequenceName = "series_seq", allocationSize = 1)
    private UUID id;

    private String title;

    private String description;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    private String rating;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
