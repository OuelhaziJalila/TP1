package les_interfaces;

public class Test {
	public static void main(String[] args) {
		Agence a1= new Agence() ;
		Voiture v1=new Voiture ("clio","aa",2000,100);
		Voiture v2=new Voiture ("BMW","x8",2006,50);
		Voiture v3=new Voiture ("mercedes","bb",2000,400);
		Voiture v4=new Voiture ("range","cc",2000,300);
		a1.Ajout(v1);
		a1.Ajout(v2);
		a1.Ajout(v3);
		a1.Ajout(v4);
		CriterePrix c1=new CriterePrix(100);
		CritereMarque c2=new CritereMarque
				("clio");
		a1.afficheSelection(c1);
		a1.afficheSelection(c2);

		

		
			
		}



		
		
		
		
		
		
	}

