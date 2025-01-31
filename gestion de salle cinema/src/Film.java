public class Film {
    public String TitreFilm;
    public int duréeFilm;
    public String genre;
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
