package TP1;

import java.util.Scanner;

public class TP1_11 {
	static final Scanner input= new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 11. Realizá un programa que permita ingresar un número entero e indique si se
		 * trata de un número par o impar.
		 */

		int num;
		
		System.out.println("Ingrese un número entero");
		num=Integer.parseInt(input.nextLine());
		
		if (num%2==0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
		
		
		
		
		input.close();
	}

}
