package com.marvel.backend.event.domain;

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
@Table(name = "event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_generator")
    @SequenceGenerator(name = "event_generator", sequenceName = "event_seq", allocationSize = 1)
    private Integer id;

    @NotBlank(message = "Event name cannot be blank")
    private String name;

    private String description;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @NotNull(message = "Event start cannot be blank")
    @Timestamp
    @Column(name = "start_event")
    private Date start;

    @Timestamp
    @Column(name = "end_event")
    private Date end;

}
