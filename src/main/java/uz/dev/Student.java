package uz.dev;

import java.time.LocalDate;

public class Student {

    private String firstName;

    public LocalDate birthDate;

    boolean married;

    private final  int courseNumber;

    public Student(int courseNumber, boolean married, LocalDate birthDate, String firstName) {
        this.courseNumber = courseNumber;
        this.married = married;
        this.birthDate = birthDate;
        this.firstName = firstName;
    }
}
