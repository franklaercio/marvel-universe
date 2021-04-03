package com.marvel.backend.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Cacheable
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "series")
public class Series implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @SequenceGenerator(name = "series_generator", sequenceName = "series_seq", allocationSize = 1)
    private UUID id;

    @NotBlank(message = "Series title cannot be blank")
    @UniqueElements(message = "Series title be repeated")
    private String title;

    private String description;

    @NotBlank(message = "Series start year cannot be blank")
    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    private String rating;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
