package tp1_ex1;

public class Point{
	private char id ;
	private int abs ;
	
public Point(char id,int abs) {
	this.id=id;
	this.abs=abs;
}
public void affiche() {
	System.out.println("Point identifié par "+id+" d'abcisse "+abs);
	
}
public void translate(int a) {
	this.abs+=a;
	
}
	
	
}









