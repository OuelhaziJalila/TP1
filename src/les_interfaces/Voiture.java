package les_interfaces;

public class Voiture {
	private String marque,nom;
	private int annee, prix;
	
public Voiture(String marque,String nom,int annee,int  prix) {
		this.marque=marque;
		this.nom=nom;
		this.annee=annee;
		this.prix=prix;
	}
	
	public String toString() {
		return "Voiture [marque=" + marque + ", nom=" + nom + ", prix=" + prix + "]";
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	

}
