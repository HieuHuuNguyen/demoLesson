package com.example.democonfigurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoConfigurationPropertiesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigurationPropertiesApplication.class, args);
    }

    @Autowired MyAppProperties myAppProperties;

    public void run(String... args) throws Exception{
        System.out.println("Global variable: ");
        System.out.println("\t Email: "+myAppProperties.getEmail());
        System.out.println("\t GA ID: "+myAppProperties.getId());
    }
}
