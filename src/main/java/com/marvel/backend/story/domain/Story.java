package com.marvel.backend.story.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
@Cacheable
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "story")
public class Story implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "story_generator")
    @SequenceGenerator(name = "story_generator", sequenceName = "story_seq", allocationSize = 1)
    private Integer id;

    @NotBlank(message = "Story title cannot be blank")
    private String title;

    private String description;

    private String type;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    @Override
    public String toString() {
        return this.title;
    }

}
