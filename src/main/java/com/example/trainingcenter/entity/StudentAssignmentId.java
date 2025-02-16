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
public class StudentAssignmentId implements Serializable {
    private static final long serialVersionUID = 2009650634941029411L;
    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @Column(name = "assignment_id", nullable = false)
    private Integer assignmentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentAssignmentId entity = (StudentAssignmentId) o;
        return Objects.equals(this.studentId, entity.studentId) &&
                Objects.equals(this.assignmentId, entity.assignmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, assignmentId);
    }

}