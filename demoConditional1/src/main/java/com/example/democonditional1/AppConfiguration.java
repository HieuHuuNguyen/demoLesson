package com.example.democonditional1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public static class SomeBean{
    }

    @ConditionalOnWindow
    @Bean
     SomeBean someBean(){
        return new SomeBean();
    }
}
