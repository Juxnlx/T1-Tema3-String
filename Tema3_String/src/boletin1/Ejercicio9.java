package boletin1;

import java.util.Scanner;

/**
 * Este pograma se encarga de traducir una frase de un idioma a otro idioma no
 * inventado. Y tambien debe de indicar si la frase introducida ya esta
 * traducida o no.
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos la constante prefijo para almacenar las palabras por las que comienzan
		// las frases los habitante de javalandia.
		final String prefijo = "Javalín, javalón";

		// Creamos la variable sufijo para almacenar las palabras por las que terminan
		// las frases los habitante de javalandia.
		final String sufijo = "javalén, len, len";

		// Creamos la varible pos para almacenar la posición por la que debemos de
		// empezar a agrupar la nueva frase o cual es la ultima posición hasta donde
		// debemos de agrupar.
		int pos;

		// Creamos la variable fraseTraducida para almacenar la nueva frase sin el
		// prefijo o sufijo de javalandia.
		String fraseTraducida = "";

		// Creamos el Scanner para solicitar la frase por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Comprobamos si el prefijo de Javalandia existe en la frase introducida por el
		// usuario con el metodo startsWith.
		if (frase.startsWith(prefijo)) {
			System.out.println("La frase no esta traducida.");

			// A la variable pos le indicamos donde se encuentran los dos espacios y a
			// partir de ahí se formará la frase traducida.
			pos = frase.indexOf("  ");

			// A la variable fraseTraducida le asignamos el resto de la frase pero
			// empezando a contar desde la posición que nos devuelve la variable pos +2 para
			// no incluir los dos espacios.
			fraseTraducida = frase.substring(pos + 2);

			// Imprimimos la frase traducida.
			System.out.println();
			System.out.println("Frase traducida: " + fraseTraducida);

			// Comprobamos si el sifijo de Javalandia existe en la frase introducida por el
			// usuario con el metodo endsWith.
		} else if (frase.endsWith(sufijo)) {
			System.out.println("La frase no esta traducida.");

			// A la variable pos le indicamos donde se encuentran los dos espacios y hasta
			// ahí se formará la frase traducida empezando desde 0..
			pos = frase.indexOf("  ");

			// A la variable fraseTraducida le asignamos la parte de la frase desde 0 hasta
			// la posición que nos proporciona la variable pos donde se encuentran los dos
			// espacios.
			fraseTraducida = frase.substring(0, pos);

			// Imprimimos la frase traducida.
			System.out.println();
			System.out.println("Frase traducida: " + fraseTraducida);

			// Si no, es que la frase no se encuentra en idioma javalandia, entonces la
			// imprimimos tal cual.
		} else {
			System.out.println("La frase esta en idioma original: ");
			System.out.println(frase);
		}

		// Cierre de Scanner.
		sc.close();
	}

}
