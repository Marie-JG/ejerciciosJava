package TP1;

import java.util.Scanner;

public class TP1_13 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 13. Realiz� un programa para ingresar tres n�meros enteros e indique cu�l de
		 * ellos es el mayor y su valor.
		 */

		int num1, num2,num3;

		System.out.println("Ingrese el primer n�mero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo n�mero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercer n�mero");
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
