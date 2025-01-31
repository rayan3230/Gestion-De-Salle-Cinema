package MainClasses;

import ClassesBase.*;
import Gestion_des_Classes.*;
import java.sql.Date;
import java.util.Scanner;

public class MainServices {
    // VARIABLES ----------------------------------------------------------------
    public static GestionBills getGestionBills = new GestionBills();
    public static GestionDiffusions getGestionDiffusion = new GestionDiffusions();
    public static GestionFilm getGestionFilm = new GestionFilm();
    public static GestionDeSalle getGestionSalle = new GestionDeSalle();
    public static Diffusion getDiffusion;
    public static Film getFilm;
    public static Salle getSalle;
    public static billet getBill;
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");
        System.out.println("----------------WELCOME TO POO CINEMA MANAGEMENT ------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("1- Gestion des salles");
        System.out.println("2- Gestion des films");
        System.out.println("3- Gestion des diffusions");
        System.out.println("4- Quitter");
        System.out.println("");
        int choix;
        do {
            System.out.print("Veuillez choisir une option :  ");
            choix = Scan.nextInt();
        } while (choix < 0 && choix > 4);

        while (true) {
            switch (choix) {
                case 1:
                    System.out.println("1- Ajouter une salle");
                    System.out.println("2- Modifier une salle");
                    System.out.println("3- Mettre hors service une salle");
                    System.out.println("4- Remettre en service une salle");
                    System.out.println("5- Afficher les salles disponibles");
                    System.out.println("6- Afficher les salles");
                    System.out.println("7- Retour");
                    System.out.println("");
                    System.out.print("Veuillez choisir une option :   ");

                    int choixSalle;
                    do {
                        choixSalle = Scan.nextInt();
                        if (choixSalle < 1 || choixSalle > 7) {
                            System.out.println("Veuillez entrer une option valide");
                        }
                    } while (choixSalle < 1 && choixSalle > 7);

                    switch (choixSalle) {
                        case 1:
                            System.out.print("Veuillez entrer la capacité normale de la salle :  ");
                            int NormalCapacity = Scan.nextInt();
                            System.out.print("Veuillez entrer la capacité VIP de la salle :   ");
                            int VipCapacity = Scan.nextInt();
                            getGestionSalle.AddSalle(NormalCapacity, VipCapacity);
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Veuillez entrer l'ID de la salle :   ");
                            int salleID = Scan.nextInt();
                            System.out.print("Veuillez entrer la nouvelle capacité normale de la salle :   ");
                            int NewNormalCapacity = Scan.nextInt();
                            System.out.print("Veuillez entrer la nouvelle capacité VIP de la salle :   ");
                            int NewVipCapacity = Scan.nextInt();
                            getGestionSalle.ModifierSalle(salleID, NewNormalCapacity, NewVipCapacity);
                            System.out.println("");
                            break;

                        case 3:
                            System.out.print("Veuillez entrer l'ID de la salle :   ");
                            int salleID1 = Scan.nextInt();
                            getGestionSalle.MettrehorsService(salleID1);
                            System.out.println("");
                            break;

                        case 4:
                            System.out.print("Veuillez entrer l'ID de la salle :   ");
                            int salleID2 = Scan.nextInt();
                            getGestionSalle.RemettreEnService(salleID2);
                            System.out.println("");
                            break;

                        case 5:
                            getGestionSalle.AfficherSalleDispo();
                            System.out.println("");
                            break;

                        case 6:
                            getGestionSalle.AfficherSalle();
                            System.out.println("");
                            break;

                        case 7:
                            main(args);
                            System.out.println("");
                            break;
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("1- Ajouter un film");
                    System.out.println("2- Modifier un film");
                    System.out.println("3- Supprimer un film");
                    System.out.println("4- Afficher les films");
                    System.out.println("5- Retour");
                    System.out.println("");
                    System.out.print("Veuillez choisir une option :   ");

                    int choixFilm;
                    do {
                        choixFilm = Scan.nextInt();
                        if (choixFilm < 1 || choixFilm > 5) {
                            System.out.println("Veuillez entrer une option valide");
                        }
                    } while (choixFilm < 1 && choixFilm > 5);

                    switch (choixFilm) {
                        case 1:
                            System.out.print("Veuillez entrer le titre du film :   ");
                            String titre = Scan.next();
                            System.out.print("Veuillez entrer la durée du film :   ");
                            int duree = Scan.nextInt();
                            System.out.print("Veuillez entrer le genre du film :   ");
                            String genre = Scan.next();
                            getGestionFilm.AddFilm(titre, duree, genre);
                            System.out.println("");
                            break;

                        case 2:
                            getGestionFilm.displayFilms();
                            System.out.print("Veuillez entrer l'ID du film :   ");
                            int filmID = Scan.nextInt();
                            System.out.print("Veuillez entrer le nouveau titre du film :   ");
                            String Newtitre = Scan.next();
                            System.out.print("Veuillez entrer la nouvelle durée du film :   ");
                            int Newduree = Scan.nextInt();
                            System.out.print("Veuillez entrer le nouveau genre du film :   ");
                            String NewGenre = Scan.next();
                            getGestionFilm.ModifierFilm(filmID, Newtitre, Newduree, NewGenre);
                            System.out.println("");
                            break;

                        case 3:
                            System.out.print("Veuillez entrer l'ID du film :   ");
                            int filmID1 = Scan.nextInt();

                            getGestionFilm.DeleteFilm(filmID1);
                            System.out.println("");
                            break;

                        case 4:
                            getGestionFilm.displayFilms();
                            System.out.println("");
                            break;

                        case 5:
                            main(args);
                            System.out.println("");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1- Créer une diffusion");
                    System.out.println("2- Modifier une diffusion");
                    System.out.println("3- Supprimer une diffusion");
                    System.out.println("4- Retour");
                    System.out.println("");
                    System.out.print("Veuillez choisir une option :   ");

                    int choixDiffusion;
                    do {
                        choixDiffusion = Scan.nextInt();
                        if (choixDiffusion < 1 || choixDiffusion > 4) {
                            System.out.println("Veuillez entrer une option valide");
                        }
                    } while (choixDiffusion < 1 || choixDiffusion > 4);

                    switch (choixDiffusion) {
                        case 1:
                            System.out.println("Veuillez entrer la date de la diffusion : ");

                            System.out.print("Veuillez entrer l'année :   ");
                            int year = Scan.nextInt();
                            System.out.print("Veuillez entrer le mois :   ");
                            int month = Scan.nextInt();
                            System.out.print("Veuillez entrer le jour :   ");
                            int day = Scan.nextInt();
                            @SuppressWarnings("deprecation")
                            Date date = new Date(year, month, day);

                            System.out.print("Veuillez entrer l'ID du film :   ");
                            int filmID = Scan.nextInt();
                            Film film = getGestionFilm.films.get(filmID);

                            System.out.print("Veuillez entrer l'ID de la salle :   ");
                            int salleID = Scan.nextInt();
                            Salle salle = getGestionSalle.salles.get(salleID);

                            System.out.print("Veuillez entrer l'heure de début de la diffusion :   ");
                            int hourdebut = Scan.nextInt();
                            System.out.print("Veuillez entrer les minutes de début de la diffusion :   ");
                            int minutedebut = Scan.nextInt();

                            System.out.print("Veuillez entrer l'heure de fin de la diffusion :   ");
                            int hourfin = Scan.nextInt();

                            System.out.print("Veuillez entrer les minutes de fin de la diffusion :   ");
                            int minutefin = Scan.nextInt();
                            System.out.println("");

                            getGestionDiffusion.addDiffusion(date, film, salle, hourdebut, minutedebut, hourfin,
                                    minutefin);

                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Veuillez entrer l'ID de la diffusion :   ");
                            int idDiffusion = Scan.nextInt();
                            System.out.println("");
                            getGestionDiffusion.ModifierDiffusion(idDiffusion);
                            System.out.println("");
                            break;

                        case 3:
                            System.out.print("Veuillez entrer l'ID de la diffusion :   ");
                            int idDiffusion1 = Scan.nextInt();
                            System.out.println("");

                            getGestionDiffusion.SupprimerDiffusion(idDiffusion1);
                            System.out.println("");
                            break;

                        case 4:
                            main(args);
                            System.out.println("");
                            break;
                    }
                    System.out.println("");
                case 4:
                    System.exit(0);
                    System.out.println("");
                    break;
                default:
                    System.out.println("Veuillez choisir une option valide");
                    System.out.println("");
                    main(args);
                    System.out.println("");
                    break;
            }
        }

    }
}