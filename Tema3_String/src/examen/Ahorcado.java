package examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	// Creamos el array palabras como String para almacenar las distintas palabras
	// con las que podemos jugar al ahorcado.
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	// Creamos la la constante NUMINTENTOS para almacenar el número de intentos que
	// tiene el jugador.
	static final int NUMINTENTOS = 7;

	// Creamos la variable palabraSecreta como String para almacenar la palabra
	// secreta que debe de acertar el jugador.
	static String palabraSecreta = "";

	// Creamos la variable palabraPista como String para almacenar las letras que
	// corresponden a la palabra secreta.
	static String palabraPista = "";

	// Creamos la variable noAcertadas como String para almacenar aquellas letras
	// que no se encuentran en la palabra a acertar.
	static String noAcertadas = "";

	// Creamos el Scanner para leer información solicitada por el usuario por
	// consola.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Esta función se encarga en almacenar el la variable palabraSecreta una de las
	 * palabras que se encuentra en el array palabras.
	 */
	public static void generaPalalabra() {

		// Creamos el Random para generar una posición aleatoria del array palabras.
		Random rand = new Random();

		// Almacenamos en la variable palabraSecreta una palabra del array palabra, para
		// ello usuamos el método random para que nos genere una posición entre 0 y la
		// longitud del array.
		palabraSecreta = palabras[rand.nextInt(0, palabras.length)];
	}

	/**
	 * Esta función se encarga de preguntar al usuario que opción quiere ejecutar
	 * tras mostrar un menu.
	 * 
	 * @return opcionMenu La opción selecciona por el usuario.
	 */
	public static int menu() {

		// Creamos la variable opcionMenu como int para almacenar la opción seleccionada
		// por el usuario.
		int opcionMenu;

		// Mostramos el menú con las distintas funciones.
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("1. Introducir letra. ");
		System.out.println("2. Introducir palabra. ");

		// Le pedimos al usuario que introduzca la opción que desea ejecutar y la
		// leemos.
		System.out.print("Introduce una opción: ");
		opcionMenu = sc.nextInt();

		// Devolvemos la opción seleccionada por el usuario.
		return opcionMenu;
	}

	/**
	 * Esta función se encarga de 
	 * @param letra
	 */
	public static void compruebaLetra(char letra) {

		// Creamos el array tablaPalabraPista como char para almacenar las letras que ha
		// acertado el usuario.
		char tablaPalabraPista[] = new char[palabraSecreta.length()];

		// Usamos el metodo fill para inicializar todas las posiciones del array a guión
		// bajo.
		Arrays.fill(tablaPalabraPista, '_');

		for (int i = 0; i < palabraSecreta.length(); i++) {

			if (letra == palabraSecreta.charAt(i)) {
				tablaPalabraPista[i] = letra;
			} else {
				noAcertadas += letra;
			}
		}
	}
}
