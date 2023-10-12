package org.example;

import java.util.List;

public class Subject {
    private Integer id;
    private String name;
    private List<Integer> instructorIds;


    public Subject() {
    }

    public Subject(Integer id, String name, List<Integer> instructorIds) {
        this.id = id;
        this.name = name;
        this.instructorIds = instructorIds;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getInstructorIds() {
        return instructorIds;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instructorIds=" + instructorIds +
                '}';
    }
}
