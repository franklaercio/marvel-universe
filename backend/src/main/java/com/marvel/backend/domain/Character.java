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
@Table(name = "character")
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_generator")
    @SequenceGenerator(name = "character_generator", sequenceName = "character_seq", allocationSize = 1)
    private UUID id;

    @NotBlank(message = "Character name cannot be blank")
    @UniqueElements(message = "Character name cannot be repeated")
    private String name;

    private String description;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
