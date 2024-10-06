package td_ex3;
public class Livre {
	private String titre, auteur; 
	private float nbPages;

public Livre (String titre, String auteur) { 
	this.auteur = auteur;
	this.titre = titre;
}

public Livre() {
	titre = "";
	auteur ="";
	nbPages = 0;
}
	
public Livre(String titre, float nbPages) {
	this.titre = titre;
	this.nbPages = nbPages;
}
public Livre(String auteur, String titre, float nbPages) {
	this.auteur = auteur;
	this.titre = titre;
	this.nbPages = nbPages;
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
	public String setAuteur (String a) { 
		return auteur = a;
	}
	public String setTitre (String T) { 
		return titre = T;
	}
	public float setNbPages (float n) { 
		if(n<=20) {
			System.out.println("veuillez changer le nombre !");
			return nbPages;}
		else {
		return this.nbPages = n;}
	}

public String toString() {
	return " Livre intitulé "+titre+" de "+auteur +" contenant "+ nbPages + "pages.";
}
public String decrire() {
	return "Voici la description du livre : "+toString();
}	
}






























