package Program2;

import java.util.Scanner;

public class Activitat15 {
	public static void main (String [] args){
		int Num;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir un número i visualitzar si és positiu, negatiu o neutre");
		
		Num = lector.nextInt();
		
		if (Num > 0){
			System.out.println("El Numero "+Num+" es positiu");
		}
		if (Num == 0){
			System.out.println("El Numero "+Num+" es neutre");
		} else {
			System.out.println("El Numero "+Num+" es negatiu");
		}
		lector.close();
		
	}
}
