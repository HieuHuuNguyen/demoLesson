package com.example.democonfigurationproperties1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@PropertySource("classpath:my.yml")
@ConfigurationProperties(prefix = "my")
public class MyAppProperties {
    private String email;
    private String googleAnalysticsId;

    private List<String> author;
    private Map<String, String> myMap;
}
