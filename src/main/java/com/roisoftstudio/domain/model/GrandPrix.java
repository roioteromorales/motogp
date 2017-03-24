package com.roisoftstudio.domain.model;

import java.time.LocalDate;

public class GrandPrix {
    private int year;
    private int id;
    private String description;
    private String country;
    private LocalDate date;
    private String status;

    public GrandPrix(int year, int id, String description, String country, LocalDate date, String status) {
        this.year = year;
        this.id = id;
        this.description = description;
        this.country = country;
        this.date = date;
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
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
