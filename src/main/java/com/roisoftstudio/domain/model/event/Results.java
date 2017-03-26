package com.roisoftstudio.domain.model.event;

import java.util.List;

public class Results {

    private List<ResultRow> resultRows;
    private LapResult fastestLap;

    public Results(List<ResultRow> resultRows, LapResult fastestLap) {
        this.resultRows = resultRows;
        this.fastestLap = fastestLap;
    }

    public LapResult getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(LapResult fastestLap) {
        this.fastestLap = fastestLap;
    }

    public List<ResultRow> getResultRows() {
        return resultRows;
    }

    public void setResultRows(List<ResultRow> resultRows) {
        this.resultRows = resultRows;
    }

}
