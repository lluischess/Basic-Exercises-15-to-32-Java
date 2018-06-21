package Program2;
import java.util.Scanner;
public class Activitat27 {
	public static void main (String[] args) {
		int numero;
		int numeroUsuari;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("L’ordinador pensa un número entre 1 i 10, l’usuari l’intenta encertar, si es així mostrar un missatge d’enhorabona en cas contrari indicar que ha fallat.");
		
		numero= (int) ((Math.random()*10)+1);
		
		System.out.print("Intentar endivinar el numero secret del 1 al 10 :");
		numeroUsuari = lector.nextInt();
		lector.nextLine();
		
		if (numeroUsuari==numero) {
			System.out.print("Enhorabona l'has clavat");
		}
		else if ((numeroUsuari>10) || (numeroUsuari<0) ) {
			System.out.println("Te que ser del 1 al 10");
		}
		else {
			System.out.print(" has fallat");
		}
		lector.close();
	}
}
