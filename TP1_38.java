package TP1;

import java.util.Scanner;

public class TP1_38 {
	static final Scanner input = new Scanner(System.in);
	static final int TOPE=3;

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que permita controlar con validaci�n el ingreso a un
		 * sitio web. Teniendo ya precargados un nombre de usuario ("admin") y una
		 * contrase�a ("123456"), el programa debe permitir al usuario ingresar sus
		 * credenciales. Si las mismas son err�neas, se volver�n a pedir hasta un m�ximo
		 * de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
		 * siguientes mensajes seg�n sea el caso: "Acceso concedido" o "Se ha bloqueado
		 * la cuenta".
		 */

		
		String nombre="admin";
		String contrase�a="123456";
		String nom;
		String contr;
		int i=0;
		
		do {
			System.out.println("Ingrese el nombre de usuario");
			nom=input.nextLine();
			System.out.println("Ingrese el nombre. (* para finalizar)");
			contr=input.nextLine();
			i++;
		}while(nombre.equals(nom)&&contrase�a.equals(contr)|| i>TOPE);
		
		if (nombre.equals(nom)&&contrase�a.equals(contr)) {
			System.out.println("Acceso concedido");
		}else { 
			System.out.println("Se ha bloqueado la cuenta");
		}
		input.close();
	}

}
