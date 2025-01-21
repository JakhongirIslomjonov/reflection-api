package uz.dev;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        TextService textService = new TextService();
        Class<TextService> textServiceClass = TextService.class;
/*
//        Method[] methods = textServiceClass.getMethods();
        Method[] declaredMethods = textServiceClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.printf("method  : " + declaredMethod);
        }
        Method print1 = textServiceClass.getDeclaredMethod("print");
        print1.setAccessible(true);
        System.out.println(print1.invoke(textService));
*/

        Method print = textServiceClass.getDeclaredMethod("print", String.class);
        print.setAccessible(true);
        Object invoke = print.invoke(textService, "Salom  bu argument");
        System.out.printf("invoke : " + invoke);
    }

}

class TextService {
    private void print() {
        System.out.println("Hello world");
    }

    private void print(String s) {
        System.out.printf("Hello from %s\n", s);
    }
}
