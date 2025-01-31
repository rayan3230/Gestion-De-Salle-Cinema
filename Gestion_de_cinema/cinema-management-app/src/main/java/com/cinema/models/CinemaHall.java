package com.cinema.models;

public class CinemaHall {
    private int hallNumber;
    private int seatingCapacity;

    public CinemaHall(int hallNumber, int seatingCapacity) {
        this.hallNumber = hallNumber;
        this.seatingCapacity = seatingCapacity;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}