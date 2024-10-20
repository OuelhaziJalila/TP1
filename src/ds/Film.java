package ds;
import java.util.Scanner;

public class Film {

	protected String titre,pays,real;
	protected int duree;
	private int nb;
	public Film(String titre, String real, String pays, int duree) {
		this.titre = titre;
		this.real = real;
		this.pays = pays;
		this.duree = duree;
	}	

	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		this.nb = nb;
	}

	public String toString() {
		return titre + " de "+ real + "(" + pays + ")"+" -"+duree+"min.";
}
public float totalVenteBillets () {
	 Scanner a = new Scanner (System.in) ;
	 System.out.print("Veuillez entrer le nombre des étudiants : ");
     int nbEtudiants = a.nextInt();
     a.close();
     
    	 float tarif_etudiant=nbEtudiants *2;
    	 int nbPublic=nb-nbEtudiants;
    	 float tarif_public = nbEtudiants *3;
    	 return tarif_etudiant+tarif_public;}
     
}
