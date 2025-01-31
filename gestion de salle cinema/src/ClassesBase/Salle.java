package ClassesBase;

public class Salle {
    public int SalleId;
    public int NormalCapacity;
    public int VipCapacity;
    public Boolean Available;

    public Salle(int NormalCapacity, int VipCapacity) {
        this.NormalCapacity = NormalCapacity;
        this.VipCapacity = VipCapacity;
    }

}
