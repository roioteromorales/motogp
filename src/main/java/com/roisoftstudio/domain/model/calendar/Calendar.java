package com.roisoftstudio.domain.model.calendar;

import com.roisoftstudio.domain.model.race.GrandPrix;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

import static java.util.Collections.emptyList;

public class Calendar {
    public static final Calendar EMPTY = new Calendar("", "", emptyList());

    private String name;
    private String year;
    private List<GrandPrix> grandPrix;

    public Calendar(String name, String year, List<GrandPrix> grandPrix) {
        this.name = name;
        this.year = year;
        this.grandPrix = grandPrix;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public List<GrandPrix> getGrandPrix() {
        return grandPrix;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("year", year)
                .append("grandPrix", grandPrix)
                .toString();
    }
}
