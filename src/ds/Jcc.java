package ds;

public class Jcc {
	private final int NBFMAX = 30;
	private Film[] competition;
	private int annee;
	 private int nbF = 0;
	 public Jcc(int t,int NBFMAX) {       
	        if(t<NBFMAX)
	        this.competition = new Film[t]; 
	        this.annee = annee;
	        
	    }
	 public void ajouterFilm(Film f) {
		 if(nbF<competition.length) {
			 competition[nbF]=f;
			 nbF++;
		 }else {
			 System.out.println("la competition est au complet");
		 }
		 
	 }
	 public void listeFilmsJCC () {
		 if(nbF==0) {
			 System.out.println("la competiton est vide");
		 }else {
			 for(int i=0;i<nbF;i++){
				 System.out.println(competition[i]);
				 
			 }
		 }
	 }
	public float  totalVenteBilletsJCC () {
		float t=0;
		for (int i=0;i<nbF;i++) {
			t+=competition[i].totalVenteBillets ();
		
	}return t;}
	public static void main(String arg[]) {
		Jcc j=new Jcc(2,2021);
		Documentaire f1=new Documentaire("le dernier refuge ","Ousman "," Mali ",86," la guerre civile ");
		Film f2= new Film("Insurrection","Jilani Saadi","Tunisie ",105);
		j.ajouterFilm(f1);
		f1.setNb(30);
		j.ajouterFilm(f2);
		f1.setNb(45);
		j.listeFilmsJCC ();
		float total=j.totalVenteBilletsJCC ();
		System.out.println("le total de vente de billets"+total);
		
	}

}
