package com.hunglp.basicspecification.domain.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table
@Entity
@Data
public class OperatingSystem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String version;

    private String kernel;

    private LocalDateTime releaseDate;

    private int usages;




}
