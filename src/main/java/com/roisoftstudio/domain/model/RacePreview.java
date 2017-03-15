package com.roisoftstudio.domain.model;

import java.time.LocalDate;

public class RacePreview {
    private int sequence;
    private int id;
    private String description;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public RacePreview(int sequence, int id, String description, String country, LocalDate startDate, LocalDate endDate, String status) {
        this.sequence = sequence;
        this.id = id;
        this.description = description;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
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

    public String getStartDate() {
        return startDate.toString();
    }

    public String getEndDate() {
        return endDate.toString();
    }

    public String getStatus() {
        return status;
    }
}
