package com.roisoftstudio.data.event;

import com.roisoftstudio.domain.model.event.Event;
import com.roisoftstudio.domain.model.rider.Rider;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.roisoftstudio.data.event.Category.*;
import static com.roisoftstudio.data.event.EventType.*;
import static com.roisoftstudio.data.rider.Riders.*;
import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;

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
                new Event(MOTOGP, FP1, getResults()),
                new Event(MOTOGP, FP2, getResults()),
                new Event(MOTOGP, FP3, getResults()),
                new Event(MOTOGP, FP4, getResults()),
                new Event(MOTOGP, Q1, getResults()),
                new Event(MOTOGP, Q2, getResults()),
                new Event(MOTOGP, WUP, getResults()),
                new Event(MOTOGP, RACE, getResults()),
                new Event(MOTO2, RACE, getResults()),
                new Event(MOTO3, RACE, getResults())));
        eventsByGp.put("2017-02", asList(
                new Event(MOTOGP, RACE, getResults()),
                new Event(MOTO2, RACE, getResults()),
                new Event(MOTO3, RACE, getResults())));
        return eventsByGp;
    }

    private static Results getResults() {
        Results results = new Results();
        List<ResultRow> resultRows = getResultRows();
        results.setWinner(getWinner(resultRows));
        results.setFastestRider(getFastestRider(resultRows));
        results.setResultRows(resultRows);
        return results;
    }

    private static Rider getFastestRider(List<ResultRow> resultRows) {
        return resultRows.stream()
                .max(comparing(ResultRow::getMaxSpeed))
                .map(ResultRow::getRider)
                .get();
    }

    private static Rider getWinner(List<ResultRow> resultRows) {
        return resultRows.stream()
                .filter(resultRow -> resultRow.getPosition() == 1)
                .findFirst().get().getRider();
    }

    private static List<ResultRow> getResultRows() {
        return asList(
                new ResultRow(1, MAVERIK_VINALES, 334.8, "1:54.316"),
                new ResultRow(2, MARK_MARQUEZ, 337.7, "1:54.912"),
                new ResultRow(3, DANI_PEDROSA, 337.71, "1:55.210")
        );
    }
}
