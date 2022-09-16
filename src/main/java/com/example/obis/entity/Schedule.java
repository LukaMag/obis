package com.example.obis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
@Getter
@Setter
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @SequenceGenerator(name = "student_id_seq", sequenceName = "student_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "SUBJ_ID")
    private Integer subj_id;

    @Column(name = "STUDENT_ID")
    private Integer student_id;

    @Column(name = "TEACHER_ID")
    private Integer teacher_id;

    @Column(name = "CABINET")
    private Integer cabinet;

    @Column (name = "STUDENT_STATUS")
    private boolean student_status = Boolean.FALSE;
}
