package tp3_ex3;

public class Maison {
	private String adr;
	private String type;
	private int nbchambre;
	private float surface;
	
public Maison (String adr,String t,int n) {
	this.adr=adr;
	type=t;
	nbchambre=n;
}
Maison (String adr, String t, int n, float s){
	this.adr=adr;
	type=t;
	nbchambre=n;
	surface=s;
}
public void setSurface(float s) {
    this.surface = s;
}
public float calculPrix(float pmc){
	return (this.surface*pmc);
}
public float calculPrix() {
	return (this.surface*2100);	
}
public String toChaine() {
	return(this.type+"de "+this.surface+"m² "+this.adr+" avec "+this.nbchambre);
	}

}
