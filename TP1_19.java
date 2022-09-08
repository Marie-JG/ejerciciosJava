package TP1;

import java.util.Scanner;

public class TP1_19 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 19. Existen dos reglas que identifican dos conjuntos de valores: a. El n�mero
		 * es de un solo d�gito. b. El n�mero es impar. A partir de estas reglas,
		 * realiz� un programa que permita ingresar un n�mero entero. Debe asignar el
		 * valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
		 * estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, seg�n corresponda,
		 * para indicar si el valor n�mero ingresado pertenece o no a cada conjunto.
		 * Defin� un lote de prueba de varios n�meros y prob� el algoritmo, escribiendo
		 * los resultados tal como se hizo en los ejercicios anteriores.
		 */

		int num;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;

		System.out.println("Ingresar un n�mero");
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
		System.out.println("Est� en ambos grupos?: " + estaEnAmbos);
		System.out.println("No est� en ningun grupo?: " + noEstaEnNinguno);

		
		input.close();
	}
}