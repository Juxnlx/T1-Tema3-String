package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una cadena al usuario y el programa debe de dolvolver
 * todas las letras que contenga esa cadena y las veces que aparece.
 */
public class EjercicioA14 {

	public static void main(String[] args) {

		// Creamos la variable cadena como String para almacenar la frase introducida
		// por el usuario.
		String cadena = "";

		// Creamos el array abecedario como char para alamcenar todas las letras del
		// abecedario.
		char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		// Creamos la variable cont como int para contabilizar las veces que aparece
		// cada letra.
		int cont = 0;

		// Creamos el Scanner para solicitar la cadena por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una cadena y la leemos.
		System.out.println("Introduce una cadena --> ");
		cadena = sc.nextLine();

		// Imprimimos la cadena introducida por el usuario.
		System.out.println();
		System.out.println("Frase: " + cadena);
		System.out.println("Resultado: ");

		// Convertimos la cadena introducida por el usuario en minuscula.
		cadena = cadena.toLowerCase();

		// Con este for recorremos nuestro array abecedario y con el todas las letras
		// del mismo.
		for (int i = 0; i < abecedario.length; i++) {
			// Inicializamos el cont a 0 para que en cada vuelta empieze a contar cada letra
			// desde 0.
			cont = 0;

			// Con este for recorremos cada letra de la cadena introducida por el usuario.
			for (int j = 0; j < cadena.length(); j++) {

				// Con este if comprobamos si la letra que estamos recorriendo del abecedario es
				// igual que la de la cadena, si es así incrementamos +1 en cont, eso significa
				// que ha aparecido al menos una vez en la cadena.
				if (abecedario[i] == cadena.charAt(j)) {
					cont++;
				}
			}

			// Al final del for de fuera comprobamos si el cont es mayor que 0, si es así
			// imprimimos la letra que es y las veces que se repite. La comprobación la
			// hacemos mayor que 0 para solo imprimir las que aparecen al menos 1 vez.
			if (cont > 0) {
				System.out.println(abecedario[i] + ": " + cont + " veces");
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
