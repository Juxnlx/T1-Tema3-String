package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una frase por teclado y el programa debe de
 * mostrar cual es la palabra con mayor longitud y cual es la longitud de la
 * misma.
 */
public class EjercicioA12 {

	public static void main(String[] args) {

		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos al variable palabraMax como String para alamcenar cual el la palabra
		// con mayor longitud de la frase introducida por el usuario.
		String palabraMax = "";

		// Declaramos el array tablaFrase como String, ya que en el almacenaremos cada
		// palabra de la frase.
		String[] tablaFrase;

		// Creamos el Scanner para leer la frase introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Al array tablaFrase le añadimos cada palabra de la frase introducida por el
		// usuario utilizando el metodo split.
		tablaFrase = frase.split(" ");

		// Con este for recorremos el array donde se encuentra cada palabra.
		for (int i = 0; i < tablaFrase.length; i++) {

			// Comprobamos si la longitud de la palabraMax es menor que la de la palabra que
			// estamos recorriendo, si es asi a la palabraMax le indicamos la palabra que
			// estamos recorriendo es esta iteración.
			if (palabraMax.length() < tablaFrase[i].length()) {
				palabraMax = tablaFrase[i];
			}
		}

		// Imprimimos la palabra con mayor longitud y la longitud de dicha palabra.
		System.out.println();
		System.out.println("Palabra con mayor longitud --> " + palabraMax);
		System.out.println("Longitud de \"" + palabraMax + "\": " + palabraMax.length());

		// Cierre de Scanner
		sc.close();
	}

}
