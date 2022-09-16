package com.example.obis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_id_seq")
    @SequenceGenerator(name = "subject_id_seq", sequenceName = "subject_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;
}
