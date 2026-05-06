package com.example.gestiondestaches.dto;

import  lombok.AllArgsConstructor;
import  lombok.Data;

@AllArgsConstructor
@Data

public class AuthResponse {

    private  String Token;
    private  String email;
    private  String name;

}


