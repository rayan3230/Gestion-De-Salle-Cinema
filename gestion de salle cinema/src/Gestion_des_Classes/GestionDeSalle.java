package Gestion_des_Classes;

import ClassesBase.Salle;
import java.util.ArrayList;

public class GestionDeSalle {
    ArrayList<Salle> salles = new ArrayList<Salle>();
    public int RoomCount = -1;

    public void AddSalle(int NormalCapacity, int VipCapacity) {
        Salle salle = new Salle(NormalCapacity, VipCapacity);
        salle.SalleId = RoomCount++;
        salles.add(salle);
        this.RoomCount++;
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

    public void MeethorsService(int salleID) {
        for (Salle salle : salles) {
            if (salle.SalleId == salleID) {
                salle.Available = false;
                return;
            } else {
                System.out.println("Salle n'existe pas");
            }
        }
    }

    public void RemettreEnService(int salleID) {
        for (Salle salle : salles) {
            if (salle.SalleId == salleID) {
                salle.Available = true;
                return;
            } else {
                System.out.println("Salle n'existe pas");
            }
        }
    }

    public void AfficherSalleDispo() {
        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).Available == true) {
                System.out.println(i + " - La salle est disponible");
            }
            return;
        }
    }

    public void AfficherSalle() {
        for (Salle salle : salles) {
            if (salle.Available == true) {
                System.out.println(salle.SalleId + " - La salle est disponible");
            } else {
                System.out.println(salle.SalleId + " - La salle n'est pas disponible");
            }
            return;
        }
    }
}