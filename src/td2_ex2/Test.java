package td2_ex2;


public class Test {
    public static void main(String[] args) {
    	Dictionnaire larousse = new Dictionnaire ("Larousse",200);
        MotDico mot1 = new MotDico("Lapin", "Est un animal domestique");
        MotDico mot2 = new MotDico("loup", "n'est pas un animal domestique");
        MotDico mot3 = new MotDico("chat", "Est un animal domestique");
        larousse.ajouterMot(mot1);
        larousse.ajouterMot(mot2);
        larousse.ajouterMot(mot3);
        System.out.println("Le contenu du dictionnaire est :");
        larousse.listerDico();
        
        String mot = "chien";
        int pos = larousse.chercherMot(mot);
        if (pos == -1) {
            System.out.println(mot + "; ce mot n'existe pas dans le dictionnaire");
        }

        mot = "chat"; 
        pos = larousse.chercherMot(mot);
        if (pos != -1) {
            MotDico motTrouve = larousse.getMot(pos);
            if (motTrouve != null) {
                System.out.println("Le mot trouvé : " + motTrouve.getMot() + " de définition : " + motTrouve.getDefinition());
            }
        }

        System.out.println("Nombre de synonymes de 'loup' : " + larousse.nbSynonymes(mot2));

        larousse.supprimerMot("loup");
        System.out.println("Le contenu du dictionnaire après la suppression sera :");
        larousse.listerDico();
    }
}