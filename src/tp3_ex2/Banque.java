package tp3_ex2;

public class Banque {
	public static void main(String[] args) {
	Compte co1=new Compte();
	Compte co2=new Compte();
	co1.deposer(1200);
	co2.deposer(500);
	System.out.println("le solde du 1er compte est :"+co1.avoirSolde());
	System.out.println("le solde de 2eme compte est :"+co2.avoirSolde());
	co2.transferer(700,co1);
	co2.retirer(700);
	System.out.println("le solde du 1er compte est :"+co1.avoirSolde());
	System.out.println("le solde de 2eme compte est :"+co2.avoirSolde());
	if (co2.avoirSolde() < 0) {
        System.out.println("Le 2ème compte est en rouge avec un solde de : " + co2.avoirSolde());
    }
    
    if (co1.avoirSolde() < 0) {
        System.out.println("Le 1er compte est en rouge avec un solde de : " + co1.avoirSolde());
    }
}
}