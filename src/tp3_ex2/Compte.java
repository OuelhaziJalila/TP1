package tp3_ex2;

public class Compte {
	private int num;
	private float solde;
	public static int count=0;
	
public Compte() {
	count ++;
	num=count;
	solde=0;
}
public float deposer(float m ) {
	return solde +=m;
	
}
public float retirer(float m) {
	return solde+=m;	
}
public float avoirSolde() {
	return solde;
}
public void transferer(float m,Compte c) {
	c.retirer(m);
	c.deposer(m);
}
}