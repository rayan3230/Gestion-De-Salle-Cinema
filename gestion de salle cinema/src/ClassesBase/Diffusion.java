package ClassesBase;

public class Diffusion {
    public int year;
    public int month;
    public int jour;
    public Date date = new Date(year, month, jour);
    public Film film;
    public Salle salle;
    public LocalTime timedebut = LocalTime(int hourdebut, int minutedebut);
    if(minutedebut + film.duree % 60 > 60){
        int minutefin = this.minutedebut + film.duree % 60;
        int hourfin = this.hourdebut + film.duree / 60 + 1;
    }else{
        int minutefin = this.minutedebut + film.duree % 60;
        int hourfin = this.hourdebut + film.duree / 60
    }
    public LocalTime timefin = LocalTime(this.hourfin, this.minutefin);

    public Diffusion(Date date, Film film , Salle salle, LocalTime timedebut){
        this.date = date;
        this.film = film;
        this.salle = salle;
        this.timedebut = timedebut;
    }
}
