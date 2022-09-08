package TP1;

import java.util.Scanner;

public class TP1_25 {
	
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		/* Realizá un programa que permita ingresar dos números enteros que representen el ancho y el alto de una matriz de cruces. 
		 * El programa debe dibujar dicha matriz.
		 */

		
		int ancho;
		int alto;
		
		System.out.println("Ingrese el ancho");
		ancho=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el alto");
		alto=Integer.parseInt(input.nextLine());
		
		for(int i = 1 ; i <= alto ; i++) {
			
			for(int j = 1; j <= ancho ; j++) {
				System.out.print("X");
			}
			
			System.out.println();
		}
		
	
		input.close();
	}

}
