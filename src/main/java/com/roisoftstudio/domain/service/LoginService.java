package com.roisoftstudio.domain.service;

import com.roisoftstudio.api.login.AuthToken;
import com.roisoftstudio.api.login.LoginCredentials;
import com.roisoftstudio.data.login.LoginRepository;
import com.roisoftstudio.domain.model.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Service
public class LoginService {

    private LoginRepository loginRepository;

    @Inject
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public AuthToken login(LoginCredentials loginCredentials) {
        String email = loginCredentials.getEmail();
        if (isNotEmpty(email)) {
            User user = loginRepository.getUser(email);
            if (user != null) {
                return new AuthToken(user.getId());
            }
        }
        return null;

    }
}
