package com.example.obis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_id_seq")
    @SequenceGenerator(name = "teacher_id_seq", sequenceName = "teacher_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "MAJOR")
    private String major;

    @Column(name = "SALARY")
    private Integer salary;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private Integer phone_number;
}
