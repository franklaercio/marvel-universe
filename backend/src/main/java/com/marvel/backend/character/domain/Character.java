package com.marvel.backend.character.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "character")
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_generator")
    @SequenceGenerator(name = "character_generator", sequenceName = "character_seq", allocationSize = 1)
    private Integer id;

    @NotBlank(message = "Character name cannot be blank")
    private String name;

    private String description;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    public Character() {}

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
