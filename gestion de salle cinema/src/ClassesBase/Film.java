package ClassesBase;

public class Film {
    public String TitreFilm;
    public int dureeFilm;
    public String genre;

    enum genre {
        Vo,
        Vf
    }

    public Film(String titreFilm, int duréeFilm, String genre) {
        TitreFilm = titreFilm;
        this.dureeFilm = duréeFilm;
        this.genre = genre;
    }
}
