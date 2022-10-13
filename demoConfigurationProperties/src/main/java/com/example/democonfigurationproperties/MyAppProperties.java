package com.example.democonfigurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "hi")
public class MyAppProperties {
    private String email;
    private String Id;
}
