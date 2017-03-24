package com.roisoftstudio.data.event;

import com.roisoftstudio.domain.model.event.Event;

import java.util.List;

public interface EventRepository {
    List<Event> getByGPId(String gpId);

    List<Event> getByGPIdAndCategory(String gpId, Category category);

    Event getByGPIdAndEventType(String gpId, Category category, EventType eventType);
}
