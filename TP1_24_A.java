package TP1;

import java.util.Scanner;

public class TP1_24_A {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que permita al usuario ingresar dos n�meros enteros num1
		 * y num2, donde el primero siempre deber� ser menor o igual al segundo. La
		 * computadora debe mostrar la secuencia de n�meros existentes entre ambos: a.
		 * Incluy�ndolos; b. Excluy�ndolos
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
