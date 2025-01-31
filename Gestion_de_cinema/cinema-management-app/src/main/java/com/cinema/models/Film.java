package com.cinema.models;

public class Film {
    private String title;
    private int duration; // in minutes
    private String genre;
    private String version; // Vo or Vf

    public Film(String title, int duration, String genre, String version) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}