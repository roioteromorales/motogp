package com.roisoftstudio.domain.model;

import java.time.LocalDate;

public class GrandPrix {
    private String id;
    private int year;
    private String description;
    private String country;
    private LocalDate date;
    private String status;

    public GrandPrix(String id, int year, String description, String country, LocalDate date, String status) {
        this.id = id;
        this.year = year;
        this.description = description;
        this.country = country;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
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
