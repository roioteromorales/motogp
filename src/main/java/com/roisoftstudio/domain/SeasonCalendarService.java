package com.roisoftstudio.domain;

import com.roisoftstudio.data.calendar.SeasonCalendarRepository;
import com.roisoftstudio.domain.model.SeasonCalendar;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;

import static com.roisoftstudio.domain.model.SeasonCalendar.EMPTY;


@Service
public class SeasonCalendarService {

    private SeasonCalendarRepository seasonCalendarRepository;

    @Inject
    public SeasonCalendarService(SeasonCalendarRepository seasonCalendarRepository) {
        this.seasonCalendarRepository = seasonCalendarRepository;
    }

    public SeasonCalendar get(String year) {
        return Optional.ofNullable(seasonCalendarRepository.getCalendar(year)).orElse(EMPTY);
    }

}
