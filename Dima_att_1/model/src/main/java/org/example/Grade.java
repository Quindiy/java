package org.example;

public class Grade {
    private Integer id;
    private Integer estimation;
    private Integer subjectId;
    private Integer studentId;
    private Integer universityId;

    public Grade() {
    }

    public Grade(Integer id, Integer estimation, Integer subjectId, Integer studentId, Integer universityId) {
        this.id = id;
        this.estimation = estimation;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.universityId = universityId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEstimation() {
        return estimation;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", estimation=" + estimation +
                ", subjectId=" + subjectId +
                ", studentId=" + studentId +
                ", universityId=" + universityId +
                '}';
    }
}
