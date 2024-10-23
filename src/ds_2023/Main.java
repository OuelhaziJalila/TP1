package ds_2023;

public class Main{
	public static void main(String[] args) {
		System.out.println("Pépinière GREEN HANDS");
		Pepiniere pepiniere = new Pepiniere(20);
        Fleur rose = new Fleur(null, 30, 12, 15.99f, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99f, "Jaune", 4);
        Arbre chêne = new Arbre("Chêne", 200, 60, 89.99f, "Caduque");
        Arbre sapin = new Arbre("Sapin", 150, 30, 59.99f, "Persistant");
        rose.setNom("Rose");
        System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());
        pepiniere.ajoutPlante(rose);
        pepiniere.ajoutPlante(tulipe);
        pepiniere.ajoutPlante(chêne);
        pepiniere.ajoutPlante(sapin);
        pepiniere.afficherInventaire();
        System.out.println("Total Absorption CO2 : " + pepiniere.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres dans la pepiniere : "+pepiniere.compterArbresCaduques());
        }
}