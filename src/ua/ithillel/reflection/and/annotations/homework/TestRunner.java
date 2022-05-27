package ua.ithillel.reflection.and.annotations.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

    static void run(Class<?> testClass) {

        try {
            List<Method> setUpMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(BeforeSuite.class))
                    .toList();
            if (setUpMethods.size() > 1) throw new RuntimeException("BeforeSuite annotation must in a single.");

            List<Method> tearDownMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(AfterSuite.class))
                    .toList();
            if (tearDownMethods.size() > 1) throw new RuntimeException("AfterSuite annotation must in a single.");

            Object testObject = testClass.getConstructor().newInstance();
            if (setUpMethods.size() == 1) setUpMethods.get(0).invoke(testObject);

            List<Method> testMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(Test.class))
                    .sorted(Comparator.comparingInt(o -> o.getAnnotation(Test.class).order()))
                    .toList();

            for (Method method : testMethods) {
                method.invoke(testObject);
            }

            if (tearDownMethods.size() == 1) tearDownMethods.get(0).invoke(testObject);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Something went wrong during test execution.", e);
        }

    }

}
