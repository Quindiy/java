package org.example;

import java.util.List;

public class Student {
    private Integer id;
    private Integer course;
    private String fio;
    private String mail;
    private List<Grade> grades;

    private Integer univercityId;

    public Student() {
    }

    public Student(Integer id, Integer course, String fio, String mail, List<Grade> grades, Integer univercityId) {
        this.id = id;
        this.course = course;
        this.fio = fio;
        this.mail = mail;
        this.grades = grades;
        this.univercityId = univercityId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCourse() {
        return course;
    }

    public String getFio() {
        return fio;
    }

    public String getMail() {
        return mail;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public Integer getUnivercityId() {
        return univercityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", course=" + course +
                ", fio='" + fio + '\'' +
                ", mail='" + mail + '\'' +
                ", grades=" + grades +
                ", univercityId=" + univercityId +
                '}';
    }
}
