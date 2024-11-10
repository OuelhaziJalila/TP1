package Td_classe_abstraite;

abstract class Compteur {
	public static final int MIN=0;
	protected int courant;
	
public Compteur() {
	this.courant=MIN;
		
	}
public void raz() {
	this.courant=0;
}
public abstract void incrementer();
public int getCourant() {
	return this.courant;
}
}
