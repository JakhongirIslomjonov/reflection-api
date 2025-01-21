package uz.dev;

import lombok.ToString;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        /*Constructor<Person> constructor = personClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person person = constructor.newInstance();
        System.out.printf("person " + person);
//        System.out.printf("constructor" + constructor);*/

        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        Constructor<Person> fullDeclaredConstructor = personClass.getDeclaredConstructor(String.class, Integer.class);
        declaredConstructor.setAccessible(true);
        Person person = declaredConstructor.newInstance("John");
        System.out.printf("person :%s \n " , person);


        fullDeclaredConstructor.setAccessible(true);
        Person person1 = fullDeclaredConstructor.newInstance("Jony", 12);
        System.out.printf("person1 :" + person1);

    }
}

@ToString
class Person {

    private Person() {

    }

    private Person(String name) {
        this.name = name;
    }

    private Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private Integer age;
}
