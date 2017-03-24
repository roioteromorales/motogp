package com.roisoftstudio.data.calendar;

import com.roisoftstudio.domain.model.calendar.Calendar;
import org.springframework.stereotype.Service;

@Service
public interface CalendarRepository {
    void addCalendar(String year, Calendar calendar);

    Calendar getCalendar(String year);
}
