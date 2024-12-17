package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una palabra y un número por el cual se
 * guardaran tantas letras en cada posición del array, esto lo realiza una
 * función y el main lo muestra.
 */
public class EjercicioA20 {

	public static void main(String[] args) {

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario.
		String palabra = "";

		// Creamos la variable secuencia como int para almacenar la secuencia de letras,
		// este valor será introducido por el usuario.
		int secuencia;

		// Creamos el Scanner para leer la palabra y la secuencia introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la palabra y la leemos.
		System.out.print("Introduce una palabra: ");
		palabra = sc.nextLine();

		// Le pedimos al usuario que introduzca la secuencia a llevar a cabo y la
		// leemos.
		System.out.print("Introduce la secuencia: ");
		secuencia = sc.nextInt();

		// Cierre de Scanner
		sc.close();

	}

	public static String[] secuenciaPalabra(String palabra, int secuencia) {

		// Declaramos el array tablaPalabra como String para almacenar en cada posición
		// ciertas secuencias de letras de la palabra pasada como parametro.
		String º
	}

}
