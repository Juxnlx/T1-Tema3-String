package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	// Creamos la variable palabraSecreta como String para almacenar la palabra que
	// ha sido seleccioanda de forma aleatoria de la matriz palabras.
	static String palabraSecreta = "";

	public static void main(String[] args) {

		// Creamos el array palabras como String para almacenar una serie de palabras
		// con la que jugaremos.
		String palabras[] = { "bebes", "manos", "casas", "perro", "raton", "lapiz" };

		// Creamos la variable intento como String para almacenar la palabra introducida
		// por el usuario.
		String intento = "";

		// Creamos el Scanner para leer la palabra introducida por el usuario.
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra y la leemos.
		System.out.println("Introduce una palabra: ");
		intento = reader.nextLine();

		// Cierre de Scanner
		reader.close();
	}

	public static void palabraSecreta(String palabras[]) {
		// Creamos el objeto random para seleccionar una palabra aleatoria.
		Random rand = new Random();

		// Creamos la variable pos como int para almacenar una posición aleatoria de
		// nuestro array palabras.
		int pos = rand.nextInt(0, palabras.length);

		// Asignamos a la variable palabraSecreta una palabra aleatoria del array pasado
		// como parametro.
		palabraSecreta = palabras[pos];
	}

	public static String correccionIntento(String intentoUsuario) {

		// Creamos la variable intentoCodificado como String para almacenar aquellas
		// letras que coincidan.
		String intentoCodificado = "";
		
		//Creamos la variable letra como char para almacenar la letra que vamos recorriendo en ese momento.
		char letra;
		
		for (int i = 0; i < palabraSecreta.length(); i++) {
			
			letra = intentoUsuario.charAt(i);
			
			if (palabraSecreta.charAt(i) == letra) {
				intentoCodificado += palabraSecreta.charAt(i);
			} else
		}
		
		return intentoCodificado;
	}

}
