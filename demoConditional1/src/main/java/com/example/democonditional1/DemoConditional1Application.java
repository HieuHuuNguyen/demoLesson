package com.example.democonditional1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoConditional1Application {

        public static void main(String[] args) {
            ApplicationContext context = SpringApplication.run(DemoConditional1Application.class, args);
            try {
                AppConfiguration.SomeBean someBean = context.getBean(AppConfiguration.SomeBean.class);
                System.out.println("SomeBean tồn tại!");
            } catch (Exception e) {
                System.out.println("SomeBean chỉ được tạo nếu chạy trên Window");
            }

        }

    }