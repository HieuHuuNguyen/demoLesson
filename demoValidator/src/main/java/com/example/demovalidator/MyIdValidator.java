package com.example.demovalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyIdValidator implements ConstraintValidator<MyId, String> {
    private static final String MY_PREFIX = "my://";

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.isEmpty()) return false;

        return s.startsWith(MY_PREFIX);
    }
}
