package TP1;

import java.util.Scanner;

public class TP1_16 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 16. Realizá un programa que permita ingresar la cantidad de inscriptos a una
		 * conferencia y la cantidad de asientos disponibles en el auditorio. Debes
		 * indicar si alcanzan los asientos, Si los asientos no alcanzaran indicar
		 * cuántos faltan para que todos los inscriptos puedan sentarse.
		 */
		
		int inscriptos, disponibles,faltantes;
		
		
		System.out.println("Ingrese la cantidad de inscriptos a la conferencia");
		inscriptos=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de asientos disponibles en el auditorio");
		disponibles=Integer.parseInt(input.nextLine());
		
		if (disponibles>=inscriptos) {
			System.out.println("Los asientos son suficientes");}
		else {
			
		faltantes=inscriptos-disponibles;
		System.out.println("Los asientos no son suficientes. Faltarian "+ faltantes+ " asientos");
		}
		
		input.close();

		
		

	}

}
