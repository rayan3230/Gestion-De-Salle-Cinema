package Gestion_des_Classes;

public class GestionBills {
   
    public void ReserverNormal(int numbilletNormal) {
        
        if (numbilletNormal == 0) {
            System.out.println("No tickets left for this diffusion");
        } else {

            numbilletNormal--;
                System.out.println("Thanks for buying the ticket");
            }
    }

    public void ReserverVIP(int numbilletVip) {
        if (numbilletVip == 0) {
            System.out.println("No tickets left for this diffusion");
        } else {

            numbilletVip--;
            System.out.println("Thanks for buying the ticket");
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
