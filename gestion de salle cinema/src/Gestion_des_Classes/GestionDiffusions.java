package Gestion_des_Classes;
import ClassesBase.Diffusion;
import ClassesBase.Film;
import ClassesBase.Salle;
import java.sql.Date;
import java.util.ArrayList;

public class GestionDiffusions {

    ArrayList<Diffusion> Diffusions = new ArrayList<Diffusion>();

    public void addDiffusion(Date date, Film film, Salle salle, int hourdebut, int minutedebut, int hourfin, int minutefin) {
        Diffusion newDiff = new Diffusion(date, film, salle, hourdebut, minutedebut, hourfin, minutefin);
        if (salle.Available == true) {
            salle.Available = false;
        } else {
            System.out.println("La salle n'est pas disponible");
        }
        Diffusions.add(newDiff);
    }

    public void ModifierDiffusion(int idDiffusion){
        for (Diffusion diffusion : Diffusions) {
            if (diffusion.idDiffusion == idDiffusion) {
                
                return;
            }
        }
    }

    public void SupprimerDiffusion(int idDiffusion){
        for (Diffusion diffusion : Diffusions) {
            if (diffusion.idDiffusion == idDiffusion) {
                Diffusions.remove(diffusion);
                return;
            }
        }
    }
}
