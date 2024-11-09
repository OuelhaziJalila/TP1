package tp6_ex1;

public class Collection {
	public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuillere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);
		
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
	}
		static void afficherSurfaceAssiettes(Ustensile[] us) {
			double SrfT = 0;
		    for (int i = 0; i<us.length; i++)  {
		        if (us[i] instanceof Assiette) {
		            SrfT+=((Assiette)us[i]). calculerSurface();
		        }
		    }
		System.out.println("Surface total"
				+ ""
				+ ""
				+ ""
				+ "e des assiettes : " + SrfT);
		}
		static void afficherValeurTotale(Ustensile[] us) {
		    double vT = 0;
		    for (int i = 0; i<us.length; i++) {
		        vT += us[i].calculerValeur();
		    }
		    System.out.println("La Valeur totale de la Collection : " + vT);
		}
	
	
	 static void afficherCuilleres(Ustensile[] us) {
		 int nbC= 0;
	        for(int i = 0; i<us.length; i++) {
	            if (us[i] instanceof Cuillere) {
	                nbC++;
	            }
	        }
	        System.out.println("Il y a " + nbC + " cuillères.");
	    }

	
}
