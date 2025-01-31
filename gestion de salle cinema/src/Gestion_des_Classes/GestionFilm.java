package Gestion_des_Classes;

import ClassesBase.Film;
import java.util.ArrayList;

public class GestionFilm {
    ArrayList<Film> films = new ArrayList<Film>();
    public int FilmCount = -1;

    public void Addfilm(String titreFilm, int duréeFilm, String genre) {
        Film film = new Film(titreFilm, duréeFilm, genre);
        film.FilmId = FilmCount++;
        films.add(film);
        this.FilmCount++;
        return;
    }

    public void ModifierFilm(String ActualtitreFilm, String NewtitreFilm, int duréeFilm, String genre) {

        for (Film film : films) {
            if (film.TitreFilm.equals(ActualtitreFilm)) {
                film.TitreFilm = NewtitreFilm;
                film.dureeFilm = duréeFilm;
                film.genre = genre;
                return;
            } else {
                System.out.println("Film n'existe pas");
            }
        }
    }

    public void Deletefilm(String TitreFilm) {
        for (Film film : films) {
            if (film.TitreFilm.equals(TitreFilm)) {
                films.remove(film);
                return;
            } else {
                System.out.println("Film n'existe pas");
            }
        }
    }

    public void displayFilms() {
        for (Film film : films) {
            System.out.println(film.FilmId + " - Titre: " + film.TitreFilm + " Durée: " + film.dureeFilm + " Genre: "
                    + film.genre);
        }
    }
}
