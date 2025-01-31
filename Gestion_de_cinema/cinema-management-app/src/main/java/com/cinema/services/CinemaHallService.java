package com.cinema.services;

import com.cinema.models.CinemaHall;
import java.util.ArrayList;
import java.util.List;

public class CinemaHallService {
    private List<CinemaHall> cinemaHalls;

    public CinemaHallService() {
        this.cinemaHalls = new ArrayList<>();
    }

    public void addCinemaHall(CinemaHall hall) {
        cinemaHalls.add(hall);
    }

    public void updateCinemaHall(int index, CinemaHall hall) {
        if (index >= 0 && index < cinemaHalls.size()) {
            cinemaHalls.set(index, hall);
        }
    }

    public CinemaHall getCinemaHall(int index) {
        if (index >= 0 && index < cinemaHalls.size()) {
            return cinemaHalls.get(index);
        }
        return null;
    }

    public List<CinemaHall> getAllCinemaHalls() {
        return new ArrayList<>(cinemaHalls);
    }
}