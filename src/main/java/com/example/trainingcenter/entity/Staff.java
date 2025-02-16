package com.example.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_id_gen")
    @SequenceGenerator(name = "staff_id_gen", sequenceName = "staff_staff_id_seq", allocationSize = 1)
    @Column(name = "staff_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "job_position", length = 50)
    private String jobPosition;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

}