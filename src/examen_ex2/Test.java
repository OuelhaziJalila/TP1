package examen_ex2;

public class Test {
    public static void main(String[] args) {
        Epreuve ep = new Epreuve("100m haies féminin", 2);

        Athlete a1 = new Athlete(1, "Ahmed");
        Athlete a2 = new Athlete(2, "Eya");

        ep.ajoutAthlete(a1);
        ep.ajoutAthlete(a2);

        System.out.println(ep);

        try {
            ep.fixeResultat(1, new ResultatDistance(13.8)); 
            ep.fixeResultat(2, new ResultatDistance(10.9)); 
        } catch (IllegalStateException e) {
            System.out.println("C'est impossible " );
        }

        ep.terminer();

        System.out.println(ep);

        try {
            ep.fixeResultat(1, new ResultatDistance(14.0));
        } catch (IllegalStateException e) {
            System.out.println("C'est impossible ");
        }

        
    }
}