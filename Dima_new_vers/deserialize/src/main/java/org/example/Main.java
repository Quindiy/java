package org.example;

import com.fasterxml.jackson.core.type.TypeReference;


import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> list = (List<University>) new Deserialazer("university.json", new TypeReference<List<University>>() {}).read();

        for (University u:list) {
            System.out.println(u.getId());
            System.out.println(u.getName());
            for (Student s: u.getStudents()) {
                System.out.println(s.getId());
                System.out.println(s.getFio());
                System.out.println(s.getCourse());
                System.out.println(s.getMail());
                System.out.println(s.getGrades());
                System.out.println(s.getUnivercityId());
                System.out.println();
            }
            for (Instructor i: u.getInstructors()) {
                System.out.println(i.getId());
                System.out.println(i.getFio());
                System.out.println(i.getMail());
                System.out.println(i.getSubjects());
                System.out.println(i.getUniversityId());
                System.out.println();
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }
}
