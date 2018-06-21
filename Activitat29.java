package Program2;

import java.util.Scanner;

public class Activitat29 {
	public static void main (String[] args) {
		int numero;
		int numeroUsuari;
		int intent2;
		int intent3;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("L’ordinador pensa un número entre 1 i 10, 3 intens");
		
		numero= (int) ((Math.random()*10)+1);
		
		System.out.print("Intentar endivinar el numero secret del 1 al 10 primer intent :");
		numeroUsuari = lector.nextInt();
		lector.nextLine();
		
		if (numeroUsuari==numero) {
			System.out.print("Enhorabona l'has clavat");
		}
		else if ((numeroUsuari>10) || (numeroUsuari<0) ) {
			System.out.println("Te que ser del 1 al 10");
		}
			else {
				System.out.print(" has fallat tens un altre intet: ");
				intent2 = lector.nextInt();
				lector.nextLine();
				
				if (intent2==numero) {
					System.out.print("Enhorabona l'has clavat");
				}
				else if ((intent2>10) || (intent2<0) ) {
					System.out.println("Te que ser del 1 al 10");
				}
						else {
								System.out.print(" has fallat tens un altre intet: ");
									intent3 = lector.nextInt();
										lector.nextLine();
										if (intent3==numero) {
											System.out.print("Enhorabona l'has clavat");
										}	
										else if ((intent2>10) || (intent2<0) ) {
											System.out.println("Te que ser del 1 al 10");
										}
										else {
											System.out.print(" has fallat,Tens molta mala sort ");
										}
										
							}
			}
		
		lector.close();
	}
}
