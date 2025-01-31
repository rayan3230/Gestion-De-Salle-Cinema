public class Film {
    String TitreFilm;
    int duréeFilm;
    String genre;
    enum genre{
        Vo,
        Vf
    }


    public Film(String titreFilm, int duréeFilm, String genre) {
        TitreFilm = titreFilm;
        this.duréeFilm = duréeFilm;
        this.genre = genre;
    }
}
