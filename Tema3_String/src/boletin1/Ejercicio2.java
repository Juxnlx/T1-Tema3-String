package boletin1;

import java.util.Scanner;

/**
 * Este programa consiste en que el primer jugador introduce una contraseña y el
 * segundo jugador introduce intentos hasta que acierte y la máquina nos muestra
 * si la palabra introducida por el jugador 2 es mayor o menor alfabeticamente.
 */
public class Ejercicio2 {

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

			// Comprobamos mediante el metodo compareTo si el intento es mayor
			// alfabeticamente que la contraseña si es así, mostramos que la cadena
			// introducida es mayor.
			if (intentoContr.compareTo(contr) > 0) {
				System.out.println("La cadena introducida es mayor alfabeticamente");
				// Si no, la cadena introducida es menor.
			} else {
				System.out.println("La cadena introducida es menor alfabeticamente");
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
