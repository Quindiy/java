package org.example;

import java.util.List;

public class University {
    private Integer id;
    private String name;
    private List<Student> students;
    private List<Instructor> instructors;



    public University() {
    }

    public University(Integer id, String name, List<Student> students, List<Instructor> instructors) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.instructors = instructors;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                ", instructors=" + instructors +
                '}';
    }
}