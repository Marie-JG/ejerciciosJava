package TP1;

import java.util.Scanner;

public class TP1_05 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
		//num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
		//		lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas. [EC]

		
		int num1;
		int num2;
		int numAux;
		System.out.println("Ingrese el num1");
		num1=input.nextInt();
		System.out.println("Ingrese el num2");
		num2=input.nextInt();
		
		System.out.println("Los números que ingresaste son: ");
		System.out.println(num1);
		System.out.println(num2);
		
		numAux=num1;
		num1=num2;
		num2=numAux;
		System.out.println("Los números invertidos");
		System.out.println(num1);
		System.out.println(num2);
		
		input.close();
		
		
		
	
		
	
		
	}

}
