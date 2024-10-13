package tp3_ex3;

public class test {
	public static void main(String[] args) {
		Maison m1=new Maison("Tunis "," un duplex ",4,210);
		Maison m2=new Maison("Tunis "," une villa ",5);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
		m2.setSurface(230);
		float p1;
		float p2;
		p1=m1.calculPrix();
		p2=m2.calculPrix(2000);
		System.out.println("le prix de m1 est : "+p1);
		System.out.println("le prix de m2 est : "+p2);
		
		
		
		
	}

}
