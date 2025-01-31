package ClassesBase;

import java.time.LocalTime;

import java.sql.Date;

public class Diffusion {
    public int year;
    public int month;
    public int jour;
    public Date date;
    public int hourdebut;
    public int minutedebut;
    public LocalTime timedebut = LocalTime.of(hourdebut, minutedebut);
    public Film film;
    public Salle salle;
    public int hourfin;
    public int minutefin;
    public LocalTime timefin = LocalTime.of(this.hourfin, this.minutefin);

    public Diffusion(Date date, Film film, Salle salle, LocalTime timedebut) {
        this.date = date;
        this.film = film;
        this.salle = salle;
        this.timedebut = timedebut;

        if (minutedebut + film.dureeFilm % 60 > 60) {
            minutefin = this.minutedebut + film.dureeFilm % 60;
            hourfin = this.hourdebut + film.dureeFilm / 60 + 1;
        } else {
            minutefin = this.minutedebut + film.dureeFilm % 60;
            hourfin = this.hourdebut + film.dureeFilm / 60;
        }
    }
}
