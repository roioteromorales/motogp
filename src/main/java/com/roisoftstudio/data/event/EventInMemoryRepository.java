package com.roisoftstudio.data.event;

import com.roisoftstudio.domain.model.event.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.roisoftstudio.data.rider.RidersMotoGP.*;
import static com.roisoftstudio.domain.model.event.Category.*;
import static com.roisoftstudio.domain.model.event.EventType.RACE;
import static java.util.Arrays.asList;

@Service
public class EventInMemoryRepository implements EventRepository {

    private static Map<String, List<Event>> eventList = getEvents();

    @Override
    public List<Event> getByGPId(String gpId) {
        return eventList.get(gpId);
    }

    @Override
    public List<Event> getByGPIdAndCategory(String gpId, Category category) {
        return eventList.get(gpId).stream()
                .filter(event -> category.equals(event.getCategory()))
                .collect(Collectors.toList());
    }

    @Override
    public Event getByGPIdAndEventType(String gpId, Category category, EventType eventType) {
        return eventList.get(gpId).stream()
                .filter(event -> category.equals(event.getCategory()))
                .filter(event -> eventType.equals(event.getType()))
                .findFirst().get();
    }

    private static Map<String, List<Event>> getEvents() {
        Map<String, List<Event>> eventsByGp = new HashMap<>();
        eventsByGp.put("2017-01", asList(
                new Event("qat-motogp-race", MOTOGP, RACE, getResults()),
                new Event("qat-moto2-race", MOTO2, RACE, getResults()),
                new Event("qat-moto3-race", MOTO3, RACE, getResults())));
        eventsByGp.put("2017-02", asList(
                new Event("qat-motogp-race", MOTOGP, RACE, getResults()),
                new Event("qat-moto2-race", MOTO2, RACE, getResults()),
                new Event("qat-moto3-race", MOTO3, RACE, getResults())));
        return eventsByGp;
    }

    public static Results getResults() {
        return new Results(getResultRows(), new LapResult(14, MAVERIK_VINALES, "1:54.316", "169.4 km/h"));
    }

    private static List<ResultRow> getResultRows() {
        return asList(
                new ResultRow(1, MAVERIK_VINALES, 334.8, "1:54.316"),
                new ResultRow(2, MARK_MARQUEZ, 337.7, "1:54.912"),
                new ResultRow(3, DANI_PEDROSA, 337.71, "1:55.210")
        );
    }
}
