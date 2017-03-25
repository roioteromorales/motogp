package com.roisoftstudio.domain.model.event;

public class Event {
    private Category category;
    private EventType type;
    private Results results;

    public Event(Category category, EventType type, Results results) {
        this.category = category;
        this.type = type;
        this.results = results;
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
