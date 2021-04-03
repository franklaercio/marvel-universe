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
@Table(name = "story")
public class Story implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "story_generator")
    @SequenceGenerator(name = "story_generator", sequenceName = "story_seq", allocationSize = 1)
    private UUID id;

    @NotBlank(message = "Story title cannot be blank")
    @UniqueElements(message = "Story title cannot be repeated")
    private String title;

    private String description;

    private String type;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
