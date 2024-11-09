package tp6_ex1;

public class Cuillere extends Ustensile {
	private double longueur;
	
	
    public Cuillere(int annee, double longueur) {
        super(annee);
        this.longueur=longueur;
    }
    public double getLongueur() {
        return longueur;
    }
    public double calculerValeur() {
        double age = 2019 - getAnnee();
        if (age <= 50) {
            return 0;
        } else {
            return age - 50;  
        }
    }
}
