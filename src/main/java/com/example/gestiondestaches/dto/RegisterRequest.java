package com.example.gestiondestaches.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data


public class RegisterRequest {

   @NotBlank(message = "Name is required")
    private String name ;

   @NotBlank(message = "Email is required")
    @Email(message = "email invalide")

    private String email;

   @NotBlank(message = "passwore is required")
    @Size(min =6 , message = "Password must be at least 6 characters")
    private  String password;


}
