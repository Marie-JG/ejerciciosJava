package TP1;

import java.util.Scanner;

public class TP1_32 {
	static final Scanner input=new Scanner (System.in);
static final int NOTA_MINIMA=2;
static final int NOTA_MAXIMA= 10;
	public static void main(String[] args) {
		/*
		 * .Realizá un programa que permita validar la nota de un examen de la misma
		 * manera que el ejercicio 29 pero con las siguientes nuevas directivas: Las
		 * notas 1 y 3 no usan nunca. La nota 0 se reserva para los ausentes En
		 * resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10. 
		 */

		int nota;
		
		do {
			System.out.println("Ingrese la nota");
			nota=Integer.parseInt(input.nextLine());
		}while (nota<NOTA_MINIMA || nota>NOTA_MAXIMA || nota==1||nota==3|| nota==0);
		
		System.out.println("Nota Válida");
		
		
		input.close();
	}

}
