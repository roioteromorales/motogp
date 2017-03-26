package com.roisoftstudio.domain.service;

import com.roisoftstudio.api.login.AuthToken;
import com.roisoftstudio.api.login.LoginCredentials;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Service
public class LoginService {
    public AuthToken login(LoginCredentials loginCredentials) {
        if (isNotEmpty(loginCredentials.getEmail())) {
            return new AuthToken("valid");
        } else {
            return null;
        }
    }
}
