package com.roisoftstudio.api.login;

import com.roisoftstudio.domain.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Inject
    private LoginService loginService;

    @RequestMapping(value = "/", method = POST)
    public AuthToken getAllScores(@RequestBody LoginCredentials loginCredentials) {
        AuthToken authToken = loginService.login(loginCredentials);
        if (authToken == null) {
            throw new CredentialsException("Invalid Credentials");
        }
        return authToken;
    }
}