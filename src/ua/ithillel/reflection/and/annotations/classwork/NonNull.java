package ua.ithillel.reflection.and.annotations.classwork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface NonNull {
    String message() default "Value cannot be null.";

    String value() default "Value cannot be null.";
}
