package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private Integer count;

    private String[] subjects_names = {"Physics", "Russian", "English", "German", "Mathematics", "Linear_Algebra", "Programming"};
    public Generator(Integer count) {
        this.count = count;
    }

    public Generator(Integer count, String[] subjects_names) {
        this.count = count;
        this.subjects_names = subjects_names;
    }

    public List<University> randomGenerations() {

        List<University> universities = new ArrayList<>();



        for (int i = 0; i < count; i++) {
            List<Student> students = new ArrayList<>();


            for (int j = 0; j < new Random().nextInt(5)+5; j++) {
                List<Grade> grades = new ArrayList<>();

                for (int k = 0; k < new Random().nextInt(5)+5; k++) {
                    grades.add(
                            new Grade(
                                    (i+1)*(j+1)*(k+1),
                                    new Random().nextInt(3)+2,
                                    new Random().nextInt(subjects_names.length),
                                    (i+1)*(j+1),
                                    i
                            )
                    );
                }
                students.add(
                        new Student(
                                (i+1)*(j+1),
                                new Random().nextInt(7)+1,
                                "fio_"+(i+1)*(j+1),
                                "mail"+(i+1)*(j+1)+"@mail.ru",
                                grades,
                                i

                        )
                );
            }

            List<Instructor> instructors = new ArrayList<>();
            for (int j = 0; j < new Random().nextInt(15)+3; j++) {
                List<Subject> subjects = new ArrayList<>();
                for (int k = 0; k < new Random().nextInt(subjects_names.length)+1; k++) {
                    subjects.add(
                            new Subject(
                                    k,
                                    subjects_names[k],
                                    List.of((i+1)*(j+1))
                            )
                    );
                }
                instructors.add(
                        new Instructor(
                                (i+1)*(j+1),
                                "fio_"+(i+1)*(j+1),
                                "mail"+(i+1)*(j+1)+"@mail.ru",
                                subjects,
                                i
                        )
                );
            }
            universities.add(
                    new University(
                            i,
                            "Univercity_"+i,
                            students,
                            instructors
                    )
            );
        }

        return universities;
    }
}
