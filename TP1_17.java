package TP1;

import java.util.Scanner;


public class TP1_17 {
	
	/*
	 * 17. Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y
	 * un género ('F' para mujeres,'M' para hombres). En caso de haber ingresado
	 * valores erróneos (edad fuera de rango o género inválido), informar tal
	 * situación. Si los datos están bien ingresados el programa debe indicar,
	 * sabiendo que las mujeres se jubilan con 60 años o más y los hombres con 65
	 * años o más, si la persona está en edad de jubilarse
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
	
		
		System.out.println("Ingrese su edad (Entre "+ EDAD_MINIMA + "años y "+EDAD_MAXIMA+ "años.)");
		edad=Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su género (Femenino: "+ FEMENINO +", Masculino: "+MASCULINO+")");
		genero=input.nextLine().charAt(0);
		
		datosValidos= (edad>=EDAD_MINIMA && edad<=EDAD_MAXIMA)&&(genero==MASCULINO || genero==FEMENINO);
		
	if (datosValidos) {
		puedeJubilarse = (genero==FEMENINO && edad>=EDAD_F)||(genero==MASCULINO && edad>=EDAD_M);
		if(puedeJubilarse) {
			System.out.println("Puede jubilarse");
		}else {
			System.out.println("Aún no está en edad de jubilarse");
		}
	}else {
		System.out.println("Los datos ingresados son incorrectos");
	}
			
		
		input.close();
		
		

	}

}
