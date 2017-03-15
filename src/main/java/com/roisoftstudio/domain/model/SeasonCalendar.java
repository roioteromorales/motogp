package com.roisoftstudio.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

import static java.util.Collections.emptyList;

public class SeasonCalendar {
    public static final SeasonCalendar EMPTY = new SeasonCalendar("", "", emptyList());

    private String name;
    private String year;
    private List<RacePreview> races;

    public SeasonCalendar(String name, String year, List<RacePreview> races) {
        this.name = name;
        this.year = year;
        this.races = races;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public List<RacePreview> getRaces() {
        return races;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("year", year)
                .append("races", races)
                .toString();
    }
}
