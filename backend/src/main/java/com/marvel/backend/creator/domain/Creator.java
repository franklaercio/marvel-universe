package com.marvel.backend.creator.domain;

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
@Table(name = "creator")
public class Creator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creator_generator")
    @SequenceGenerator(name = "creator_generator", sequenceName = "creator_seq", allocationSize = 1)
    private Integer id;

    @NotBlank(message = "Creator name cannot be blank")
    private String name;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
