package boletin1;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		// Creamos la variable contr como String para almacenar la palabra introducida
		// por el jugador 1, que será la que haya que adivinar.
		String contr = "";

		// Creamos la variable intentoContr como String para almacenar los intentos
		// introducidos por el jugador 2.
		String intentoContr = "";

		// Creamos el Scanner para leer la contraseña y el intento por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador 1 que introduzca la contraseña y la leemos.
		System.out.println("Jugador 1, Introduce la contraseña: ");
		contr = sc.nextLine();

		// Le pedimos jugador 2 que introduzca el intento y lo leemos.
		System.out.println("Jugador 2, introduce la contraseña: ");
		intentoContr = sc.nextLine();

		// Comprobamos si el intento introducido por el usuario es distinto a la
		// contraseña, si es así ejecutamos el while.
		while (!contr.equals(intentoContr)) {

			// Mensaje de aciertos.
			System.out.println();
			System.out.print("Caracteres acertados --> ");

			// Con este for recorremos todos los caracteres de la contraseña introducida.
			for (int i = 0; i < contr.length(); i++) {

				// Comprobamos si el indice que va recorriendo nuestra contraseña es menor que
				// la longitud de la cadena introducida por el jugador 2 para comprobar que no
				// se salga del array. Y también comprobamos si el caracter de cada cadena en la
				// misma posición es igual, si es así imprimimos el caracter.
				if (i < intentoContr.length() && contr.charAt(i) == intentoContr.charAt(i)) {
					System.out.print(contr.charAt(i));

					// Si no, imprimimos un asterisco.
				} else
					System.out.print("*");
			}

			// Le pedimos jugador 2 que introduzca el intento y lo leemos.
			System.out.println();
			System.out.println("Jugador 2, introduce la contraseña: ");
			intentoContr = sc.nextLine();
		}

		// Mensaje de felicitación por acertar la contraseña.
		System.out.println();
		System.out.println("Enhorabuena has acertado la contraseña.");

		// Cierre de Scanner
		sc.close();

	}

}
