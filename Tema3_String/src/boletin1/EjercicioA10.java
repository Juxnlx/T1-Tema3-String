package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita, una palabra al usuario y una función se encarga de
 * devolver cada caracter codificado, para luego imprimir la palabra ya
 * codificada.
 */
public class EjercicioA10 {

	public static void main(String[] args) {

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario.
		String palabra = "";

		// Creamos la variable palabraCodificada como String para almacenar la palabra
		// ya codificada.
		String palabraCodificada = "";

		// Creamos la variable caracter como char para almacenar el caracter a
		// codificar.
		char caracter;

		// Creamos el array conjunto1 como char para almacenar todos los caracteres que
		// deben de ser codificados.
		final char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Creamos el array conjunto2 como char para almacenar todos los caracteres por
		// los que deben de ser ccodificados los caracteres de conjunto1.
		final char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos el Scanner para leer la palabra introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra y la leemos, una vez
		// introducida la almacenamos en minuscula.
		System.out.print("Introduce una palabra --> ");
		palabra = sc.nextLine().toLowerCase();

		// Con este for vamos recorriendo cada caracter de la palabra introducida por el
		// usuario.
		for (int i = 0; i < palabra.length(); i++) {

			// En la variable caracter almacenamos el caracter de la palabra usando el
			// metodo charAt.
			caracter = palabra.charAt(i);
			// Ahora machacamos ese caracter con el nuevo que nos devuelve la función
			// codifica, para ello debemos de llamarla.
			caracter = codifica(conjunto1, conjunto2, caracter);
			// En la variable palabraCodificada vamos incrementando el caracter devuelto por
			// la función codifica.
			palabraCodificada += caracter;
		}

		// Imprimimos la palabra codificada.
		System.out.println();
		System.out.println("Palabra codificada --> " + palabraCodificada);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de codicar un caracter pasado como parametro por
	 * otro.
	 * 
	 * @param conjunto1 Array de caracteres donde se encuentran los caracteres que
	 *                  debemos de codificar.
	 * @param conjunto2 Array de caracteres donde se encuentran los caracteres por
	 *                  los que debemos de sustituir los del conjunto1.
	 * @param c         Caracter pasado como parametro.
	 * @return Caracter pasado como parametro ya codificado.
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Creamos la variable caracterDevolver como char para almacenar el char que
		// vamos a devolver. Lo inicializamos al mismo que se pasa como parametro porque
		// si no se encuentra en el conjunto 1 se devuelve el mismo.
		char caracterDevolver = c;

		// Creamos la variable i para saber cual es la posición que estamos recorriendo
		// del conjunto 1.
		int i = 0;

		// Creamos la variable enc como boolean para saber si hemos encontrado el
		// caracter o no.
		boolean enc = false;

		// Creamos el while para recorrer el conjunto 1 hasta encontar el caracter, una
		// vez encontrado nos salimos.
		while (i < conjunto1.length && !enc) {
			// Comprobamos si el caracter pasado como parametro se encuentra en el conjunto
			// 1, si es así caracter a devolver pasa a ser el caracter del conjunto2
			// correspondiendo a la misma posición.
			if (c == conjunto1[i]) {
				caracterDevolver = conjunto2[i];
			}

			// Incrementamos en +1 la posición.
			i++;
		}

		// Devolvemos el caracter codificado, si es que debe de ser codificado.
		return caracterDevolver;
	}

}
