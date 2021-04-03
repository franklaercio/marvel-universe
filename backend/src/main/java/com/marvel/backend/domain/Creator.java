package com.marvel.backend.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
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
@Table(name = "creator")
public class Creator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creator_generator")
    @SequenceGenerator(name = "creator_generator", sequenceName = "creator_seq", allocationSize = 1)
    private UUID id;

    @NotBlank(message = "Creator name cannot be blank")
    private String name;

    @Timestamp
    @LastModifiedDate
    private Date modified;

}
