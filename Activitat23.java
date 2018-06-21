package Program2;

import java.util.Scanner;

public class Activitat23 {
	public static void main (String [] args){
		float A,B,C;
		float arrel, divisio;
		double AResultat,RPositiu,RNegatiu;
		
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Tenint  en  compte  que  una  equació  de  segon  grau  té  aquest  format: aX2+bX+c=0. Demanar per teclat el valor de a , b i c per a calcular els dos valors de X.");
		
		System.out.println("Introdueix A");		
		A = lector.nextFloat();
		lector.nextLine();
		System.out.println("Introdueix B");		
		B = lector.nextFloat();
		lector.nextLine();
		System.out.println("Introdueix C");		
		C = lector.nextFloat();
		lector.nextLine();
		
		//Plantejament de la formula
		arrel= (B*B)-4*A*C;
		divisio =2*A;
		
		//Calcular els dos resultats
		if ((arrel != 0) && (divisio != 0)) {
			AResultat = Math.sqrt(arrel);
			RPositiu = (-B+arrel)/ divisio;
			RNegatiu = (-B-arrel)/ divisio;
			System.out.println("El resultat positiu es: "+RPositiu+", i el resultat negatiu es: "+RNegatiu);
		}
		
		if ((arrel == 0) && (divisio == 0)){
			System.out.println("Error la Arrel o la divicio no poden donar 0");
		}
		lector.close();
		
		
	}
}
