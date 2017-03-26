package com.roisoftstudio.domain.model.event;

public class Event {
    private String eventId;
    private Category category;
    private EventType type;
    private Results results;

    public Event(String eventId, Category category, EventType type, Results results) {
        this.category = category;
        this.type = type;
        this.results = results;
    }

    public String getEventId() {
        return eventId;
    }

    public EventType getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public Results getResults() {
        return results;
    }
}
