package TP1;

import java.util.Scanner;

public class TP1_09 {
	static final Scanner input= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiz� un programa que permita ingresar dos n�meros que representan las medidas en
		//grados de dos �ngulos interiores de cierto tri�ngulo. A partir de los valores de estos dos
		//�ngulos el programa debe mostrar el valor en grados del �ngulo restante. Record� que la
		//suma de los �ngulos interiores de todo tri�ngulo es de 180�
		
		
		
	
		
		int angulo1;
		int angulo2;
		int angulo3;
		
		System.out.println("Ingrese la medida de un angulo del triangulo");
		angulo1= input.nextInt();
		System.out.println("Ingrese la medida del otro angulo del triangulo");
		angulo2= input.nextInt();
		
		angulo3= 180 - angulo1 -angulo2;
		
		System.out.println("El valor del angulo restante es de "+ angulo3 +"�");
		
		input.close();
		
		
		

	}

}
