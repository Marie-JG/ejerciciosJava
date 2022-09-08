package TP1;

import java.util.Scanner;

public class TP1_37 {
	
	static final Scanner input = new Scanner(System.in);
	static final int TOPE= 12;
	
	public static void main(String[] args) {
		/*
		 * Realizá un programa que permita al usuario ingresar hasta 12 valores, de a
		 * uno por vez, que representan los sueldos mensuales que percibió un empleado
		 * durante un año calendario. Si durante la carga de los sueldos mensuales se
		 * detecta un valor negativo, esto indica que aún no se ha cobrado el mes en
		 * curso, y en ese caso se debe dejar de ingresar datos. Al finalizar mostrar el
		 * monto percibido por el empleado hasta ese momento (total o parcial).
		 */

		double num;
		double acum=0;
		int i=1;
		
		
		
			do {
			System.out.println("Ingrese el sueldo");
			num=Double.parseDouble(input.nextLine());
			acum+=num;
			i++;
			
			
		  }while(num>0&&i<=TOPE);
			System.out.println("Monto percibido hasta el momento $"+ acum+" Se han cargado "+i+" sueldos.");
			
			
			input.close();
			}

}
