package boletin1;

import java.util.Scanner;

/**
 * Este programa pide dos palabras al usuario y una función se encarga de
 * devolver si las palabras introducidas son anagramas o no.
 */
public class EjercicioA13 {

	public static void main(String[] args) {

		// Creamos la variable palabra1 como String para almacenar la primera palabra
		// introducida por el usuario.
		String palabra1 = "";

		// Creamos la variable palabra2 como String para almacenar la segunda palabra
		// introducida por el usuario.
		String palabra2 = "";

		// Creamos la variable resltAnagrama como boolean para almacenar el boleano que
		// nos devuelve la función esAnagrama;
		boolean resltAnagrama;

		// Creamos el Scanner para leer las dos palabras introducidas por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la primera palabra y la leemos
		System.out.print("Introduce la primera palabra --> ");
		palabra1 = sc.next();

		// Le pedimos al usuario que introduzca la segunda palabra y la leemos
		System.out.print("Introduce la segunda palabra --> ");
		palabra2 = sc.next();

		// A la variable resltAnagrama le pasamos el boleano que nos devuelve la función
		// esAnagrama.
		resltAnagrama = esAnagrama(palabra1, palabra2);

		//Salto de linea
		System.out.println();
		
		// Comprobamos si el resultado es true o false e imprimimos el respectivo
		// mesaje.
		if (resltAnagrama) {
			System.out.println("¡FELICIDADES! Las palabras introducidas son anagramas.");
		} else {
			System.out.println("¡LO SIENTO! Las frases introducidas no son anagramas.");
		}

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función compara si dos palabras son anagramas o no.
	 * 
	 * @param palabra1 La primera palabra pasada como parametro.
	 * @param palabra2 La segunda palabra pasada como parametro.
	 * @return True si son anagramas. False si no son anagramas.
	 */
	public static boolean esAnagrama(String palabra1, String palabra2) {

		// Creamos al variable reslt como boolean para almacenar el resultado de
		// comprobar si las dos palabras son anagramas.
		boolean reslt = true;

		// Cramos la variable indice para recorrer cada caracter de la palabra.
		int indice = 0;

		// Comprobamos si el indice es menor que la longitud de la tabla y que el result
		// sea true.
		while (indice < palabra1.length() && reslt) {

			// Comprobamos si cada indice de la palabra2 aparece en la palabra1 si es así
			// devuelve un valor positivo, pero si no devuelve negativo, si devuelve
			// negativo ponemos reslt a false;
			if (palabra1.indexOf(palabra2.charAt(indice)) < 0) {
				reslt = false;
			}

			// Incrementamos el indice a +1 en cada iteración.
			indice++;
		}

		// Devolvemos true o false dependiendo de si son anagramas o no.
		return reslt;
	}

}
