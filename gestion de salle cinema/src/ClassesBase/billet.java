package ClassesBase;

public class billet {

    // attributes
    public int numbilletNormal;
    public int numbilletVip;

    // Methods
    public billet(Diffusion DIFF) {

        this.numbilletNormal = DIFF.salle.NormalCapacity;
        this.numbilletVip = DIFF.salle.VipCapacity;

    }

    public void ReserverNormal(int numbilletNormal, int Time) {

        if (numbilletNormal == 0) {
            System.out.println("No tickets left for this diffusion");
        } else {

            numbilletNormal--;
            System.out.println("Thanks for buying the ticket");
            System.out.println("Your diffusion is planed to: " + Time + " .");

        }

    }

    public void ReserverVIP(int numbilletVip, int Time) {

        if (numbilletVip == 0) {
            System.out.println("No tickets left for this diffusion");
        } else {

            numbilletVip--;
            System.out.println("Thanks for buying the ticket");
            System.out.println("Your diffusion is planed to: " + Time + " .");

        }

    }

    public void AnnuleNormal(int numbillet) {

        numbillet++;
        System.out.println("Your reservation was canceled successfully");
    }

    public void AnnuleVIP(int numbilletVip) {

        numbilletVip++;
        System.out.println("Your reservation was canceled successfully");
    }

    public void billetleftNormal(int numbillet) {

        System.out.println("The number of tickets left is : " + numbillet);
    }

    public void billetleftVIP(int numbilletVip) {

        System.out.println("The number of tickets left is : " + numbilletVip);
    }

}
