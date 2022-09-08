package TP1;

import java.util.Scanner;

public class TP1_24_A {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita al usuario ingresar dos números enteros num1
		 * y num2, donde el primero siempre deberá ser menor o igual al segundo. La
		 * computadora debe mostrar la secuencia de números existentes entre ambos: a.
		 * Incluyéndolos; b. Excluyéndolos
		 */

		int num1;
		int num2;
		int numAux;
		
		System.out.println("Ingrese un numero entero");
		num1=Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero");
		num2=Integer.parseInt(input.nextLine());
		
		
		while (num1<=num2) {
			numAux=num2--;
			System.out.println(numAux);
			
		}
		
		input.close();
	}

}
