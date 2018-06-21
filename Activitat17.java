package Program2;

import java.util.Scanner;

public class Activitat17 {
	public static void main (String [] args){
		int Num;
		int Resul;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Llegir un número pel teclat, si aquest es més gran de 20 mostrar com a resultat el número elevat a dos en cas contrari mostrar com a resultat el número elevat a 3.");
		
		System.out.println("Introdueix un numero");
		Num = lector.nextInt();
		
		if (Num > 20) {
			Resul = Num*Num;
			System.out.println("El numero es elevat a: "+Resul);
		}
		if (Num < 20) {
			Resul = Num*Num*Num;
			System.out.println("El numero es elevat a: "+Resul);
		}
		
		lector.close();
		
	}
}
