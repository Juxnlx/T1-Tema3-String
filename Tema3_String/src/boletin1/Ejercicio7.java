package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una frase y una palabra, y una función se encarga de
 * devolver cuantas veces aparece esa palabra en la frase.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario y la vamos a buscar en la frase.
		String palabra = "";

		// Creamos el Scanner para solicitar la frase y la palabra por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Le pedimos al usuario que introduzca una palabra y la leemos.
		System.out.println("Introduce la palabra a buscar --> ");
		palabra = sc.nextLine();

		System.out.println(contPalabra(frase, palabra));

		// Cierre de Scanner
		sc.close();
	}

	public static int contPalabra(String frase, String palabra) {

		// Creamos la variable cont como int para contabilizar las veces que aparece la
		// palabra.
		int cont = 0;

		int indice = 0;

		// Creamos la variable pos para comprobar si el indexOf nos devuelve una
		// posición positiva o negativa.
		int pos = frase.indexOf(palabra, indice);

		while (pos >= 0) {

			cont++;

			indice = pos + palabra.length();

			pos = frase.indexOf(palabra, indice);
		}

		return cont;
	}

}
