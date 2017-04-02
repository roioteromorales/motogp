package com.roisoftstudio.domain.model.selection;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.LapResult;
import com.roisoftstudio.domain.model.rider.Rider;

public class Selection {
    private final Category category;
    private final Rider firstPosition;
    private final Rider secondPosition;
    private final Rider thirdPosition;
    private final LapResult fastestLap;

    public Selection(Category category, Rider firstPosition, Rider secondPosition, Rider thirdPosition, LapResult fastestLap) {
        this.category = category;
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
        this.fastestLap = fastestLap;
    }

    public Rider getFirstPosition() {
        return firstPosition;
    }

    public Rider getSecondPosition() {
        return secondPosition;
    }

    public Rider getThirdPosition() {
        return thirdPosition;
    }

    public LapResult getFastestLap() {
        return fastestLap;
    }

    public Category getCategory() {
        return category;
    }

    public static Selection empty() {
        return new Selection(null, null, null, null, null);
    }
}
