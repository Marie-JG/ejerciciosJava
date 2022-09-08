package TP1;

import java.util.Scanner;

public class TP1_20 {
	final static Scanner input = new Scanner(System.in);

	final static char SUMA = '+';
	final static char RESTA = '-';
	final static char MULTIPLICACION = '*';
	final static char DIVISION = '/';

	public static void main(String[] args) {

		/*
		 * 20. Realizá un programa que permita ingresar dos números enteros y la
		 * operación a realizar ('+', '-', '*', '/'). Debe mostrarse el resultado para
		 * la operación ingresada. Considerar que no se puede dividir por cero (en ese
		 * caso mostrar el texto 'ERROR').
		 */

		int num1;
		int num2;
		char operacion;
		double resultado = 0;

		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la operación. Suma(+), Resta(-), Multiplicación(*), Division(/)");
		operacion = input.nextLine().charAt(0);

		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());

		switch (operacion) {
		case SUMA:

			resultado = num1 + num2;
			break;

		case RESTA:
			resultado = num1 - num2;
			break;
		case DIVISION:
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("No es posible dividir por 0. ");
			}
			break;

		case MULTIPLICACION:
			resultado = num1 * num2;
			break;
		}

		System.out.println(resultado);
		
		input.close();
	}

	
	   
}



