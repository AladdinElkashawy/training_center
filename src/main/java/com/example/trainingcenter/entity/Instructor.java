package com.example.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_id_gen")
    @SequenceGenerator(name = "instructor_id_gen", sequenceName = "instructor_instructor_id_seq", allocationSize = 1)
    @Column(name = "instructor_id", nullable = false)
    private Integer id;

    @Column(name = "biography", length = Integer.MAX_VALUE)
    private String biography;

}