package tp1_ex1;

public class Point {
	private char id;
	private double abs ;

public Point (char c,double x) {
	id=c;
	abs=x;
}
public void affiche(){
	System.out.println("Point identifié par"+id+"d'abcisse"+abs);
}

public void translate(double dx) {
	abs+=dx;
}
}

