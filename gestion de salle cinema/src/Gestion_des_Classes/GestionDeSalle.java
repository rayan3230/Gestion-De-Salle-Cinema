package Gestion_des_Classes;

import ClassesBase.Salle;
import java.util.ArrayList;

public class GestionDeSalle {
    ArrayList<Salle> salles = new ArrayList<Salle>();

    public void AddSalle(int salleID, int NormalCapacity, int VipCapacity) {
        Salle salle = new Salle(salleID, NormalCapacity, VipCapacity);
        salles.add(salle);
    }

    public void ModifierSalle(int salleID, int NewNormalCapacity, int NewVipCapacity) {
        for (Salle salle : salles) {
            if (salle.SalleId == salleID) {
                salle.NormalCapacity = NewNormalCapacity;
                salle.VipCapacity = NewVipCapacity;
                return;
            } else {
                System.out.println("Salle n'existe pas");
            }
        }
    }

    public void horsService(int salleID) {
        for (Salle salle : salles) {
            if (salle.SalleId == salleID) {
                salle.Available = false;
                return;
            } else {
                System.out.println("Salle n'existe pas");
            }
        }
    }

    public void AfficherSalleDispo(int salleID) {
        for (Salle salle : salles) {
            if (salle.SalleId == salleID) {
                if (salle.Available == true) {
                    System.out.println("La salle est disponible");
                } else {
                    System.out.println("La salle n'est pas disponible");
                }
                return;
            } else {
                System.out.println("Salle n'existe pas");
            }
        }
    }
}