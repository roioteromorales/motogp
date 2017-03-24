package com.roisoftstudio.data.event;

import com.roisoftstudio.domain.model.event.Event;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.roisoftstudio.data.event.Category.*;
import static com.roisoftstudio.data.event.EventType.RACE;
import static java.util.Arrays.asList;

@Service
public class EventInMemoryRepository implements EventRepository {

    private static Map<String, List<Event>> eventList = getEvents();

    @Override
    public List<Event> getByGPId(String gpId) {
        return eventList.get(gpId);
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
                new Event(MOTOGP, RACE),
                new Event(MOTO2, RACE),
                new Event(MOTO3, RACE)));
        eventsByGp.put("2017-02", asList(
                new Event(MOTOGP, RACE),
                new Event(MOTO2, RACE),
                new Event(MOTO3, RACE)));
        return eventsByGp;
    }
}
