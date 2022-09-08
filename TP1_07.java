package TP1;

import java.util.Scanner;

public class TP1_07 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
		//valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
		//metros de alambre para cercarlo completamente a tres alturas distintas


		
		double largo;
		double ancho;
		double metrosCuadrados;
		double perimetro;
		double valorM;
		double valorTotal;
		double cantAlambre;
		
		System.out.println("Ingresar el largo en metros");
		largo= input.nextDouble();
		
		System.out.println("Ingrese el ancho en metros");
		ancho= input.nextDouble();
		
		System.out.println("Ingrese el valor del metro cuadrado");
		valorM= input.nextDouble();
		
		metrosCuadrados= largo * ancho;
		perimetro= largo*2 + ancho*2;
		
		valorTotal= valorM*metrosCuadrados;
		
		cantAlambre= perimetro *3;
		
		System.out.println("El valor total del terreno es: $"+valorTotal+" ,y se necesitan "+ cantAlambre + " metros de alambre para cercarlo");
		
		
		input.close();
		
		
	}

}
