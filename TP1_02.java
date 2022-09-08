package TP1;

import java.util.Scanner;

public class TP1_02 {
	
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
		//para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
		
		
		
		
		double num1;
		double num2;
		double num3;
		double resultado;
		
		System.out.println("Escriba la primer nota");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Escriba la segunda nota");
		num2=Integer.parseInt(input.nextLine());
		System.out.println("Escriba la tercer nota");
		num3= Integer.parseInt(input.nextLine());
		resultado= (num1+num2+num3)/3;
		System.out.println("Su promedio es "+resultado);
		
		input.close();
		
		

		
	}

}
