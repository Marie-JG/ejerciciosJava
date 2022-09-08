package TP1;

import java.util.Scanner;

public class TP1_30 {

	static final Scanner input = new Scanner(System.in);
	static final char SUMA = '+';
	static final char RESTA = '-';
	static final char MULTIPLICACION = '*';
	static final char DIVISION = '/';
	static final char FINALIZAR = 'F';

	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita realizar varias operaciones matemáticas
		 * ingresando un caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’,
		 * ‘/’, ‘F’) y dos números enteros en el caso que no haya elegido ‘F’. La
		 * computadora debe mostrar el resultado para la operación ingresada. Considerar
		 * que no se puede dividir por cero. Cuando la operación ingresada sea ‘F’ nos
		 * indicará que no se desean calcular más operaciones.
		 */

		int num1;
		int num2;
		char operacion;

		do {
			System.out.println(
					"Ingrese la operación. Suma(+), Resta(-), Multiplicación(*), Division(/), para finalizar (F)");
			operacion = input.nextLine().charAt(0);
		} while (operacion != FINALIZAR && operacion != SUMA && operacion != RESTA && operacion != MULTIPLICACION
				&& operacion != DIVISION);

		while (operacion != FINALIZAR) {

			System.out.println("Ingrese el primer número");
			num1 = Integer.parseInt(input.nextLine());

			System.out.println("Ingrese el segundo número");
			num2 = Integer.parseInt(input.nextLine());

			switch (operacion) {
			case SUMA:

				System.out.println(num1 + num2); 
				break;

			case RESTA:
				System.out.println(num1 - num2);

				break;
			case DIVISION:
				if (num2 != 0) {
					System.out.println(num1 / num2);
				} else {
					System.out.println("No es posible dividir por 0. ");
				}

				break;
			case MULTIPLICACION:
				System.out.println(num1 * num2);

				break;
			}
		}
	
			do {
				System.out.println(
						"Ingrese la operación. Suma(+), Resta(-), Multiplicación(*), Division(/), para finalizar (F)");
				operacion = input.nextLine().charAt(0);
			} while (operacion != FINALIZAR && operacion != SUMA && operacion != RESTA && operacion != MULTIPLICACION
					&& operacion != DIVISION);
		

		input.close();
	}

}
