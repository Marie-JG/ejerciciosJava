package TP1;

import java.util.Scanner;

public class TP1_35 {

	static final Scanner input = new Scanner(System.in);
	static final String FINAL = "*";

	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita ingresar nombre y edad de un grupo de
		 * personas (para cada una, nombre y edad). La carga termina cuando en el nombre
		 * de la persona se ingresa un asterisco ('*'). Mostrar al final cómo se llama
		 * la persona más joven.
		 */

		String nombre;
		int edad=150;
		int joven=0;
		String masJoven="";
		
		

		do {
		System.out.println("Ingrese el nombre. (* para finalizar)");
		nombre=input.nextLine();
		
		System.out.println("Ingrese la edad");
		edad=Integer.parseInt(input.nextLine());
			if (edad<joven) {
				joven=edad;
				masJoven=nombre;}
			}while(!nombre.equals(FINAL));
		
		System.out.println("La persona más joven es "+masJoven+ " y tiene "+joven+" años.");
			
		
		
		
		input.close();	
		
	}

}
