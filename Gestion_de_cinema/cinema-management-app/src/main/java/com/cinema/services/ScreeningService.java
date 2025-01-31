package com.cinema.services;

import com.cinema.models.Screening;
import java.util.ArrayList;
import java.util.List;

public class ScreeningService {
    private List<Screening> screenings;

    public ScreeningService() {
        this.screenings = new ArrayList<>();
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public List<Screening> getAllScreenings() {
        return new ArrayList<>(screenings);
    }

    public Screening getScreeningById(int id) {
        for (Screening screening : screenings) {
            if (screening.getId() == id) {
                return screening;
            }
        }
        return null;
    }

    public void updateScreening(int id, Screening updatedScreening) {
        for (int i = 0; i < screenings.size(); i++) {
            if (screenings.get(i).getId() == id) {
                screenings.set(i, updatedScreening);
                return;
            }
        }
    }

    public void removeScreening(int id) {
        screenings.removeIf(screening -> screening.getId() == id);
    }
}