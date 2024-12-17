package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una cadena al usuario y una función se encarga de
 * devolver esa cadena en nomenclatura Camel.
 */
public class EjercicioA19 {

	public static void main(String[] args) {

		// Creamos la variable cadena como String para almacenar la frase introducida
		// por el usuario.
		String cadena = "";

		// Creamos el Scanner para leer la frase del del usuario por teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la cadena y la leemos usamos el método
		// toLowerCase para pasar la frase a minuscula.
		System.out.println("Introduce una cadena --> ");
		cadena = sc.nextLine().toLowerCase();

		System.out.println(nomenclaturaCamel(cadena));

		// Cierre de Scanner
		sc.close();

	}

	public static String nomenclaturaCamel(String frase) {

		// Declaramos el array tablaFrase como String para almacenar en cada posición
		// una palabra, usando el metodo split.
		String[] tablaFrase = frase.split(" ");

		// Declaramos la variable fraseEnCamel como String para almacenar la cadena ya
		// transformada en nomenclatura camel.
		String fraseEnCamel = "";

		// Declaramos la variable primerCaracter como char para almacenar ese primer
		// caracter de las palabras que no sea la primera.
		char primerCaracter = 0;

		// Recorremos el array tablaFrase donde en cada posición se encuentra cada
		// palabra.
		for (int i = 0; i < tablaFrase.length; i++) {
			// Con este for recorremos cada palabra que se encuentra en cada posición.
			for (int j = 0; j < tablaFrase[i].length(); j++) {
				// Si la i es dintinto de 0 para que no sea la primera palabra, y la j es igual
				// a 0 refiriendose a la primera letra, entramos en el bucle.
				if (i != 0 && j == 0) {
					// En la variable primerCaracter almacenamos el caracter en mayuscula usando la
					// clase Character y toUpperCase para poner le primer caracte de la palabra que
					// estemos recorriendo en mayuscula.
					primerCaracter = Character.toUpperCase(tablaFrase[i].charAt(0));
					
					
					tablaFrase[i] = tablaFrase[i].replace(tablaFrase[i].charAt(j), primerCaracter);
				}
			}
		}
		// A nuestro variable fraseEnCamel le implementamos el método valueOf para
		// pasar el array a cadena y un replace para sustituir los espacios en blanco
		// por ningun espacio.
		fraseEnCamel = String.join(" ", tablaFrase).replace(" ", "");

		return fraseEnCamel;
	}

}
