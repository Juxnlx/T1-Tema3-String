package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una cadena al usuario y una función se encarga de
 * devolver en el main esa cadena pero leida de final a principio.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable frase como String para almacenar una frase introducida
		// por el usuario.
		String frase = "";

		// Creamos la variable fraseInvertida como String para almacenar la frase
		// introducida por el usuario pero al reves.
		String fraseInvertida = "";

		// Creamos el Scanner para leer la frase por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la frase que desea y la leemos por
		// teclado.
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();

		// Le asignamos a la variable fraseInversa la frase que nos devuelve la función
		// invertirCadena.
		fraseInvertida = invertirCadena(frase);

		// Imprimimos la cadena al reves.
		System.out.println();
		System.out.println("Cadena invertida --> " + fraseInvertida);

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función se encarga de darle la vuelta a la cadena.
	 * 
	 * @param cadena La cadena introducida por el usuario.
	 * @return La cadena introducida por el usuario a la inversa.
	 */
	public static String invertirCadena(String cadena) {

		// Creamos la variable cadenaInvertida como String para almacenar la frase
		// pasada
		// como parametro pero al reves.
		String cadenaInvertida = "";

		// Con este for recorremos cada caracter de la frase introducida por el usuario
		// pero de manera inversa.
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// A la variable cadenaInvertida le vamos concatenando cada valor de la frase de
			// final a principio.
			cadenaInvertida += cadena.charAt(i);
		}

		// Devolvemos la frase introducida por el usuario de forma inversa.
		return cadenaInvertida;
	}
}
