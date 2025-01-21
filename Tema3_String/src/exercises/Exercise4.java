package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	// Creamos el array palabras como String para almacenar una serie de palabras
	// con la que jugaremos.
	static String palabras[] = { "bebes", "manos", "casas", "perro", "raton", "lapiz" };

	// Creamos la variable palabraSecreta como String para almacenar la palabra que
	// ha sido seleccioanda de forma aleatoria de la matriz palabras.
	static String palabraSecreta = "";

	// Creamos la variable pistaIntento como String para almacenar la codificación
	// de la palabra.
	static String pistaIntento;

	// Creamos la constate NUMINTENTOS como int para almacenar el número de intentos
	// que tenemos y lo inicializamos a 6 intentos.
	static final int NUMINTENTOS = 6;

	public static void main(String[] args) {

		// Creamos la variable intento como String para almacenar la palabra introducida
		// por el usuario.
		String intentoJugador = "";

		// Creamos la variable intentos como int para almacenar los intentos que le
		// quedan al jugador.
		int intentos = NUMINTENTOS;

		// Creamos la variable adivinar como boolean para saber cuando hemos acertado y
		// debemos de finalizar el bucle.
		boolean adivinar = false;

		// Creamos el Scanner para leer la palabra introducida por el usuario.
		Scanner reader = new Scanner(System.in);

		palabraSecreta();

		while (!adivinar && intentos > 0) {

			System.out.println(palabraSecreta);

			// Le pedimos al usuario que introduzca una palabra y la leemos.
			System.out.println("Jugador 2 introduce una palabra: ");
			intentoJugador = reader.nextLine();

			correccionIntento(intentoJugador);

			System.out.println("Pista: " + pistaIntento);

			intentos--;

			if (intentoJugador.equals(palabraSecreta)) {
				adivinar = true;
			}
			System.out.println(intentos);
		}

		if (adivinar) {
			System.out.println("Enhorabuena");
		} else {
			System.out.println("Lo siento has perdido");
		}

		// Cierre de Scanner
		reader.close();
	}

	public static void palabraSecreta() {
		// Creamos el objeto random para seleccionar una palabra aleatoria.
		Random rand = new Random();

		// Creamos la variable pos como int para almacenar una posición aleatoria de
		// nuestro array palabras.
		int pos = rand.nextInt(0, palabras.length);

		// Asignamos a la variable palabraSecreta una palabra aleatoria del array pasado
		// como parametro.
		palabraSecreta = palabras[pos];
	}

	public static void correccionIntento(String intentoUsuario) {

		// Creamos la variable letra como char para almacenar la letra que vamos
		// recorriendo en ese momento.
		char letra;

		// Inicializamos pistaIntento a cadena vacia antes de empezar.
		pistaIntento = "";

		for (int i = 0; i < palabraSecreta.length(); i++) {

				letra = intentoUsuario.charAt(i);
			
			if (palabraSecreta.charAt(i) == letra) {
				pistaIntento += palabraSecreta.charAt(i);
			} else if (palabraSecreta.indexOf(letra) >= 0) {
				pistaIntento += '*';
			} else {
				pistaIntento += '_';
			}

		}
	}

}
