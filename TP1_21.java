package TP1;

import java.util.Scanner;

public class TP1_21 {
	static final Scanner input = new Scanner(System.in);
	static final int MAXIMO= 7;
	static final int MINIMO=1;
	

	public static void main(String[] args) {
		
		/*
		 * 21. Realizá un programa que permita al usuario ingresar un número entero
		 * entre 1 y 7. Debe mostrarse por pantalla el nombre del día de la semana que
		 * representa tal número tomando como el primer día de la semana el Domingo. De
		 * ingresar un número fuera de rango debe mostrar error.
		 */

		
		int num;
		
		System.out.println("Ingresar un número entre el 1 y el 7");
		
		
		num = Integer.parseInt(input.nextLine());
		
		if (num<MINIMO || num>MAXIMO) {
			System.out.println("El número ingresado no es válido");
			System.out.println("Ingresar un número entre el 1 y el 7");
			num = Integer.parseInt(input.nextLine());
		}
			switch(num) {
			
			
			  case 1:
				  System.out.println("Hoy es Domingo");
				  break;
			  case 2:
				  System.out.println("Hoy es Lunes");
				  break;
			  case 3:
				  System.out.println("Hoy es Martes");
				  break;
			  case 4:
				  System.out.println("Hoy es Miércoles");
				  break;
			  case 5:
				  System.out.println("Hoy es Jueves");
				  break;
			  case 6:
				  System.out.println("Hoy es Viernes");
				  break;
			  case 7:
				  System.out.println("Hoy es Sábado");
				  break;
				  
				  
				  
		}
		
		

		
		
		
		input.close();
	}

}
