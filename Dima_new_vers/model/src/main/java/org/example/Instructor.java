package org.example;

import java.util.List;

public class Instructor {
    private Integer id;
    private String fio;
    private String mail;
    private List<Subject> subjects;
    private Integer universityId;

    public Instructor() {
    }

    public Instructor(Integer id, String fio, String mail, List<Subject> subjects, Integer universityId) {
        this.id = id;
        this.fio = fio;
        this.mail = mail;
        this.subjects = subjects;
        this.universityId = universityId;
    }

    public Integer getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getMail() {
        return mail;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", mail='" + mail + '\'' +
                ", subjects=" + subjects +
                ", universityId=" + universityId +
                '}';
    }
}
