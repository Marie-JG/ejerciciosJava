package TP1;

import java.util.Scanner;

public class TP1_24_B {
	
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		
		/*
		 * Realizá un programa que permita al usuario ingresar dos números enteros num1
		 * y num2, donde el primero siempre deberá ser menor o igual al segundo. La
		 * computadora debe mostrar la secuencia de números existentes entre ambos: a.
		 * Incluyéndolos; b. Excluyéndolos
		 */

		int num1;
		int num2;
		
		
		System.out.println("Ingrese un numero entero");
		num1=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un numero entero");
		num2=Integer.parseInt(input.nextLine());
		
		
		
			do {
				num2--;
				System.out.println(num2);
			}while (num2>=num1) ;
				
			
		
		
		input.close();
		
	}

}
