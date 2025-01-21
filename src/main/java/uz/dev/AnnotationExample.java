package uz.dev;

import lombok.ToString;

import java.lang.annotation.Annotation;

public class AnnotationExample {
    public static void main(String[] args) {
        Class<Animal> animalClass = Animal.class;
        Annotation[] declaredAnnotations = animalClass.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

    }
}

@ToString(callSuper = true)
class Animal {
    private String name;
}