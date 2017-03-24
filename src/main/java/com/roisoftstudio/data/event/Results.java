package com.roisoftstudio.data.event;

import com.roisoftstudio.domain.model.rider.Rider;

import java.util.List;

public class Results {

    private Rider winner;
    private List<ResultRow> resultRows;
    private Rider fastestRider;

    public Rider getWinner() {
        return winner;
    }

    public void setWinner(Rider winner) {
        this.winner = winner;
    }

    public List<ResultRow> getResultRows() {
        return resultRows;
    }

    public void setResultRows(List<ResultRow> resultRows) {
        this.resultRows = resultRows;
    }

    public Rider getFastestRider() {
        return fastestRider;
    }

    public void setFastestRider(Rider fastestRider) {
        this.fastestRider = fastestRider;
    }
}
