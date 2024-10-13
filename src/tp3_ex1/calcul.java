package tp3_ex1;

import tp1_ex3.MaDate;

public class calcul {
	public static void main(String[] args) {
		Entier b= new Entier();
		
		System.out.println("le factoriel de 5 est"+Entier.factoriel(5));
		Entier.absolu(5);
		Entier.comparer(2,20);
		b.premier (5);
		Entier.valeur++;
        System.out.println("La valeur après première incrémentation : " + Entier.valeur);

        b.valeur++;
        System.out.println("La valeur après seconde incrémentation : " + b.valeur);
 
	}

}
