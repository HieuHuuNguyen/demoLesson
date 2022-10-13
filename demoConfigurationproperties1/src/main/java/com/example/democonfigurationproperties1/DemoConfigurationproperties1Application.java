package com.example.democonfigurationproperties1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConfigurationproperties1Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DemoConfigurationproperties1Application.class, args);
    }

    @Autowired
    MyAppProperties myAppProperties;

    public void run(String... args) throws Exception{
        System.out.println("Global variable: ");
        System.out.println("\t Email: "+myAppProperties.getEmail());
        System.out.println("\t GA ID: "+myAppProperties.getGoogleAnalysticsId());
        System.out.println("\t Authors: " + myAppProperties.getAuthor());
        System.out.println("\t Example Map: " + myAppProperties.getMyMap());
    }

}
