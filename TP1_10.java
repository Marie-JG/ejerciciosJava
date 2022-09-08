package TP1;

import java.util.Scanner;


public class TP1_10 {
	static final Scanner input= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*.Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
		diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
		aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
		de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
		previamente.
*/
	
		String nom1, nom2, nom3;
		double monto1, monto2,monto3;
		double total;
		double porc1;
		double porc2;
		double porc3;
		
		System.out.println("Ingrese el nombre del primer socio");
		nom1= input.nextLine();
		System.out.println("Ingrese el monto del primer socio");
		monto1=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el nombre del segundo socio");
		nom2=input.nextLine();
		System.out.println("Ingrese el monto del segundo socio");
		monto2=Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el nombre del tercer socio");
		nom3=input.nextLine();
		System.out.println("Ingrese el monto del tercer socio");
		monto3=Integer.parseInt(input.nextLine());
		
		total=monto1+monto2+monto3;
		
		porc1=monto1*total/100;
		porc2=monto2*total/100;
		porc3=monto3*total/100;
		
		System.out.println("Total recaudado: $"+total);
		System.out.println(nom1 +": $"+ monto1 + "/ "+ porc1 +"%");
		System.out.println(nom2 +": $"+ monto2 + "/ "+ porc2 +"%");
		System.out.println(nom3 +": $"+ monto3 + "/ "+ porc3 +"%"); 
		
		input.close();
	}

}
