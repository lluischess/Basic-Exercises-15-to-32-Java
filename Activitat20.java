package Program2;
import java.util.Scanner;
public class Activitat20 {
	public static void main (String[] args) {
		int min;
		int variable1;
		int variable2;
		int variable3;
		int variable4;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Elaborar un programa que determini en una variable MIN el més petit dels valors de 4 variables A,B,C,D ");
		System.out.print("Introduir 4 variables:");
		
		variable1 = lector.nextInt();
		lector.nextLine();
		variable2 = lector.nextInt();
		lector.nextLine();
		variable3 = lector.nextInt();
		lector.nextLine();
		variable4 = lector.nextInt();
		lector.nextLine();
		
		
		if  (variable1<variable2 && variable1<variable3 && variable1<variable4)  {
			min = variable1;
			System.out.println("La variable1: "+min+" es la mes petita");
		}
		else if  (variable2<variable1 && variable2<variable3 && variable2<variable4 || variable2==variable1|| variable2==variable3|| variable2==variable4)  {
			min=variable2;
			System.out.println("La variable2: "+min+" es la mes petita");
		}
		
		else if  (variable3<variable1 && variable3<variable2 && variable3<variable4 || variable3==variable1|| variable3==variable2|| variable3==variable4) {
			min=variable3;
			System.out.println("La variable3: "+min+" es la mes petita ");
		}
		else if (variable4<variable1 && variable4<variable2 && variable4<variable3 || variable4==variable1|| variable4==variable2|| variable4==variable3) {
			min=variable4;
			System.out.println("La variable4: "+min+" es la mes petita ");
		}
		lector.close();
	}
}
