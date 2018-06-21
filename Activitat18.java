package Program2;
import java.util.Scanner;
public class Activitat18 {
	public static void main (String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int suma1;
		int suma2;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir 4 números i dir si la suma dels dos primers és més gran, igual o més petit que la suma dels 2 següents.");
		System.out.print("Introduir 4 numeros:");
		numero1 = lector.nextInt();
		lector.nextLine();
		numero2 = lector.nextInt();
		lector.nextLine();
		numero3 = lector.nextInt();
		lector.nextLine();
		numero4 = lector.nextInt();
		lector.nextLine();
		
		suma1 = numero1 + numero2;
		suma2 = numero3 + numero4;
		
		if  (suma1==suma2)  {
			System.out.println("La primera suma:Es igual a la segona ");
		}
		else if (suma1>suma2) {
			System.out.println("La primera suma:Es mes gran ");
		}
		else {
			System.out.println("La primera suma:Es mes petita ");
		}
		lector.close();
		}
		
		
	}

