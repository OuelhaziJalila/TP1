package td_ex4;

public class Livre {
	private String titre, auteur; 
	private float nbPages;
	private double prix;
	private boolean prixFixe;
	
public Livre() {
	titre = "";
	auteur ="";
	nbPages = 0;
	prix = 0;
	prixFixe = false;
}
public Livre (String titre, String auteur) { 
	this.auteur = auteur;
	this.titre = titre;
}
public Livre(String titre, float nbPages) {
	this.titre = titre;
	this.nbPages = nbPages;
}
public Livre(String titre, String auteur, float nbPages, double prix) {
	this.auteur = auteur;
	this.titre = titre;
	this.nbPages = nbPages;
	if (prix>0) {
		this.prix = prix;
		this.prixFixe = true;
	}
	else {
		this.prixFixe = false;
	}
}
public String getAuteur() { 
	return auteur;
}
public String getTitre() { 
	return titre;
}
public float getNbPages() { 
	return nbPages;
}
public double getPrix() {
	return prix;
}
public String setAuteur (String a) { 
	return auteur = a;
}
public String setTitre (String T) { 
	return titre = T;
}
public float setNbPages (float n) { 
	if(n<=20) {
		System.out.println("veuillez changer le nombre !");
		return nbPages;
	}
	else
		return nbPages = n;
	}
public void setPrix(double P) {
	if (!prixFixe) {
		this.prix = P;
	    this.prixFixe = true; 
	} 
	else {
		System.out.println("Le prix est modifié une seule fois!");
	}
}
public boolean testPrix() {
	return prixFixe;
}
public String toString() {
	return "Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages+" de prix : "+prix+"dt" ;
}

public String decrire() {
	return "Voici la description du livre : "+toString();
}		  
}
