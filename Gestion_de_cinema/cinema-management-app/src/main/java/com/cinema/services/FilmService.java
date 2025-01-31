package com.cinema.services;

import com.cinema.models.Film;
import java.util.ArrayList;
import java.util.List;

public class FilmService {
    private List<Film> films;

    public FilmService() {
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void updateFilm(int index, Film film) {
        if (index >= 0 && index < films.size()) {
            films.set(index, film);
        }
    }

    public Film getFilm(int index) {
        if (index >= 0 && index < films.size()) {
            return films.get(index);
        }
        return null;
    }

    public List<Film> getAllFilms() {
        return new ArrayList<>(films);
    }

    public void removeFilm(int index) {
        if (index >= 0 && index < films.size()) {
            films.remove(index);
        }
    }
}