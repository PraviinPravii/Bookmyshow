package com.example.bookmyshow.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(){
        super("Invalid user id");
    }
}
