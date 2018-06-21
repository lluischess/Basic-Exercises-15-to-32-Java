package Program2;

import java.util.Scanner;

public class Activitat25 {
public static void main(String[] args) {
		
		double nota;

			
		Scanner teclat = new Scanner (System.in);
		System.out.print("Introdueix la nota: ");
		nota = teclat.nextDouble();
			
		teclat.nextLine();
		if ( nota >= 9 && nota <= 10) {
			System.out.print("Excel�lent");	
		}else { 
			if (nota >= 6.5 && nota < 9 ){ 
				System.out.print("Notable");
			}else { 
				if (nota >= 5 && nota < 6.5){ 
					System.out.print("Suficient");	
				}
				else{
					System.out.println("Aquesta nota no es pot processar");
				}
			}
		}
	teclat.close();
	
	}
	
}

