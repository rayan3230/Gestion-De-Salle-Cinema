public class Screening {
    private Film film;
    private CinemaHall cinemaHall;
    private String date;
    private String startTime;
    private String endTime;

    public Screening(Film film, CinemaHall cinemaHall, String date, String startTime, String endTime) {
        this.film = film;
        this.cinemaHall = cinemaHall;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}