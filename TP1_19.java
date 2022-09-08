package TP1;

import java.util.Scanner;

public class TP1_19 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 19. Existen dos reglas que identifican dos conjuntos de valores: a. El número
		 * es de un solo dígito. b. El número es impar. A partir de estas reglas,
		 * realizá un programa que permita ingresar un número entero. Debe asignar el
		 * valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
		 * estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, según corresponda,
		 * para indicar si el valor número ingresado pertenece o no a cada conjunto.
		 * Definí un lote de prueba de varios números y probá el algoritmo, escribiendo
		 * los resultados tal como se hizo en los ejercicios anteriores.
		 */

		int num;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;

		System.out.println("Ingresar un número");
		num = Integer.parseInt(input.nextLine());

		if (num <= 9 && num >= -9) {
			esDeUnSoloDigito = true;
		}
			if (!(num % 2 == 0)) {
				esImpar = true;
			}
		if (esDeUnSoloDigito == true && esImpar == true) {
			estaEnAmbos = true;
		}
		if (!esDeUnSoloDigito == true && !esImpar == true) {
			noEstaEnNinguno = true;
		}

		System.out.println("Es de un solo digito?: " + esDeUnSoloDigito);
		System.out.println("Es impar?: " + esImpar);
		System.out.println("Está en ambos grupos?: " + estaEnAmbos);
		System.out.println("No está en ningun grupo?: " + noEstaEnNinguno);

		
		input.close();
	}
}