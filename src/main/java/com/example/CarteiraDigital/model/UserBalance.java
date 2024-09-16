package com.example.CarteiraDigital.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserBalance{
    private final User user;
    private double balance;


}
