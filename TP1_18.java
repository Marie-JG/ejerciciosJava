package TP1;

import java.util.Scanner;

public class TP1_18 {
	static final Scanner input= new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 18. Realizá un programa que permita al usuario ingresar dos números enteros.
		 * La computadora debe indicar si el mayor es divisible por el menor. (Un número
		 * entero a es divisible por un número entero b cuando el resto de la división
		 * entre a y b es 0.
		 */
		
		int num1;
		int num2;
		int mayor;
		int divisor;
	
		
		System.out.println("Ingrese un numero entero");
		num1=Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero entero");
		num2=Integer.parseInt(input.nextLine());
		
		if (num1>num2) {
			mayor=num1;
			divisor=num2;}
			else {
				mayor=num2;
				divisor=num1;
			}
					
		if (mayor%divisor== 0)	{
			System.out.println("Es divisible");
			}
		else {
			System.out.println("No es divisible");
		}


		input.close();
	}

}
