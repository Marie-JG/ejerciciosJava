package TP1;

import java.util.Scanner;

public class TP1_36 {
	
	static final Scanner input = new Scanner(System.in);
	static final int TOPE= 20;


	
	
	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita ingresar números mientras el promedio entre
		 * todos los ingresados sea menor a 20. Al terminar el ingreso indicar la
		 * cantidad de valores leídos
		 */
		
		
		int num;
		double promedio;
		int contador=0;
		int acumulador=0;
		
		do {
			System.out.println("Ingrese un numero");
			num=Integer.parseInt(input.nextLine());
			acumulador+=num;
			contador++;
			promedio=acumulador/contador;
			
		}
		
		while (promedio<TOPE);
		
		System.out.println("Se ingresaron "+ contador+ " valores. El promedio es "+promedio);

	}

}
