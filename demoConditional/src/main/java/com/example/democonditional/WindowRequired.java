package com.example.democonditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.concurrent.locks.Condition;

public class WindowRequired implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // Nếu OS ra window trả ra true.
        return System.getProperty("os.name").toLowerCase().contains("win");
    }
}
