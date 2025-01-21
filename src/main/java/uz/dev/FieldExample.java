package uz.dev;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class FieldExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student(3, true, LocalDate.of(1994, 2, 3), "Ali");

      /*  System.out.printf("birthDate" + student.birthDate);
        System.out.printf("married" + student.married);
        System.out.printf("Student :" + student);*/

       /* Class<? extends Student> studentClass = student.getClass();
        String name = studentClass.getName();

        Field[] fields = studentClass.getFields();
        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/
       /* Class<? extends Student> studentClass = Student.class;
        Field firstName = studentClass.getDeclaredField("firstName");
        Object objectFirstName = firstName.get(student);
        firstName.setAccessible(true);
        System.out.println(objectFirstName);
        firstName.set(student, "Yangi qiymat ");
        objectFirstName =firstName.get(student);
        System.out.println(objectFirstName);*/

        Class<Student> studentClass = Student.class;
        Field courseNumber = studentClass.getDeclaredField("courseNumber");
        courseNumber.setAccessible(true);
        courseNumber.set(student, 12);
        Object objectCourseNumber = courseNumber.get(student);
        System.out.printf("courseNumber : " + objectCourseNumber);

    }
}

class Student {

    private String firstName;

    public LocalDate birthDate;

    boolean married;

    public final int courseNumber;

    public Student(int courseNumber, boolean married, LocalDate birthDate, String firstName) {
        this.courseNumber = courseNumber;
        this.married = married;
        this.birthDate = birthDate;
        this.firstName = firstName;
    }
}
