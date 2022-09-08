package TP1;

import java.util.Scanner;

public class TP1_13 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 13. Realizá un programa para ingresar tres números enteros e indique cuál de
		 * ellos es el mayor y su valor.
		 */

		int num1, num2,num3;

		System.out.println("Ingrese el primer número");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercer número");
		num3 = Integer.parseInt(input.nextLine());
		
		if (num1>num2&&num1>num3)
			System.out.println("El mayor es: "+num1);
		else {
			if (num2>num1&&num2>num3)
				System.out.println("El mayor es: "+num2);
			else 
				System.out.println("El mayor es: "+num3);
		}
		input.close();

	}

}
