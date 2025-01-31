package Gestion_des_Classes;

import ClassesBase.Salle;
import java.util.ArrayList;

public class GestionDeSalle {
    public ArrayList<Salle> salles = new ArrayList<Salle>();
    public int RoomCount = 0;

    public void AddSalle(int NormalCapacity, int VipCapacity) {
        Salle salle = new Salle(NormalCapacity, VipCapacity);
        salle.SalleId = RoomCount;
        RoomCount++;
        salle.Available = true;
        salles.add(salle);
    }

    public void ModifierSalle(int salleID, int NewNormalCapacity, int NewVipCapacity) {
        if (salles.get(salleID) != null) {
            salles.get(salleID).NormalCapacity = NewNormalCapacity;
            salles.get(salleID).VipCapacity = NewVipCapacity;
            return;
        } else {
            System.out.println("Salle n'existe pas");
        }
    }

    public void MettrehorsService(int salleID) {
        salles.get(salleID).Available = false;
        return;
    }

    public void RemettreEnService(int salleID) {
        salles.get(salleID).Available = true;
        return;
    }

    public void AfficherSalleDispo() {
        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).Available == true) {
                System.out.println(i + " - La salle est disponible");
            }

        }
        return;
    }

    public void AfficherSalle() {
        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).Available == true) {
                System.out.println(
                        salles.get(i).SalleId + "   - capacite normal  : " + salles.get(i).NormalCapacity
                                + "  capacite VIP  :  "
                                + salles.get(i).VipCapacity + "   --- La salle est disponible ---");
            } else {
                System.out.println(
                        salles.get(i).SalleId + "   - capacite normal  : " + salles.get(i).NormalCapacity
                                + "  capacite VIP  :  "
                                + salles.get(i).VipCapacity + "   --- La salle n'est pas disponible ---");
            }

        }
        return;
    }

    public void isSalleDispo(int SalleId) {
        if (salles.get(SalleId).Available == true) {
            System.out.println(salles.get(SalleId).SalleId + "   - capacite normal  : "
                    + salles.get(SalleId).NormalCapacity + "  capacite VIP  :  "
                    + salles.get(SalleId).VipCapacity + "   --- La salle est disponible ---");
        } else {
            System.out.println(salles.get(SalleId).SalleId + "   - capacite normal  : "
                    + salles.get(SalleId).NormalCapacity + "  capacite VIP  :  "
                    + salles.get(SalleId).VipCapacity + "   --- La salle n'est pas disponible ---");
        }
        return;
    }
}