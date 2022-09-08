package TP1;

import java.util.Scanner;

public class TP1_34 {
	static final Scanner input = new Scanner(System.in);
	static final int FINAL = 0;

	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita ingresar la estatura (en metros con
		 * decimales) de cada jugador de un equipo de baloncesto. La carga finalizará al
		 * ingresar cero. Calcular y mostrar la estatura promedio del equipo
		 */

		double estatura;
		double acum=0;
		double contador=0;
		double promedio;
		
		
		do {
			System.out.println("Ingrese la estatura");
			estatura= Double.parseDouble(input.nextLine());
			acum+=estatura;
			contador++;
			
		}while(estatura>0);
		
		promedio=acum/(contador-1);
		
		System.out.println( "El promedio de estatura de los jugadores es " +promedio);
	   input.close();
	}

}
