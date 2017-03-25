package com.roisoftstudio.domain.model.event;

import com.roisoftstudio.domain.model.rider.Rider;

public class ResultRow {
    private int position;
    private Rider rider;
    private double maxSpeed;
    private String time;

    public ResultRow(int position, Rider rider, double maxSpeed, String time) {
        this.position = position;
        this.rider = rider;
        this.maxSpeed = maxSpeed;
        this.time = time;
    }

    public int getPosition() {
        return position;
    }

    public Rider getRider() {
        return rider;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getTime() {
        return time;
    }
}
