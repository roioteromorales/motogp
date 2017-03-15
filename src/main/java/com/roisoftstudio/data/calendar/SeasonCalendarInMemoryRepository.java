package com.roisoftstudio.data.calendar;

import com.roisoftstudio.domain.model.RacePreview;
import com.roisoftstudio.domain.model.SeasonCalendar;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SeasonCalendarInMemoryRepository implements SeasonCalendarRepository {

    private Map<String, SeasonCalendar> calendars;

    public SeasonCalendarInMemoryRepository() {
        this.calendars = new HashMap<>();
        calendars.put("2017", new SeasonCalendar("Campeonato del mundo", "2017", getRaces()));
    }

    private List<RacePreview> getRaces() {
        List<RacePreview> races = new ArrayList<>();
        races.add(new RacePreview(1, 48338, "GP Qatar", "Qatar", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(2, 48335, "GP Argentina", "Argentina", LocalDate.of(2017, 04, 9), LocalDate.of(2017, 04, 9), "tobeplayed"));
        races.add(new RacePreview(3, 48332, "GP of The America", "USA", LocalDate.of(2017, 04, 23), LocalDate.of(2017, 04, 23), "tobeplayed"));
        races.add(new RacePreview(4, 48329, "GP España", "Spain", LocalDate.of(2017, 05, 07), LocalDate.of(2017, 05, 07), "tobeplayed"));
        races.add(new RacePreview(5, 48326, "GP Francia", "Francia", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(6, 48323, "GP Italia", "Italia", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(7, 48320, "GP Catalunya", "Catalunya", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(8, 48317, "GP Holland", "Holland", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(9, 48314, "GP Germany", "Germany", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(10, 48311, "GP Czech Republic", "Czech Republic", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(11, 48308, "GP Austria", "Austria", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(12, 48305, "GP Great Britain", "Great Britain", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(13, 48302, "GP San Marino", "San Marino", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(14, 48299, "GP Aragon", "Aragon", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(15, 48296, "GP Japan", "Japan", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(16, 48293, "GP Australia", "Australia", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(17, 48290, "GP Malaysia", "Malaysia", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        races.add(new RacePreview(18, 48287, "GP Valencia", "Valencia", LocalDate.of(2017, 03, 26), LocalDate.of(2017, 03, 26), "tobeplayed"));
        return races;
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
