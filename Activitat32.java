package Program2;

import java.util.Scanner;
public class Activitat32 {
	
	public static void main(String[] args) {
		
		double totalVenda = 0;
		double totalVendaMinimPerFerDescompte = 0;
		double descompteMaxim = 0;
		double descompteIntroduit = 0;
		double descompte = 0;
	
		
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("introdueix el total minim per fer descompte: ");
		totalVendaMinimPerFerDescompte = teclat.nextDouble();
		
		System.out.println("introdueix el descompte maxim a realitzar: ");
		descompteMaxim = teclat.nextDouble();
		
		System.out.println("introdueix el percentatge de descompte a fer: ");
		descompteIntroduit = teclat.nextDouble();
		
		System.out.println("introdueix el total de la venda: ");
		totalVenda = teclat.nextDouble();
		
		if (totalVenda < totalVendaMinimPerFerDescompte) {
			System.out.println("L'import a pagar és: " + totalVenda) ;
		}
		else {
			descompte = (totalVenda *( descompteIntroduit / 100));
			if (descompte > descompteMaxim) {
				descompte = descompteMaxim;
			}
			{
				
			}
			System.out.println("L'import a pagar és: " + (totalVenda - descompte));
			
		}
		teclat.close();
	}
}

