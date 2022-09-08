package TP1;

import java.util.Scanner;

public class TP1_31_A {
	
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 *  Realiz� un programa que permita validar una opci�n ingresada. Se le
		 * preguntar� al usuario si desea continuar con alguna operaci�n de la forma
		 * "�Dese�s continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una
		 * 'N' (incluir las min�sculas). La opci�n debe ser ingresada tanto como sea
		 * necesario hasta que quede comprendida dentro de las posibilidades esperadas.
		 * Realiz� este ejercicio en dos versiones (A y B): con ciclo while y con ciclo
		 * do-while.
		 */
		
		char opcion;
		 
		System.out.println("Deseas continuar? (S/N)");
		opcion=input.nextLine().toUpperCase().charAt(0);
		
		while(opcion!='S'&& opcion!='N') {
			System.out.println("Deseas continuar? (S/N)");
			opcion=input.nextLine().toUpperCase().charAt(0);
			
		}
		System.out.println("Opci�n v�lida");

		input.close();
		
	}

}
