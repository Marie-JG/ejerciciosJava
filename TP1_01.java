package TP1;

import java.util.Scanner;


public class TP1_01 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
		//una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]

		
		String nombre;
		
		System.out.println("Por favor escriba su nombre");
		
		nombre= input.nextLine();
		
		System.out.println("Su nombre es "+ nombre);
		
		input.close();

	}

}
