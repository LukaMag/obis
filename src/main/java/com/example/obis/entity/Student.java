package com.example.obis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @SequenceGenerator(name = "student_id_seq", sequenceName = "student_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "INN")
    private Integer inn;

    @Column(name = "COURSE")
    private Integer course;

    @Column(name = "GROUP_NAME")
    private String group_name;

    @Column(name = "PHONE_NUMBER")
    private Integer phone_number;
}
