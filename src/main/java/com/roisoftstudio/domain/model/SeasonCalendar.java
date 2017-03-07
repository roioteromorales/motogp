package com.roisoftstudio.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SeasonCalendar {
    public static final SeasonCalendar EMPTY = new SeasonCalendar("", "");

    private String name;
    private String year;


    public SeasonCalendar(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("year", year)
                .toString();
    }
}
