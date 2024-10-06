package td_ex3;

public class TestLivre {

	public static void main(String[] args) {
		Livre[] T = new Livre[3];
		T[0] = new Livre(" L'alchimiste","Coelho",225);
		T[1] = new Livre(" La tunisie",508);
		T[2] = new Livre("Harry Potter","JK Rowling");
		for (int i=0;i<T.length;i++) {
	        System.out.println(T[i].decrire());
		}
		T[0].setAuteur("Paulo Coelho");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Le tableau apres le changement :");
		for (int i=0;i<T.length;i++) {
	        System.out.println(T[i].decrire());
		}
		T[2].setNbPages(461);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println(" Le tableau apres le changement :");
		for (int i=0;i<T.length;i++) {
	        System.out.println(T[i].decrire());
		}
	}
}