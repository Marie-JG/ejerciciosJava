package TP1;

import java.util.Scanner;

public class TP1_14 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14. Para entrar a la monta�a rusa Infierno en las alturas se requiere tener
		 * al menos 7 a�os y medir m�s de 1,50 metros. Complet� el siguiente cuadro a
		 * mano seg�n los requisitos y luego haz el programa que permita, seg�n las
		 * edades y estaturas ingresadas por el usuario, obtener los mismos resultados
		 * seg�n los siguientes datos
		 */
		
		int edad;
		double estatura;
		
		System.out.println("Ingrese su edad");
		edad=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su estatura en cms");
		estatura=Integer.parseInt(input.nextLine());
		
		if (edad>=7 && estatura>150)
			System.out.println("Puede subir!!!");
		else
			System.out.println("Lo siento, no puede subir");
		

	input.close();	
		
	}

}
