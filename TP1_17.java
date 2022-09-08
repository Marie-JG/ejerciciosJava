package TP1;

import java.util.Scanner;


public class TP1_17 {
	
	/*
	 * 17. Realiz� un programa que permita ingresar una edad (entre 1 y 120 a�os) y
	 * un g�nero ('F' para mujeres,'M' para hombres). En caso de haber ingresado
	 * valores err�neos (edad fuera de rango o g�nero inv�lido), informar tal
	 * situaci�n. Si los datos est�n bien ingresados el programa debe indicar,
	 * sabiendo que las mujeres se jubilan con 60 a�os o m�s y los hombres con 65
	 * a�os o m�s, si la persona est� en edad de jubilarse
	 */
	
    static final Scanner input= new Scanner (System.in);
	
	static final int EDAD_MINIMA= 1;
	static final int EDAD_MAXIMA=120;
	static final int EDAD_F =60;
	static final int EDAD_M=65;
	static final char FEMENINO='F';
	static final char MASCULINO='M';
	
	

	public static void main(String[] args) {
		
		

		int edad;
		char genero;
		boolean puedeJubilarse=false;
		boolean datosValidos=false;
	
		
		System.out.println("Ingrese su edad (Entre "+ EDAD_MINIMA + "a�os y "+EDAD_MAXIMA+ "a�os.)");
		edad=Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su g�nero (Femenino: "+ FEMENINO +", Masculino: "+MASCULINO+")");
		genero=input.nextLine().charAt(0);
		
		datosValidos= (edad>=EDAD_MINIMA && edad<=EDAD_MAXIMA)&&(genero==MASCULINO || genero==FEMENINO);
		
	if (datosValidos) {
		puedeJubilarse = (genero==FEMENINO && edad>=EDAD_F)||(genero==MASCULINO && edad>=EDAD_M);
		if(puedeJubilarse) {
			System.out.println("Puede jubilarse");
		}else {
			System.out.println("A�n no est� en edad de jubilarse");
		}
	}else {
		System.out.println("Los datos ingresados son incorrectos");
	}
			
		
		input.close();
		
		

	}

}
