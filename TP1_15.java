package TP1;

import java.util.Scanner;

public class TP1_15 {
	static final Scanner input= new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 15. Para entrar a la montaña rusa Miedo a las alturas , algo más chica y
		 * tranquila que la anterior, alcanza con que se cumpla solamente una de las
		 * siguientes condiciones: ser mayor de 6 años o medir más de 1,50 metros.
		 * Realizá el mismo procedimiento que con el ejercicio anterior pero con los
		 * nuevos requisitos.
		 */
		int edad;
		double estatura;
		
		System.out.println("Ingrese su edad");
		edad=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su estatura en cms");
		estatura=Integer.parseInt(input.nextLine());
		
		if (edad>=6 || estatura>150)
			System.out.println("Puede subir!!!");
		else
			System.out.println("Lo siento, no puede subir");
		
		input.close();
		
	}

	
	
	
}
