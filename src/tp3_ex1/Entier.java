package tp3_ex1;

public class Entier {
	public static int valeur = 0;
	public static int factoriel(int n) {
		int fact=1,i;
		for(i=1;i<n;i++) {
			fact=i*fact;
		}
		return fact;
		
	}

public static void absolu(int n) {
	if(n<0)
		System.out.println("la valeur absolue de "+ n+" est"+n*(-1));
	else
		System.out.println("la valeur absolue de "+n+" est"+n);
}

public static void comparer(int e1,int e2) {
	if(e1>e2)
		System.out.println("e1 est superieur a e2");
	else if(e1<e2)
		System.out.println("e2 est superieur a e1");	
	else 
		System.out.println( "e1 et e2 sont egaux");
}
public static void premier (int n) {
	if (n>1) {
		int i;
		int a=0;
		i=n-1;
		while(i>1 && a==0) {
			if (n % i==0)
				a+=1;
			i--;}
		if(a==0) {
			System.out.println("le nombre n:"+n+" est premier");}
else {
	System.out.println("le nombre n:"+n+" n'est pas premier");}
	
			
	}	
}

}
