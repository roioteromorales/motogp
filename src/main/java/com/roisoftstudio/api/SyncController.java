package com.roisoftstudio.api;

import com.roisoftstudio.domain.CalendarUseCase;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

public class SyncController {

    @Inject
    private CalendarUseCase calendarUseCase;


    @RequestMapping("/sync")
    public String index() {

        calendarUseCase.onSuccess(System.out::println).onError(System.out::println).run();

        return "Greetings from Spring Boot!";
    }
}
