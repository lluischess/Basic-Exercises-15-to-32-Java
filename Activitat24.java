package Program2;

import java.util.Scanner;

public class Activitat24 {
	public static void main (String [] args){
		double Base;
		double Altura;
		double Operacio;
		double ResultatArea,Resultatperimetre;
		
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Fer un algorisme que serveixi tant per calcular l’àrea d’un rectangle com el perímetre d’un rectangle. Se li demanarà a l’usuari"
				+ " el valor dels dos costats  i  quina  operació  vol  realitzar(A-àrea  i  P-perímetre)mostrant  el resultat segons l’opció indicada per l’usuari.");
		
		System.out.println("Introdueix la base");
		Base = lector.nextDouble();
		System.out.println("Introdueix la altura");
		Altura = lector.nextDouble();
		
		System.out.println("Ara introdueix la operacio: ");
		System.out.println("Si vols calcular el area introdueix un 1");
		System.out.println("Si vols calcular el perimetre introdueix un 2");
		lector.nextLine();
		Operacio = lector.nextDouble();
		if ((Operacio != 1) || (Operacio !=2)){
			System.out.println("Error");
			lector.nextLine();
		}
		if (Operacio == 1){
			ResultatArea= Base*Altura;
			System.out.println("La area es: "+ResultatArea);
			lector.nextLine();
		}
		if (Operacio == 2){
			Resultatperimetre= 2*(Base+Altura);
			System.out.println("El perimetra es: "+Resultatperimetre);
			lector.nextLine();
		}
		lector.close();
	}
}
