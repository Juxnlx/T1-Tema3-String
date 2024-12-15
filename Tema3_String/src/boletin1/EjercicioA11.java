package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita, una palabra codificada al usuario y una función se
 * encarga de devolver cada caracter descodificado, para luego imprimir la
 * palabra descodificada.
 */
public class EjercicioA11 {

	public static void main(String[] args) {

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario.
		String palabra = "";

		// Creamos la variable palabraDescodificada como String para almacenar la
		// palabra
		// ya descodificada.
		String palabraDescodificada = "";

		// Creamos la variable caracter como char para almacenar el caracter a
		// descodificar.
		char caracter;

		// Creamos el array conjunto1 como char para almacenar todos los caracteres por
		// los que deben de ser descodificados los caracteres de conjunto2.
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Creamos el array conjunto2 como char para almacenar todos los caracteres que
		// deben de ser descodificados.
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos el Scanner para leer la palabra introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra y la leemos
		System.out.print("Introduce una palabra --> ");
		palabra = sc.nextLine();

		// Pasamos la palabra introducida por el usuario a minuscula.
		palabra = palabra.toLowerCase();

		// Con este for vamos recorriendo cada caracter de la palabra introducida por el
		// usuario.
		for (int i = 0; i < palabra.length(); i++) {

			// En la variable caracter almacenamos el caracter de la palabra usando el
			// metodo charAt.
			caracter = palabra.charAt(i);
			// Ahora machacamos ese caracter con el nuevo que nos devuelve la función
			// descodifica, para ello debemos de llamarla.
			caracter = descodifica(conjunto1, conjunto2, caracter);
			// En la variable palabraDescodificada vamos incrementando el caracter devuelto
			// por
			// la función descodifica.
			palabraDescodificada += caracter;
		}

		// Imprimimos la palabra descodificada.
		System.out.println();
		System.out.println("Palabra descodificada --> " + palabraDescodificada);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de descodicar un caracter pasado como parametro por
	 * otro.
	 * 
	 * @param conjunto1 Array de caracteres donde se encuentran los caracteres por
	 *                  los que debemos de descodificar los del conjunto2.
	 * @param conjunto2 Array de caracteres donde se encuentran los caracteres codificados.
	 * @param c         Caracter pasado como parametro.
	 * @return Caracter pasado como parametro ya descodificado.
	 */
	public static char descodifica(char conjunto1[], char conjunto2[], char c) {

		// Creamos la variable caracterDevolver como char para almacenar el char que
		// vamos a devolver. Lo inicializamos al mismo que se pasa como parametro porque
		// si no se encuentra en el conjunto 2 se devuelve el mismo.
		char caracterDevolver = c;

		// Creamos este for para recorrer el conjunto2.
		for (int i = 0; i < conjunto2.length; i++) {
			// Comprobamos si el caracter pasado como parametro se encuentra en el conjunto
			// 2, si es así caracter a devolver pasa a ser el caracter del conjunto1
			// correspondiendo a la misma posición.
			if (c == conjunto2[i]) {
				caracterDevolver = conjunto1[i];
			}
		}

		// Devolvemos el caracter descodificado, si es que debe de ser descodificado.
		return caracterDevolver;
	}

}
