package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.event.Category;
import com.roisoftstudio.data.event.EventRepository;
import com.roisoftstudio.data.event.EventType;
import com.roisoftstudio.domain.model.event.Event;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;


@Service
public class EventService {

    private EventRepository eventRepository;

    @Inject
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents(String gpId) {
        return eventRepository.getByGPId(gpId);
    }

    public Event getEvent(String gpId, Category category, EventType eventType) {
        return eventRepository.getByGPIdAndEventType(gpId, category, eventType);
    }
}
