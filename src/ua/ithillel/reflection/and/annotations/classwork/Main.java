package ua.ithillel.reflection.and.annotations.classwork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        demo8(null);
    }

    static void demo1(Object obj) {
        Class<? extends String> stringClass = "Hello, world!".getClass();
        Class<?> aClass = obj.getClass();
        Class<String> stringClass1 = String.class;
        Class<int[]> intArrayClass = int[].class;
    }

    static void demo2() {
        Class<? extends String> stringClass = "Hello, world!".getClass();
        // fully qualified name
        System.out.println("Full name: " + stringClass.getName());
        System.out.println("Simple name: " + stringClass.getSimpleName());
    }

    static void demo3() {
        Class<? extends String> stringClass = "Hello, world!".getClass();
        int modifiers = stringClass.getModifiers();

        if (Modifier.isFinal(modifiers)) {
            System.out.println("String is final class.");
        }
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("String is private class.");
        } else {
            System.out.println("String is not private class.");
        }
    }

    static void demo4() throws Exception {
        TestContainer container = new TestContainer("Hello, world!");
        System.out.println(container);

        Class<? extends TestContainer> aClass = container.getClass();

        List<Field> fields = Arrays.asList(aClass.getDeclaredFields());
        System.out.println(fields);

        Field valueField = aClass.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(container, valueField.get(container) + "!!");
        valueField.setAccessible(false);

        System.out.println(container);
    }

    static void demo5() throws Exception {
        Class<TestContainer> testContainerClass = TestContainer.class;
        Constructor<TestContainer> constructor = testContainerClass.getConstructor(Object.class);
        TestContainer testContainer = constructor.newInstance("Hello, world! Again!");
        System.out.println(testContainer);
    }

    static void demo5(Object obj) throws Exception {
        Class<?> testContainerClass = obj.getClass();
        if (testContainerClass.isAssignableFrom(String.class)) {
            Object cast = testContainerClass.cast(obj);
            Constructor<?> constructor = testContainerClass.getConstructor(String.class);
            Object o = constructor.newInstance("Hello, world! Again!");
            System.out.println(o);
        }
    }

    static void demo6() throws Exception {
        Class<TestContainer> testContainerClass = TestContainer.class;
        TestContainer testContainer = new TestContainer(true);
        List<Method> methods = Arrays.asList(testContainerClass.getDeclaredMethods());
        System.out.println(methods);
        methods.get(0).invoke(testContainer);
    }

    static void demo7(Object value) throws Exception {
        Constructor<TestContainer> constructor = TestContainer.class.getConstructor(Object.class);
        Parameter parameter = Arrays.asList(constructor.getParameters()).get(0);
        if (parameter.isAnnotationPresent(NonNull.class) && value == null) {
            NonNull annotation = parameter.getAnnotation(NonNull.class);
            throw new IllegalArgumentException(annotation.message());
        }
        TestContainer testContainer = constructor.newInstance(value);
        System.out.println(testContainer);
    }

    static void demo8(Object value) throws Exception {
        Constructor<TestContainer> constructor = TestContainer.class.getConstructor(Boolean.TYPE);
        Parameter parameter = Arrays.asList(constructor.getParameters()).get(0);
        if (parameter.isAnnotationPresent(NonNull.class) && value == null) {
            NonNull annotation = parameter.getAnnotation(NonNull.class);
            System.out.println(annotation);
            throw new IllegalArgumentException(annotation.value());
        }
        TestContainer testContainer = constructor.newInstance(value);
        System.out.println(testContainer);
    }
}
