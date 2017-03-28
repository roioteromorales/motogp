package com.roisoftstudio.infraestructure;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

public class AuthInterceptor extends HandlerInterceptorAdapter {

    public static final String BASIC_123 = "Basic 123";
    static Logger logger = Logger.getLogger(AuthInterceptor.class);

    static {
        BasicConfigurator.configure();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authorization = request.getHeader(AUTHORIZATION);
        if (authorization.equals(BASIC_123)) {
            return super.preHandle(request, response, handler);
        } else {
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}