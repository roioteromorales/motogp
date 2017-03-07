package com.roisoftstudio.api;

import com.roisoftstudio.domain.SeasonCalendarService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class CalendarController {

    @Inject
    private SeasonCalendarService seasonCalendarService;

    @RequestMapping("/calendar/{year}")
    public String calendar(@PathVariable String year) {
        return seasonCalendarService.get(year).toString();
    }

}
