package TP1;

import java.util.Scanner;

public class TP1_28 {
	
	static final Scanner input=new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Realizá un programa que a partir de un número entero cant ingresado por el
		 * usuario permita cargar por teclado cant números enteros. La computadora debe
		 * mostrar cuál fue el mayor número y en qué posición apareció.
		 */

		int cantidad=1;
		int num;
		int mayor=0;
		int posicionI=0;
		int i;
		
		System.out.println("Ingrese la cantidad de números que desea calcular");
		cantidad=Integer.parseInt(input.nextLine());
		
		
		for (i=1; i<= cantidad; i++) {
			System.out.println("Ingrese el número "+i);
			num=Integer.parseInt(input.nextLine());
			if (num>mayor) {
				mayor=num;
				posicionI=i;
			}
		}
		
		System.out.println("El mayor fue "+ mayor+ " y apareció en la posición "+posicionI);
		
		input.close();
	}

}
