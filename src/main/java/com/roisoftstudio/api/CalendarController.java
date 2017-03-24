package com.roisoftstudio.api;

import com.roisoftstudio.domain.CalendarService;
import com.roisoftstudio.domain.model.calendar.Calendar;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@CrossOrigin
@RestController
public class CalendarController {

    @Inject
    private CalendarService calendarService;

    @RequestMapping("/calendar/{year}")
    public Calendar calendar(@PathVariable String year) {
        return calendarService.get(year);
    }

}
