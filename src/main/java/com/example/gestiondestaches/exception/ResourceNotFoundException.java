package com.example.gestiondestaches.exception;

public class ResourceNotFoundException  extends RuntimeException{

    public  ResourceNotFoundException (String message){
        super(message);
    }
}
