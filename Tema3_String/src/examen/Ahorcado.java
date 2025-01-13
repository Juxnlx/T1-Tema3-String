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

	// Creamos el array tablaPalabraPista como char para almacenar las letras que ha
	// acertado el usuario.
	static char tablaPalabraPista[];

	// Creamos el Scanner para leer información solicitada por el usuario por
	// consola.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//Creamos la variable opcion como int para alamcenar la opción seleccioanda por el usuario en el menu.
		int opcion;
		
		//Creamos la variable letra como char para almacenar la letra que desea probar el usuario.
		char letra;
		
		// Llamamos a la función generaPalabra para generar la palabra a adivinar.
		generaPalabra();

		// Creamos el array tablaPalabraPista como char para almacenar las letras que ha
		// acertado el usuario.
		tablaPalabraPista = new char[palabraSecreta.length()];

		// Usamos el metodo fill para inicializar todas las posiciones del array a guión
		// bajo.
		Arrays.fill(tablaPalabraPista, '_');

		// Llamamos a la función pintaPista para imprimir los huecos de cada palabra.
		pintaPista();
		
		do {
			opcion = menu();
			
			if (opcion == 1) {
				System.out.print("Introduce una letra: ");
				letra = sc.next().charAt(0);
			}
		} while 

	}

	/**
	 * Esta función se encarga en almacenar el la variable palabraSecreta una de las
	 * palabras que se encuentra en el array palabras.
	 */
	public static void generaPalabra() {

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
	 * Esta función se encarga de comprobar si la letra pasada como parametro
	 * aparece en la palabra secreta, si es así actualiza la palabraPista con la
	 * letra. En caso contrario añade la letra a la variable noAcertadas.
	 * 
	 * @param letra La letra introducida por el usuario que hay que comprobar.
	 */
	public static void compruebaLetra(char letra) {

		if (!palabraSecreta.contains(String.valueOf(letra))) {
			noAcertadas += letra + ", ";
		} else {

			for (int i = 0; i < palabraSecreta.length(); i++) {

				if (letra == palabraSecreta.charAt(i)) {
					tablaPalabraPista[i] = letra;
				}
			}
		}
	}

	/**
	 * Esta función se encarga de comprobar que la palabra introducida por parametro
	 * sea igual a la palabraSecreta.
	 * 
	 * @param cadena Palabra introducida por el usuario, pasada por parametro.
	 */
	public static void compruebaPalabra(String cadena) {

		// Comprobamos si la cadena pasada como parametro es igual a la palabra secreta,
		// si se cumple actualizamos la palabra pista con la cadena pasada por
		// parametro.
		if (cadena.equals(palabraSecreta)) {
			palabraPista = cadena;
		}
	}

	/**
	 * Esta función se encarga de imprimir las pistas y las letras no acertadas por
	 * consola.
	 */
	public static void pintaPista() {

		// Almacenamos en palabra pista la tablaPalabraPista en forma de cadena con un
		// valueOf.
		palabraPista = String.valueOf(tablaPalabraPista);

		// Imprimimos letras no acertadas y pistas.
		System.out.println("Letras no acertadas: " + noAcertadas);
		System.out.println("Pista --> " + palabraPista);
	}
}
