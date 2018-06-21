package Program2;

/*31.Fer el jocs del pedra, paper i estisora. Demanar a un primer jugador que
vol estriar la seva figura, demanar al un segon jugador la seva figura i
finalment indicar quin dels dos jugadors a guanyat o si han empatat.*/


import java.util.Scanner;
public class Activitat31 {

	public static void main (String[] args) {
	//declaracio variables
	int jugador1;
	int jugador2;
	boolean resultat1;
	boolean resultat2;
	
		Scanner lector = new Scanner(System.in);
		//menu text
		System.out.println("Benvingut al joc de pedra, paper i estisora. Tria l'estri que vulguis per comen�ar:");
		System.out.println("1.Pedra");
		System.out.println("2.Paper");
		System.out.println("3.Estisora");
		
		//tria opcio i validacio
		System.out.println("Tria el numero de l'opci� jugador 1");
		resultat1 = lector.hasNextInt();
		if(resultat1==false){
			System.out.println("Valor incorrect");}
		else{
			jugador1 = lector.nextInt();
			System.out.println("Tria el numero de l'opci� jugador 2");
			resultat2 = lector.hasNextInt();
			if(resultat2==false){
				System.out.println("Valor incorrect");}
			else{
				jugador2 = lector.nextInt();
				
				//comen�a el joc
				if(jugador1 == jugador2){
					System.out.println("Empat");
				}
				else{
					if(jugador1 == 1 && jugador2 == 3){
						System.out.println("Jugador1 Guanya");
					}else{
						if( jugador1==1 && jugador2==2){
							System.out.println("Jugador2 Guanya");
						}else{
							if(jugador1 ==2 && jugador2 ==1){
								System.out.println("Jugador 1 Guanya");
							}else{
								if(jugador1==2 && jugador2==3){
									System.out.println("Jugador2 Guanya");
								}else{
									if(jugador1 == 3 && jugador2 == 1){
										System.out.println("Jugador2 Guanya");
									}else{
										if(jugador1 == 3 && jugador2 == 2){
											System.out.println("Jugador1 Guanya");
										}
										else {
											System.out.println("Alguna de les opcions no es correcte");
										}
									}
								}
							}
						} 
					}
				}
			}
		}
		lector.close();
		}
	}
