package com.marvel.backend.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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

    @NotBlank(message = "Event name cannot be blank")
    @UniqueElements(message = "Event name be repeated")
    private String name;

    private String description;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @NotBlank(message = "Event start cannot be blank")
    @Timestamp
    @Column(name = "start_event")
    private Date start;

    @Timestamp
    @Column(name = "end_event")
    private Date end;

}
