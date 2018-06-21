package Program2;
import java.util.Scanner;
public class Activitat19 {
	public static void main (String[] args) {
		int min;
		int variable1;
		int variable2;
		int variable3;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Elaborar un programa que determini en una variable MIN el més petit dels valors de 3 variables A,B,C");
		System.out.print("Introduir 3 variables:");
	
		variable1 = lector.nextInt();
		lector.nextLine();
		variable2 = lector.nextInt();
		lector.nextLine();
		variable3 = lector.nextInt();
		lector.nextLine();
		
		min = variable1;
		
		if  (variable1<variable2 && variable1<variable3)  {
			System.out.println("La variable1: "+min+" es la mes petita");
		}
		else if  (variable2<variable1 && variable2<variable3)  {
			min=variable2;
			System.out.println("La variable2: "+min+" es la mes petita");
		}
		else {
			min=variable3;
			System.out.println("La variable3: "+min+" es la mes petita ");
		}
		lector.close();
		
	}
}
