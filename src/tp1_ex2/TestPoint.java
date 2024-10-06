package tp1_ex2;

public class TestPoint{
	public static void main(String arg[]) {
		Point p1;
		p1 = new Point (3, 5);
		Point p2 = new Point ("a");
		Point p3 = new Point ("b", 3,5);
		System.out.println(" ---------------------");
		System.out.println("les points créés sont :");
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		System.out.println(" ---------------------------");
		if (p1.Coincide(p3) ==true) {
			System.out.println("Les 2 points p1 et p3 coïncident");}
		else {
			System.out.println("Les 2 points ne coïncident pas");	
			}
		System.out.println("---------------------------");
		System.out.println("translation des point ");
		p1.TranslHoriz (4);
		p2.TranslVert (3);
		p3.Translation (5,2);
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		System.out.println(" --------------------------");
		System.out.println("modification des attributs des points") ;
		p1.setNom("SRI21");
		p2.setAbs(25);
		p3.setOrd(50);
		p1.Affiche ();
		p2.Affiche ();
		p3.Affiche ();
		System.out.println("---------------------------");
		System.out.println("utilisation des méthodes get");
		String x=p1.getNom();
		int y=p1.getAbs();
		int z=p1.getOrd();
		System.out.println(" le nom du point p1 est : " + x);
		System.out.println(" son abscisse est :" + y);
		System.out.println("son ordonnée est : "+ z);
	}	
}


















