package ClassesBase;

import java.sql.Date;
import java.time.LocalTime;

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

        if (this.minutedebut + film.dureeFilm % 60 > 60) {
            this.minutefin = this.minutedebut + film.dureeFilm % 60;
            this.hourfin = this.hourdebut + film.dureeFilm / 60 + 1;
        } else {
            this.minutefin = this.minutedebut + film.dureeFilm % 60;
            this.hourfin = this.hourdebut + film.dureeFilm / 60;
        }
    }
}
