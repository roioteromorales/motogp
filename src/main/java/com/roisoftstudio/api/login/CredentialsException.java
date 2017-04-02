package com.roisoftstudio.api.login;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(value = BAD_REQUEST)
public class CredentialsException extends RuntimeException {
    public CredentialsException(String message) {
        super(message);
    }
}
