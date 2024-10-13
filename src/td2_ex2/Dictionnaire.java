package td2_ex2;
public class Dictionnaire {
    private int nbMots;
    private MotDico[] dico;
    private String nom;

    public Dictionnaire(String nom, int TM) {
        this.nom = nom;
        this.dico = new MotDico[TM];
        this.nbMots = 0;
    }
    public String getNom() {
        return nom;
    }
    public MotDico getMot(int a) {
        if (a >= 0 && a < nbMots) {
            return dico[a];
        }
        return null;
    }
    public void ajouterMot(MotDico m) {
        if (nbMots < dico.length) {
            dico[nbMots] = m;
            nbMots++;
        } else {
            System.out.println("Non,impossible d'ajouter de nouveaux mots ");
        }
    }

    public void supprimerMot(String ch) {
        int a = chercherMot(ch);
        if (a != -1) {
            for (int i = a; i < nbMots - 1; i++) {
                dico[i] = dico[i + 1];
            }
            dico[nbMots - 1] = null; 
            nbMots--;
        } else {
            System.out.println("Mot non trouvé.");
        }
    }

    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot().equalsIgnoreCase(ch)) {
                return i;
            }
        }
        return -1; 
    }

    public void listerDico() {
        for (int i = 0; i < nbMots; i++) {
            System.out.println("le mot : " + dico[i].getMot() + ", de definition : " + dico[i].getDefinition());
        }
    }

    public int nbSynonymes(MotDico m) {
        int compteur = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].synonyme(m)) {
            	compteur++;
            }
        }
        return compteur;
    }
}