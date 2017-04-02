package com.roisoftstudio.domain.model.selection;

import com.roisoftstudio.domain.model.event.LapResult;
import com.roisoftstudio.domain.model.rider.Rider;

public class Selection {
    private Rider firstPosition;
    private Rider secondPosition;
    private Rider thirdPosition;
    private LapResult fastestLap;

    public Selection() {

    }

    public Selection(Rider firstPosition, Rider secondPosition, Rider thirdPosition, LapResult fastestLap) {
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


    public static Selection empty() {
        return new Selection(null, null, null, null);
    }
}
