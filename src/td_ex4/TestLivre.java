package td_ex4;

public class TestLivre {

	public static void main(String[] args) {
		Livre[] T = new Livre[3];
		T[0] = new Livre(" L'alchimiste","Paulo Coelho",225,0.00);
		T[1] = new Livre(" La tunisie",508);
		T[2] = new Livre("Harry Potter","JK Rowling");
		for (int i=0;i<T.length;i++) {
	        System.out.println(T[i].decrire());
		}
		System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
        T[0].setPrix(50.5); 
        System.out.println("le prix de 1er livre apres la fixation sera : " + T[0].getPrix());
        T[0].setPrix(16.44); 
        System.out.println("le prix après la 2eme modif sera : " + T[0].getPrix());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Le tableau après le changement :");
        for (int i=0;i<T.length;i++) {
	        System.out.println(T[i].decrire());
		}
	}

}
