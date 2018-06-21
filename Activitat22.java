package Program2;

import java.util.Scanner;

public class Activitat22 {
	public static void main (String [] args){
		int A;
		int B;
		int X;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Tenint  en  compte  la  següent  equació x=10*a/b.  Demanar  per  teclat  el  valor de a i b per a "
				+ "calcular el valor de X, tenint en compte que la divisió  per cero donaria un error.");
		
		System.out.println("Introdueix el valor de A");
		A = lector.nextInt();
		
		System.out.println("Introdueix el valor de B");
		B = lector.nextInt();
		
		
		if (B != 0){
			X = (10 * A) / B;
			System.out.println("El resultat es: "+X);
		} 
	    if (B==0){
	    	System.out.println("El divident no pot ser 0");
	    }
	lector.close();
		
		
	}
}
