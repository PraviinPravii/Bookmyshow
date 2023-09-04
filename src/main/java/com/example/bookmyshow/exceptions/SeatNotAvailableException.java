package com.example.bookmyshow.exceptions;

public class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(){
        super("Seat not available");
    }
}
