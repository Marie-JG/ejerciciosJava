package TP1;

import java.util.Scanner;

public class TP1_08 {

	static final Scanner input=new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiz� un programa que permita ingresar dos n�meros naturales. Debes mostrar los
		//resultados para las 4 operaciones matem�ticas b�sicas con los n�meros ingresados. [EC]
		
		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		double division = 0;
		
		
		System.out.println("Ingrese un n�mero del 0 al 9");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un n�mero del 0 al 9");
		num2= Integer.parseInt(input.nextLine());
		
		suma= num1+num2;
		resta= num1-num2;
		multiplicacion=num1*num2;
		
		if(num2!=0) 
		 division= (double) num1/num2;
	
		else {System.out.println("No fue posible realizar la division");
	
	
		}
		System.out.println("Resultado de las operaciones con los n�meros ingresados: -Suma= "+suma+"   -Resta= "+resta+
				"   -Multiplicacion="+multiplicacion+"   -Division=" +division);
		
		input.close();
	}
}
