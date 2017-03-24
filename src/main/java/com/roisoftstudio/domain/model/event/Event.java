package com.roisoftstudio.domain.model.event;

public class Event {
    private String category;
    private String type;

    public Event(String category, String type) {
        this.category = category;
        this.type = type;
    }
}
