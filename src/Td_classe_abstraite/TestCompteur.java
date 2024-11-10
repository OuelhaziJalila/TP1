package Td_classe_abstraite;
public class TestCompteur {
    public static void main(String[] args) {
        Compteur c1 = new CompteurOrd();
        Compteur c2 = new CompteurCycl();
        for (int i = 0; i < 10; i++) { 
            c1.incrementer();
            c2.incrementer();   
            System.out.println("Itération " + (i + 1) + " :");
            System.out.println("Valeur de CompteurOrd : " + c1.getCourant());
            System.out.println("Valeur de CompteurCycl : " + c2.getCourant());
        }
        c1.raz();
        c2.raz();       
        System.out.println("Après réinitialisation :");
        System.out.println("Valeur de CompteurOrd : " + c1.getCourant());
        System.out.println("Valeur de CompteurCycl : " + c2.getCourant());
    }
}
