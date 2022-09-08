package TP1;

import java.util.Scanner;

public class TP1_12 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 12. Realizá un programa que permita ingresar dos números enteros e indique
		 * cuál de ellos es el mayor.
		 */

		int num1, num2;
		
		System.out.println("Ingrese el primer número");
		num1=Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número");
		num2=Integer.parseInt(input.nextLine());
		
		if(num1>num2)
			System.out.println("El mayor es: "+num1);
		else
			System.out.println("El mayor es: "+num2);
		
		input.close();
	}

}
