package TP1;

import java.util.Scanner;

public class TP1_26 {
	
	static final Scanner input=new Scanner (System.in);

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que permita al usuario ingresar un n�mero natural n. La
		 * computadora debe mostrar los primeros n m�ltiplos de 3 excepto aquellos que
		 * sean a la vez m�ltiplos de 5.
		 */
		int num;
		boolean esMultiplo;
		
		
		
		System.out.println("Ingrese un n�mero natural");
		num = Integer.parseInt(input.nextLine());
		
		for( int i=1; i<num;i++) {
			esMultiplo=i%5!=0;
			if(esMultiplo) {
				System.out.println(i*3);
			}
		}
		
		input.close();
		

	}

}
