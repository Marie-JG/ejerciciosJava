package TP1;

import java.util.Scanner;

public class TP1_23 {
	
	static final Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
  // Realiz� un programa que permita ingresar un n�mero entero n. Debe mostrar los primeros	10 m�ltiplos de n (desde 1 x n).


		int entero;
		int multiplo=1;
		
		System.out.println("Ingrese un numero entero");
		entero=Integer.parseInt(input.nextLine());
		
		while (multiplo<=10) {
			int resultado;
			System.out.println("* "+multiplo);
			resultado= entero*multiplo;
			System.out.println("="+resultado);
			multiplo++;
		}
		input.close();
		
	}

}
