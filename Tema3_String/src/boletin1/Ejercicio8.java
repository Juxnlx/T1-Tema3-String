package boletin1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita una frase al usuario y el programa debe de devolver
 * esa frase pero con cada palabra que contiene ordenada alfabeticamente.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos el array tablaFrase como String para almacenar la frase introducida
		// por el usuario.
		String[] tablaFrase;

		// Creamos el Scanner para solicitar la frase por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Asignamos le asignamos al array tablafrase en cada posición una palabra de la
		// frase usando el metodo split.
		tablaFrase = frase.split(" ");

		// Para ordenar la frase alfabeticamente usamos el metodo sort para ordenar el
		// array.
		Arrays.sort(tablaFrase);

		System.out.println();

		// A nuestra variable frase le hacemos un join para unir de nuevos todas las
		// palabras de la frase en una unica variable pero de forma ordenada.
		frase = String.join(" ", tablaFrase);

		// Imprimimos la frase ya ordenada.
		System.out.print("Palabras de la frase ordenadas --> " + frase);

		// Cierre de Scanner
		sc.close();

	}

}
