package Gestion_des_Classes;

import ClassesBase.Diffusion;
import ClassesBase.Film;
import ClassesBase.Salle;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDiffusions {

    public ArrayList<Diffusion> Diffusions = new ArrayList<Diffusion>();
    public int DiffusionCount = 0;

    public GestionDeSalle RoomsManagement;
    public Scanner Scan = new Scanner(System.in);

    public void addDiffusion(Date date, Film film, Salle salle, int hourdebut, int minutedebut, int hourfin,
            int minutefin) {
        Diffusion newDiff = new Diffusion(date, film, salle, hourdebut, minutedebut);
        if (salle.Available == true) {
            salle.Available = false;
        } else {
            System.out.println("La salle n'est pas disponible, voici les salle disponible  :  ");
            RoomsManagement.AfficherSalleDispo();
            System.out.println("Veuillez choisir une salle disponible (entrer son numero ) : ");
            int id = Scan.nextInt();
            salle = RoomsManagement.salles.get(id);
        }
        newDiff.idDiffusion = DiffusionCount++;

        Diffusions.add(newDiff);
        this.DiffusionCount++;
    }

    public void ModifierDiffusion(int idDiffusion) {
        if (Diffusions.get(idDiffusion).idDiffusion == idDiffusion) {
            return;
        }

    }

    public void SupprimerDiffusion(int idDiffusion) {
        if (Diffusions.get(idDiffusion).idDiffusion == idDiffusion) {
            Diffusions.remove(idDiffusion);
            return;
        }
    }
}
