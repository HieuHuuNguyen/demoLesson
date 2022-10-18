package com.example.demovalidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint( validatedBy = MyIdValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyId {
    String message() default "MyID must start with my id:  ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
