package com.marvel.backend.domain;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "comic")
public class Comic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comic_generator")
    @SequenceGenerator(name = "comic_generator", sequenceName = "comic_seq", allocationSize = 1)
    private UUID id;

    @Column(name = "digital_id")
    private Integer digitalId;

    private String title;

    @Column(name = "issue_number")
    private Integer issueNumber;

    @Column(name = "variant_description")
    private String variantDescription;

    @Timestamp
    @LastModifiedDate
    private Date modified;

    private String isbn;

    private String upc;

    @Column(name = "diamond_code")
    private String diamondCode;

    private String ean;

    private String issn;

    private String format;

    @Column(name = "page_count")
    private Integer pageCount;

    @Column(name = "resource_uri")
    private String resourceURI;

    private String thumbnail;
}
