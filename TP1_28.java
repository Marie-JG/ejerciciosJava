package TP1;

import java.util.Scanner;

public class TP1_28 {
	
	static final Scanner input=new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que a partir de un n�mero entero cant ingresado por el
		 * usuario permita cargar por teclado cant n�meros enteros. La computadora debe
		 * mostrar cu�l fue el mayor n�mero y en qu� posici�n apareci�.
		 */

		int cantidad=1;
		int num;
		int mayor=0;
		int posicionI=0;
		int i;
		
		System.out.println("Ingrese la cantidad de n�meros que desea calcular");
		cantidad=Integer.parseInt(input.nextLine());
		
		
		for (i=1; i<= cantidad; i++) {
			System.out.println("Ingrese el n�mero "+i);
			num=Integer.parseInt(input.nextLine());
			if (num>mayor) {
				mayor=num;
				posicionI=i;
			}
		}
		
		System.out.println("El mayor fue "+ mayor+ " y apareci� en la posici�n "+posicionI);
		
		input.close();
	}

}
