package uz.dev;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Main {
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




    }
}