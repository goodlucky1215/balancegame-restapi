package com.example.balancegame.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BackendException extends Exception {
    String errorCode;

    public BackendException(String message) {
        super(message);
    }

    public BackendException(String head, Throwable cause) {
        super(head + ", " + cause.getMessage(), cause);
    }

    public BackendException(String errorCode, String head, Throwable cause) {
        super(head + ", " + cause.getMessage(), cause);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode == null ? super.getMessage() : "[" + this.errorCode + "] " + super.getMessage();
    }
}