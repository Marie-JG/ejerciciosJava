package TP1;

import java.util.Scanner;

public class TP1_04 {
	static final Scanner input= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//Realiz� un programa que permita ingresar el valor monetario de una hora de trabajo y la
		//cantidad de horas trabajadas por d�a por un trabajador. Debes mostrar el valor del salario
		//semanal, sabiendo que trabaja todos los d�as h�biles y la mitad de las horas del d�a h�bil los
		//s�bados. (Todas las horas valen lo mismo.)
		

		
		double horaTrabajo;
		double cantHoras;
		String nombre;
		double semanal;
		
		System.out.println("Escriba su nombre");
		nombre=input.nextLine();
		
		System.out.println("Escriba el valor de la hora de trabajo");
		horaTrabajo=input.nextDouble();
		
		System.out.println("Escriba la cantidad de horas trabajadas");
		cantHoras=input.nextDouble();
		
		semanal=cantHoras*horaTrabajo;
		System.out.println("Hola " +nombre+" . Usted trabajo: "+cantHoras+" horas. Su sueldo semanal es de $"+semanal);
		
		input.close();
		
	}

}
