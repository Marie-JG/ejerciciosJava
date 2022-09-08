package TP1;

import java.util.Scanner;

public class TP1_31_A {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 *  Realizá un programa que permita validar una opción ingresada. Se le
		 * preguntará al usuario si desea continuar con alguna operación de la forma
		 * "¿Deseás continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una
		 * 'N' (incluir las minúsculas). La opción debe ser ingresada tanto como sea
		 * necesario hasta que quede comprendida dentro de las posibilidades esperadas.
		 * Realizá este ejercicio en dos versiones (A y B): con ciclo while y con ciclo
		 * do-while.
		 */
		
		char opcion;
		 
		System.out.println("Deseas continuar? (S/N)");
		opcion=input.nextLine().toUpperCase().charAt(0);
		
		while(opcion!='S'&& opcion!='N') {
			System.out.println("Deseas continuar? (S/N)");
			opcion=input.nextLine().toUpperCase().charAt(0);
			
		}
		System.out.println("Opción válida");

		input.close();
		
	}

}
