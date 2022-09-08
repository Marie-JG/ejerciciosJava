package TP1;

import java.util.Scanner;

public class TP1_33 {
	
	static final Scanner input = new Scanner(System.in);
	static final int FINAL=0;

	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita al usuario ingresar números hasta que se
		 * introduzca un 0. La computadora debe mostrar el número máximo y el número
		 * mínimo. 
		 */
		
		int num;
		int max=0;
		int min=10000;
		
		
		do{
			System.out.println("Ingrese un numero");
			num=Integer.parseInt(input.nextLine());
			if (num>max) 
				max=num;
			if(num!=0&&num<min)
				min=num;
			
		}while(num!=0);
			
		System.out.println("El número máximo es "+max+ " y el mínimo es "+min);
			
		
		

		
		input.close();
	}

}
