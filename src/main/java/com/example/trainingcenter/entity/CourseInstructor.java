package com.example.trainingcenter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "course_instructor")
public class CourseInstructor {
    @SequenceGenerator(name = "course_instructor_id_gen", sequenceName = "courses_course_id_seq", allocationSize = 1)
    @EmbeddedId
    private CourseInstructorId id;

    @MapsId("instructorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;

    @MapsId("courseId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

}