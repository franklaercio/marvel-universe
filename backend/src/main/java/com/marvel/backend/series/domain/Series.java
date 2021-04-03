package com.marvel.backend.series.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "series")
public class Series implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @SequenceGenerator(name = "series_generator", sequenceName = "series_seq", allocationSize = 1)
    private Integer id;

    @NotBlank(message = "Series title cannot be blank")
    private String title;

    private String description;

    @NotNull(message = "Series start year cannot be blank")
    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    private String rating;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
