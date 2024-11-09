package tp6_ex1;

public abstract class Ustensile {
	    protected int annee;

	    public Ustensile(int annee) {
	        this.annee = annee;
	    }

	    public double getAnnee() {
	        return annee;
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
