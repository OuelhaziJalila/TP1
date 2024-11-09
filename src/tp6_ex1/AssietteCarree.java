package tp6_ex1;

public class AssietteCarree extends Assiette{
	 private double cote;

	    public AssietteCarree(int annee, double cote) {
	        super(annee);
	        this.cote = cote;
	    }

	    public double getCote() {
	        return cote;
	    }
	    public double calculerSurface() {
	        return cote*cote;
	    }
	    public double calculerValeur() {
	        double age = 2019 - getAnnee();
	        if (age <= 50) {
	            return 0;
	        } else {
	            double vr = age - 50;  
	            return 5 * vr; 
	        }
	    }

}