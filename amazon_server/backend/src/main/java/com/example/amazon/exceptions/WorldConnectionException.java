package com.example.amazon.exceptions;

public class WorldConnectionException extends RuntimeException {
    public WorldConnectionException(String message) {
        super(message);
    }

    public WorldConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}