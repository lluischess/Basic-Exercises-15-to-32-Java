package Program2;

//crearem un converto de Euros de diferentes divises en el seu preu actual en el mercat.  DOLARS, YENS , PESOS.

import java.util.Scanner;

public class Exr_condi_clase {

	public static final double dolars = 1.10;
	public static final double yens = 115;
	public static final double pesos = 16.64;
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		double moneda;
		double quants;
		double resultat;
		
		
		
		System.out.println("Escriu quina cantitat vols canviar de Euros a la moneda seleccionada:");
		quants = lector.nextDouble();
		lector.nextLine();
		System.out.println("Escriu quina moneda vols de les 3 posibles introduint el seu numero corresponent: dolars= 1 , yens= 2 , pesos= 3 ");
		moneda = lector.nextDouble();
		lector.nextLine();
		
		
			
				
			if (moneda == 1){	
			resultat= quants*dolars	;
		     System.out.println("Tents :"+resultat+" dolars." ) ;
		     		 	    
	           }else {if (moneda == 2){
	        	   resultat = quants*yens ;
		           System.out.println("Tents :"+ resultat + " yens." ) ; 
		           
	            }else {if (moneda == 3){
		        	 resultat = quants * pesos ;
			           System.out.println("Tents : "+ resultat + " pesos." ) ;  
	            } else {  
	        	
	        	   System.out.println("No existeis el que has escrit." ) ; 
	            }
	             
		lector.close();
	}
      
}
}
}