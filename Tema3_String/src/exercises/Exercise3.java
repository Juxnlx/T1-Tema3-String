package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa recrea el juego del ahorcado, se eligira una palabra estre
 * varias y el jugador debe de ir introduciendo palabras hasta descubir la
 * palabra entera.
 */
public class Exercise3 {

	public static void main(String[] args) {

		// Creamos el array palabrasJuego como String para almacenar una serie de
		// palabras que seran las que tenemos que adivinar en el juego.
		String[] palabrasJuego = { "PYTHON", "PERRO", "HOLA MUNDO" };

		// Creamos la variable palabraElegida como String para almacenar la palabra
		// selecioanada de la matriz palabrajuego por la función "palabraJuego".
		String palabraElegida = "";

		// Creamos la variable jugador como String para almacenar el caracter o la
		// palabra introducida por el usuario.
		String jugador = "";

		// Creamos la variable cont como int para contabilar los intentos que tiene el
		// jugador.
		//int cont;

		// Creamos el Scanner para leer las palabras o letras que va introduciendo el
		// jugador.
		Scanner sc = new Scanner(System.in);

		// Asignamos a la variable palabraElegida la palabra devuelta por la función
		// "palabraJuego".
		palabraElegida = palabraJuego(palabrasJuego);

		// Le pedimos al usuario que introduzca la palabra si sabe cual el o si no una
		// letra y la leemos.
		System.out.println("Introduce una opción: ");
		jugador = sc.nextLine();

		System.out.println(mostrarResultado(palabraElegida, jugador));
		
		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de seleccionar de forma aleatoria una palabra que se
	 * encuentra en la matriz predefinida en el main.
	 * 
	 * @param palabras El array donde se encuentran todas las palabra.
	 * @return La palabra que ha sido seleccionada y la que tendremos que adivinar
	 *         en el juego.
	 */
	public static String palabraJuego(String palabras[]) {

		// Creamos el Random para que nos genere un número aleatorio que corresponda a
		// una posición de la matriz, para seleccionar una pálabra.
		Random rand = new Random();

		// Creamos la variable palabraSelc como String para almacenar la palabra elegida
		// de todas las almacenadas en la matriz predefinida.
		String palabraSelc = "";

		// Le asignamos a la variable palabraSelc una palabra aleatoria de la matriz,
		// pasada como parametro.
		palabraSelc = palabras[rand.nextInt(0, palabras.length)];

		return palabraSelc;
	}

	public static String mostrarResultado(String palabraElegida, String jugador) {

		// Creamos la solución final como String para almacenar los intentos del
		// usuario, acierto o fallos.
		String solucionFinal = "";

		// Creamos el array resultado como char para mostrar al usuario si hay
		// algun acierto.
		char resultado[] = new char[palabraElegida.length()];

		// Creamos el array tablaPalabraElegida para almacenar cada caracter de la
		// palabraElegida y para ello hacemos usu del método toCharArray.
		char[] tablaPalabraElegida = palabraElegida.toCharArray();

		// Creamos el array tablaJugador para almacenar cada caracter de la
		// palabraElegida y para ello hacemos usu del método toCharArray.
		char[] tablaJugador = jugador.toCharArray();

		Arrays.fill(resultado, '_');

		for (int i = 0; i < tablaPalabraElegida.length; i++) {
			if (tablaPalabraElegida[i] == ' ') {
				resultado[i] = ' ';
			}
		}

		for (int i = 0; i < tablaPalabraElegida.length; i++) {
			if (jugador.length() == 1) {
				if (tablaPalabraElegida[i] == tablaJugador[0]) {
					resultado[i] = tablaJugador[0];
				}
			}
		}

		
		solucionFinal = String.valueOf(resultado);
		solucionFinal = solucionFinal.replace("", " ");
		solucionFinal.trim();
		
		return solucionFinal;

	}

}
