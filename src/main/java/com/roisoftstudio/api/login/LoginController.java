package com.roisoftstudio.api.login;

import com.roisoftstudio.domain.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.security.auth.login.CredentialException;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Inject
    private LoginService loginService;

    @RequestMapping(value = "/", method = POST)
    public AuthToken getAllScores(@RequestBody LoginCredentials loginCredentials, HttpServletResponse response) throws CredentialException {
        AuthToken authToken = loginService.login(loginCredentials);
        if (authToken == null) {
            throw new CredentialException();
        }
        return authToken;
    }

    @ExceptionHandler(CredentialException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public @ResponseBody
    ErrorResponse handleException(CredentialException e) {
        return new ErrorResponse("Invalid Credentials");
    }

}