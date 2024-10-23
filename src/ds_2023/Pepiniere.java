package ds_2023;

public class Pepiniere  {
	private Plante[] inventaire ;
	private static final int MAX_PLANTES=1000;
	private int nbrPlante=0;
	   public Pepiniere(Plante[] inventaire, int nbrPlante) {
	        this.inventaire = inventaire;
	        this.nbrPlante = nbrPlante;
	    }
    public Pepiniere(int nbrPlante) {
        if (nbrPlante <= MAX_PLANTES) {
            inventaire = new Plante[nbrPlante];
        } else {
        	inventaire = new Plante[MAX_PLANTES];
        }
    }
    public Plante getPlante(int i) {
        if (i >= 0 && i < nbrPlante) {
            return inventaire[i];
        } else {
            System.out.println("Erreur : Index invalide.");
            return null;
        }
    }
    public int getNbrPlante() {
		return nbrPlante;
	}
    public void ajoutPlante(Plante plante) {
        if (nbrPlante < inventaire.length) {
            inventaire[nbrPlante] = plante;
            nbrPlante++;
        } else {
            System.out.println("erreur");
        }
    }
    public void afficherInventaire() {
    	for(int i=0;i<nbrPlante;i++) {
    		System.out.println(inventaire[i].toString());
    		
    	}
    }
    public double totalAbsorptionTotaleCO2() {
        double absorptionTotale = 0;
        for (int i = 0; i < nbrPlante; i++) {
            if (inventaire[i] instanceof Arbre) {
                absorptionTotale += ((Arbre) inventaire[i]).absorption();
            }
        }
        return absorptionTotale;
    }
    public int compterArbresCaduques() {
        int cpt = 0;
        for (int i = 0; i < nbrPlante; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre arbre = (Arbre) inventaire[i];
                if (arbre.getType_Feuillage().equalsIgnoreCase("Caduque")) {
                    cpt++;
                }
            }
        }
        return cpt;
    }
}
