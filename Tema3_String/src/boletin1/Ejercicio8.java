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
		
		String menor ="";

		// Creamos el Scanner para solicitar la frase por teclado.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Asignamos le asignamos al array tablafrase en cada posición una palabra de la
		// frase usando el metodo split.
		tablaFrase = frase.split(" ");

		for (int i = 0; i < tablaFrase.length; i++) {
			
			for (int j = 0; j < tablaFrase.length; j++) {
				if (tablaFrase[i].compareTo(tablaFrase[j]) < 0) {
					menor= tablaFrase[i];
				}
			}
			System.out.print(menor + " ");
		}

		// Cierre de Scanner
		sc.close();

	}

}
