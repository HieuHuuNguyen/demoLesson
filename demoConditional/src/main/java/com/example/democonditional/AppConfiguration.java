package com.example.democonditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public static class SomeBean{
    }

    /*
    SomeBean chỉ được tạo ra khi
    thỏa mãn điều kiện
     */
//    @Conditional(MacRequired.class)
//    @Conditional(WindowRequired.class)
//    @Conditional(WindowOrMacRequired.class)
    @ConditionalOnWindow
    @Bean
    SomeBean someBean(){
        return new SomeBean();
    }
}