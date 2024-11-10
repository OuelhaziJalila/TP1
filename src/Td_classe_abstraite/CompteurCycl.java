package Td_classe_abstraite;

public class CompteurCycl extends Compteur {
	public static final int MAX=4;

	public void incrementer() {
		if(courant<MAX) {
			courant+=1;
		}
		else {
			courant=MIN;
		}
	}
}
