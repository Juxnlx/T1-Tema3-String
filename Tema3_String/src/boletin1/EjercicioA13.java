package boletin1;

import java.util.Arrays;
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
		palabra1 = sc.nextLine().toLowerCase();

		// Le pedimos al usuario que introduzca la segunda palabra y la leemos
		System.out.print("Introduce la segunda palabra --> ");
		palabra2 = sc.nextLine().toLowerCase();

		// A la variable resltAnagrama le pasamos el boleano que nos devuelve la función
		// esAnagrama.
		resltAnagrama = esAnagrama(palabra1, palabra2);

		// Salto de linea
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
		boolean reslt;

		// Creamos el array tablapalabra1 como char para almacenar cada letra en una
		// posición del array de la palabra 1.
		char tablapalabra1[] = new char[palabra1.length()];

		// Creamos el array tablapalabra1¡2 como char para almacenar cada letra en una
		// posición del array de la palabra 2.
		char tablapalabra2[] = new char[palabra2.length()];

		// Almacenamos en cada array cada una de las letra de las palabras haciendo uso
		// de el metodo toCharArray para transforma cada palabra.
		tablapalabra1 = palabra1.toCharArray();
		tablapalabra2 = palabra2.toCharArray();
		
		//Ordenamos cada array haciendo uso del método sort.
		Arrays.sort(tablapalabra1);
		Arrays.sort(tablapalabra2);
		
		//Asignamos a la variable reslt true o false dependiendo de si son iguales o no cada array.
		reslt = Arrays.equals(tablapalabra1, tablapalabra2);

		// Devolvemos true o false dependiendo de si son anagramas o no.
		return reslt;
	}

}
