package com.example.CarteiraDigital.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private final String fullName;
    private final String cpf;
    private final String email;
    private final String password;
    private final UserType type;
}
