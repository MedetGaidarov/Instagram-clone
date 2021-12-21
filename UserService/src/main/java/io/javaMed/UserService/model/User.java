package io.javaMed.UserService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private String userName;
    private String password;
    private LocalDate BirthDay;
    private String anketa;
}
