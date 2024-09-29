package tp1_ex2;

public class Point {
	private String nom;
	private int abs;
	private int ord;


public Point(int abs,int ord ) {
	this.abs=abs;
	this.ord=ord ;
}
public Point(String nom ) {
	this.nom=nom;
}
public Point(String nom,int abs,int ord) {
	this.nom=nom;
	this.abs=abs;
	this.ord=ord ;
}
public void Affiche() {
	System.out.println(nom+"("+abs+","+ord+")");
}
public void TranslHoriz(int a) {
	abs+=a;	
}
public void TranslVert (int a) {
	ord+=a;
}
public void Translation (int a, int b) {
	abs+=a;	
	ord+=b;
}
public boolean Coïncide(Point p) {
    return this.abs == p.abs && this.ord == p.ord;
}
public String getNom() {
    return nom;
}

public int getAbs() {
    return abs;
}

public int getOrd() {
    return ord;
}

public void setNom(String ch) {
    this.nom = ch;
}

public void setAbs(int a) {
    this.abs = a;
}

public void setOrd(int a) {
    this.ord = a;
}

}