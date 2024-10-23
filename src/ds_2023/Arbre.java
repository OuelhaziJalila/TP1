package ds_2023;


public class Arbre extends Plante {
	private String type_Feuillage;
	private static final int AbsorMoyenne=22;
	public Arbre(String nom, float hauteur, int age, float prix, String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage = type_Feuillage;
	}
	public String toString() {
		return super.toString()+" type_Feuillage=" + type_Feuillage ;
	}
	public void description() {
		System.out.println(toString());
	}
	
	public String getType_Feuillage() {
		return type_Feuillage;
	}
	public void setType_Feuillage(String type_Feuillage) {
		this.type_Feuillage = type_Feuillage;
	}
	public double absorption() {
		int ab=0;
		if(hauteur>50) {
			 ab+=AbsorMoyenne*3;
		}
		else 
			 ab+=AbsorMoyenne;
		return ab;
	}
	
	
	

}

