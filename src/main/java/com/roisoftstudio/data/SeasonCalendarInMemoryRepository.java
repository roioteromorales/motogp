package com.roisoftstudio.data;

import com.roisoftstudio.domain.model.SeasonCalendar;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SeasonCalendarInMemoryRepository implements SeasonCalendarRepository {

    private Map<String, SeasonCalendar> calendars;

    public SeasonCalendarInMemoryRepository() {
        this.calendars = new HashMap<>();
        calendars.put("2017", new SeasonCalendar("Campeonato del mundo", "2017"));
    }

    @Override
    public void addCalendar(String year, SeasonCalendar seasonCalendar) {
        calendars.put(year, seasonCalendar);
    }

    @Override
    public SeasonCalendar getCalendar(String year) {
        return calendars.get(year);
    }
}
