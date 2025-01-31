package Gestion_des_Classes;

import ClassesBase.Film;
import java.util.ArrayList;

public class GestionFilm {
    public ArrayList<Film> films = new ArrayList<Film>();
    public int FilmCount = 0;

    public void AddFilm(String titreFilm, int duréeFilm, String genre) {
        Film film = new Film(titreFilm, duréeFilm, genre);
        film.FilmId = FilmCount++;
        films.add(film);
        this.FilmCount++;
        return;
    }

    public void ModifierFilm(int FilmId, String NewtitreFilm, int duréeFilm, String genre) {
        if (films.get(FilmId) != null) {
            films.get(FilmId).TitreFilm = NewtitreFilm;
            films.get(FilmId).dureeFilm = duréeFilm;
            films.get(FilmId).genre = genre;
            return;
        } else {
            System.out.println("Film n'existe pas");
        }

    }

    public void DeleteFilm(int FilmId) {
        if (films.get(FilmId) != null) {
            films.remove(FilmId);
            return;
        } else {
            System.out.println("Film n'existe pas");
        }
    }

    public void displayFilms() {
        for (Film film : films) {
            System.out.println(film.FilmId + " - Titre: " + film.TitreFilm + " Durée: " + film.dureeFilm + " Genre: "
                    + film.genre);
        }
    }
}
