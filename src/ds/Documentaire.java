package ds;

public class Documentaire extends Film{
	private String sujet;
	private float tarif=2;
	
	public Documentaire (String titre, String real, String pays, int duree,String sujet){
		super(titre,real,pays,duree);
		this.sujet=sujet;
	}
	
	public String toString() {
        return titre+"sujet :"+sujet+"realisé par "+real+"("+pays+")"+duree+" min .";
    }
	 public float totalVenteBillets() {
		 float tarif_total=getNb()*tarif;
		 return tarif_total;
	        }
	
	        
}
