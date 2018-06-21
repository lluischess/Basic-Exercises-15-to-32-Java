package Program2;
import java.util.Scanner;
public class Activitat21 {
	public static void main (String[] args) {
		int numero1;
		int numero2;
		int numero3;
		
		Scanner lector = new Scanner(System.in);
		System.out.println(".Introduir 3 números i a continuació que els escrigui ordenats de major a menor.");
		System.out.print("Introduir 3 numeros:");
		
		numero1 = lector.nextInt();
		lector.nextLine();
		numero2 = lector.nextInt();
		lector.nextLine();
		numero3 = lector.nextInt();
		lector.nextLine();
		
		if  (numero1<numero2 && numero1<numero3)  {
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero3+" Segon: "+numero2+" Tercer: "+numero1+"");
		}else if (numero1>numero2 && numero1>numero3) {
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero1+" Segon: "+numero2+" Tercer: "+numero3+"");
		}
		else if (numero1<numero2 && numero1>numero3){
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero2+" Segon: "+numero1+" Tercer: "+numero3+"");
		}
		else if (numero1>numero2 && numero1<numero3){
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero3+" Segon: "+numero1+" Tercer: "+numero2+"");
		}
		else if (numero2<numero1 && numero2<numero3){
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero1+" Segon: "+numero3+" Tercer: "+numero2+"");
		}
		else if (numero2>numero1 && numero2>numero3){
			System.out.println(":Estan del mes gran al mes petit: Primer: "+numero2+" Segon: "+numero3+" Tercer: "+numero1+"");
		}
		else{
			System.out.println(":Son iguals o hi han dos iguals!");
		}
		lector.close();
	}
}
