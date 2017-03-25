package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.event.EventRepository;
import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.Event;
import com.roisoftstudio.domain.model.event.EventType;
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

    public List<Event> getEvent(String gpId, Category category) {
        return eventRepository.getByGPIdAndCategory(gpId, category);
    }

    public Event getEvent(String gpId, Category category, EventType eventType) {
        return eventRepository.getByGPIdAndEventType(gpId, category, eventType);
    }
}
