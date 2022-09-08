package TP1;

import java.util.Scanner;

public class TP1_06 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
		//vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
		//por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
		//cobrar por el vendedor.

		double total;
		double porcentaje;
		double sueldo=44000;
		double cobro;
		System.out.println("Ingrese el total de las ventas realizadas este mes");
		total= input.nextDouble();
		
		porcentaje= total * 16 /100;
		cobro= porcentaje+sueldo;
		System.out.println("Este mes su sueldo es de: $ " +cobro);	
		
		input.close();
		
		
		
		
		
	}

}
