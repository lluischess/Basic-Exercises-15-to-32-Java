package Program2;

import java.util.Scanner;

public class Activitat16 {
	public static void main (String [] args){
		int Num;
		int Num2;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir dos números per teclat i indicar quin és més gran dels dos.");
		System.out.println("Introduir dos números");
		Num = lector.nextInt();
		Num2 = lector.nextInt();
		
		if (Num == Num2){
			System.out.println("Els numeros "+Num+" "+Num2+" Son iguals");
		}
		if (Num < Num2){
			System.out.println("El numero "+Num+" es mes petit: "+Num2);
		}if (Num > Num2){
			System.out.println("El numero "+Num+" es mes gran: "+Num2);
		}
		lector.close();
	}	
}
