package TP1;

import java.util.Scanner;

public class TP1_27 {

	
	static final Scanner input=new Scanner (System.in);
	
	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el
		 * promedio de todas las edades ingresadas y cuántas edades fueron valores
		 * impares mayores que 18.
		 */
		
		int edad;
		double promedio;
		int acum=0;
		int acumEspecial=0;
		int i;
		
		for(i=1; i<=5; i++) {
		System.out.println("Ingrese la edad");
		edad=Integer.parseInt(input.nextLine());
		acum+=edad;
		if (!(edad/2==0 && edad<18)) {
			acumEspecial++;
		}
		}
		
		promedio= acum/5;
		System.out.println(" Fueron "+ acumEspecial+ " las edades cuyos valores son impares y mayores de 18");
		System.out.println("El promedio de edades es "+promedio);
		
		
		
		

		
		input.close();
	}

}
