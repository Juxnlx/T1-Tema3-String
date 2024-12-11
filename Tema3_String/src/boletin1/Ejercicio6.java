package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una frase al usuario y el programa en el main solicita
 * una frase y nos muestra si la frase es polindroma o no.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos la variable reslt como boolean para alamcenar true o false,
		// dependiendo de lo que nos devuelva la función esPalindroma.
		boolean reslt;

		// Creamos el Scanner para solicitar la frase por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la frase de la que queremos saber si es
		// palíndroma y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Le quitamos los espacios a la frase con el metodo replace y machacamos la
		// frase original con espacios. Usamos el metodo toLowerCase para pasar la frase
		// a minuscula.
		frase = frase.replace(" ", "").toLowerCase();

		// Llamamos a la función esPalindroma y almacenamos su resultado en nuestra
		// variable reslt.
		reslt = esPalindroma(frase);

		// Comprobamos si el resultado devuelto por la función esPalindroma es true o
		// false.
		if (reslt) {
			System.out.println("¡ENHORABUENA! La frase introducida es palíndroma.");
		} else {
			System.out.println("¡LO SIENTO! La frase introducida no es palíndroma.");
		}

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función se encarga de devolver true o false si la frase pasada como
	 * parametro es palíndroma o no.
	 * 
	 * @param frase La frase introducida por el usuario.
	 * @return true, si la frase es palíndroma. false, si no es palíndroma.
	 */
	public static boolean esPalindroma(String frase) {

		// Creamos la variable palindroma como boolean, para almacenar true o false en
		// el caso de ser palindroma o no.
		boolean palindroma = true;

		// Creamos la variable indice como int para ir recorriendo cada caracter de la
		// frase introducida por el usuario.
		int indice = 0;

		// Comprobamos que el indice sea menor que la longitud de la frase y que
		// palindroma sea true, si es así ejecutamos el while.
		while (indice < frase.length() && palindroma) {

			// Comprobamos si los caracteres contando desde el principio y desde el final no
			// coinciden, si es así indicamos que es false y nos salimos del bucle.
			if (frase.charAt(indice) != frase.charAt(frase.length() - 1 - indice)) {
				palindroma = false;
			}

			// Incrementamos el indice de busqueda.
			indice++;
		}

		// Devolvemos si la frase es palíndorma o no.
		return palindroma;
	}

}
