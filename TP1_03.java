package TP1;

import java.util.Scanner;

public class TP1_03 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiz� un programa que permita ingresar un n�mero entero. Debe mostrarse el n�mero
		//ingresado:
		//a. Multiplicado por 5.
		//b. Dividido por 2.
		
		
		
		int numero;
		int multiplicacion;
		double division;
		System.out.println("Ingrese un n�mero entero");
	
		numero=Integer.parseInt(input.nextLine());
		multiplicacion= numero*5;
		division= numero/2;
		System.out.println(numero+"*5= " +multiplicacion);
		System.out.println(numero+"/2= "+division);
		
		input.close();
	}

}
