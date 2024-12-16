package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una cadena al usuario y una función se encarga de
 * devolver esa cadena en nomenclatura Camel.
 */
public class Ejercicio19 {

	public static void main(String[] args) {

		// Creamos la variable cadena como String para almacenar la frase introducida
		// por el usuario.
		String cadena = "";

		// Creamos el Scanner para leer la frase del del usuario por teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la cadena y la leemos
		System.out.println("Introduce una cadena --> ");
		cadena = sc.nextLine();

		// Todas las letras las ponemos a minusculas con el metodo toLowerCase.
		cadena.toLowerCase();

		System.out.println(nomenclaturaCamel(cadena));
		
		// Cierre de Scanner
		sc.close();

	}

	public static String nomenclaturaCamel(String frase) {

		// Declaramos el array tablaFrase como String para almacenar en cada posición
		// una palabra, usando el metodo split.
		String[] tablaFrase = frase.split(" ");

		for (int i = 0; i < tablaFrase.length; i++) {
			for (int j = 0; j < tablaFrase[i].length(); j++) {
				if (i != 0 && j == 0) {
					Character.toUpperCase(tablaFrase[i].charAt(j));
				}
			}
		}
		
		return frase;
	}

}
