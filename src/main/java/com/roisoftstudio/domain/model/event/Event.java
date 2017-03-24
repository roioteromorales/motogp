package com.roisoftstudio.domain.model.event;

import com.roisoftstudio.data.event.Category;
import com.roisoftstudio.data.event.EventType;

public class Event {
    private Category category;
    private EventType type;

    public Event(Category category, EventType type) {
        this.category = category;
        this.type = type;
    }

    public EventType getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }
}
