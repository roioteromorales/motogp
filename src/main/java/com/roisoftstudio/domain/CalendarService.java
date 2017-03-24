package com.roisoftstudio.domain;

import com.roisoftstudio.data.calendar.CalendarRepository;
import com.roisoftstudio.domain.model.calendar.Calendar;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;

import static com.roisoftstudio.domain.model.calendar.Calendar.EMPTY;


@Service
public class CalendarService {

    private CalendarRepository calendarRepository;

    @Inject
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public Calendar get(String year) {
        return Optional.ofNullable(calendarRepository.getCalendar(year)).orElse(EMPTY);
    }

}
