package boletin1;

import java.util.Scanner;

/**
 * Este programa lee una frase palabra a palabra y finalmente el programa debe
 * de mostrar la frase completa con espacios hasta que la ultima cadena sea fin
 * y no se añade.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la variable palabra como String para almacenar cada palabra que
		// introduzca el usuario para formar la frase.
		String palabra = "";

		// Creamos la variable frase como String para almacenar la frase completa con
		// todas las palabras introducidas por el usuario.
		String frase = "";

		// Creamos el Scanner para solicitar la palabra al usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la palabra y la leemos
		System.out.print("Introduce una palabra: ");
		palabra = sc.next();

		// Comprobamos si la palabra introducida por el usuario es fin, si no es así
		// concatenamos la palabra y volvemos a preguntar otra palabra.
		while (!palabra.equalsIgnoreCase("fin")) {

			// A la cadena frase le vamos concatenando cada palabra que va introduciendo el
			// usuario.
			frase += palabra + " ";

			// Le pedimos al usuario la palabra y la leemos.
			System.out.print("Introduce una palabra de nuevo: ");
			palabra = sc.next();
		}

		// Imprimimos la frase con todas las palabras concatenadas.
		System.out.println(frase);

		// Cierre de Scanner
		sc.close();
	}

}
