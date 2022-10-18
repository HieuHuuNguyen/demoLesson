package com.example.demovalidator;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @MyId
    private String myId;
}
