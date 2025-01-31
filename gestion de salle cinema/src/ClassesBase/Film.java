package ClassesBase;

public class Film {
    public String TitreFilm;
    public int dureeFilm;
    public String genre;

    enum genre {
        Vo, Vf
    }

    public Film(String titreFilm, int dureeFilm, String genre) {
        TitreFilm = titreFilm;
        this.dureeFilm = dureeFilm;
        this.genre = genre;
    }
}
