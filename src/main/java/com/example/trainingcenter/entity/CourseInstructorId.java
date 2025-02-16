package com.example.trainingcenter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CourseInstructorId implements Serializable {
    private static final long serialVersionUID = 710844925452834740L;
    @Column(name = "instructor_id", nullable = false)
    private Integer instructorId;

    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CourseInstructorId entity = (CourseInstructorId) o;
        return Objects.equals(this.courseId, entity.courseId) &&
                Objects.equals(this.instructorId, entity.instructorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, instructorId);
    }

}