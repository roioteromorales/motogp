package com.roisoftstudio.domain.model.race;

import java.time.LocalDate;

public class GrandPrix {
    private int sequence;
    private String description;
    private String country;
    private LocalDate date;
    private String status;

    public GrandPrix(int sequence, String description, String country, LocalDate date, String status) {
        this.sequence = sequence;
        this.description = description;
        this.country = country;
        this.date = date;
        this.status = status;
    }
    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date.toString();
    }

    public String getStatus() {
        return status;
    }
}
