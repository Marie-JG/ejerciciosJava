package TP1;

import java.util.Scanner;

public class TP1_29 {

	static final Scanner input = new Scanner(System.in);
	static final int MINIMO = 0;
	static final int MAXIMO = 10;

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que permita validar la nota de un examen. Se espera que
		 * la nota que el usuario ingrese sea un n�mero comprendido entre 0 y 10. La
		 * misma debe ser ingresada tantas veces como sea necesario hasta que quede
		 * comprendida dentro del rango indicado.
		 */

		int nota;
		
		do {
		System.out.println("Ingrese la nota");
		nota=Integer.parseInt(input.nextLine());
	
	
		
		}while(!(nota>=MINIMO && nota<=MAXIMO));
			
		
			System.out.println("Nota v�lida");
	
		

		input.close();
	}

}
