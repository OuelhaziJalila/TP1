package les_interfaces;

public class Agence {
	Voiture [] Voitures ;
	private int nbrV=0 ;
	private static final int MAX=1000;
	
	Agence () {
		Voitures=new Voiture[MAX];
	}
	
	public void afficheSelection(Critere c){
		for (int i = 0; i<nbrV; i++) {
			if (c.estSatisfaitPar(Voitures[i])) {
				System.out.println(Voitures[i].toString());
		
	}}
	}
public void Ajout(Voiture v){
	if(nbrV<MAX) {
		Voitures[nbrV]=v;
		nbrV++;
	}
		
}

}
