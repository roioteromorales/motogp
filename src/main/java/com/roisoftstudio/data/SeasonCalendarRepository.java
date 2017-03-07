package com.roisoftstudio.data;

import com.roisoftstudio.domain.model.SeasonCalendar;
import org.springframework.stereotype.Service;

@Service
public interface SeasonCalendarRepository {
    void addCalendar(String year, SeasonCalendar seasonCalendar);

    SeasonCalendar getCalendar(String year);
}
