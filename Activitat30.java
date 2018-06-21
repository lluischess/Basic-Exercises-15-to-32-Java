package Program2;

import java.util.Scanner;
public class Activitat30{

	public static void main(String[] args) {
		Scanner teclat = new Scanner (System.in);
		
		
		String lletra;
		char variable;
		
		System.out.print("Introdueix una lletra: ");
		lletra=teclat.next();
		teclat.nextLine();
		
		variable=lletra.charAt(0);
		
		
		if(variable>='A' && variable<='Z'){
				System.out.println("La lletra es majuscula");
		}else{
			if(variable>=97 && variable<=122){
				System.out.println("La lletra es minuscula");
			}
			else{
				System.out.print("Error");
			}	
		}
	teclat.close();
	}
}
	