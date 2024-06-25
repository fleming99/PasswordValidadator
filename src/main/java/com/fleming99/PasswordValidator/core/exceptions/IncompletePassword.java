package com.fleming99.PasswordValidator.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IncompletePassword extends RuntimeException {

    public IncompletePassword(String message) {
        super(message + " Password needs to contain: minimum of 8 characters, maximum of 16 characters, 1 uppercase letter, 1 lowercase letter, 1 special character and 1 number");
    }
}
