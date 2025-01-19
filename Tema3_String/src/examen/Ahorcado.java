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
	static int NUMINTENTOS = 7;

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

		// Creamos la variable opcion como int para alamcenar la opción seleccioanda por
		// el usuario en el menu.
		int opcion;

		// Creamos la variable letra como char para almacenar la letra que desea probar
		// el usuario.
		char letra;

		// Creamos la variable erroresPrevios como int para almacenar los errores
		// previos, antes de llamar a la función compruebaLetra.
		int erroresPrevios;

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario.
		String palabra = "";

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

		// Comprobación de fin de juego.
		do {
			// Comprobación de si la opción del usuario es correcta.
			do {
				// Asignamos a la variable opcion, lo que nos devuelve la función menu.
				opcion = menu();
				// Comprobamos si la opción introducida por el usuario es distinta a menos 1 y
				// 2, si es así volvemos a preguntar.
			} while (opcion < 1 || opcion > 2);

			// Comprobamos si la opción es igual a 1.
			if (opcion == 1) {
				// Le pedimos al usuario que introduzca una letra y la leemos.
				System.out.print("Introduce una letra: ");
				letra = sc.next().toLowerCase().charAt(0);

				// Almacenamos en la variable erroresPrevios la longitud de la variable
				// noAcertadas.
				erroresPrevios = noAcertadas.length();

				// Llamamos a la función compruebaLetra para comprobar si la existe en la
				// palabraPista, si es así se actualiza. Si no se añade a noAcertadas.
				compruebaLetra(letra);

				// Si el tamaño de noAcertadas ha cambiado, significa que la letra no estaba en
				// la palabra.
				if (noAcertadas.length() > erroresPrevios) {
					NUMINTENTOS--;
				}

				// Si no es 1 ...
			} else {
				// Le pedimos al usuario que introduzca una palabra y la leemos.
				System.out.print("Introduce una palabra: ");
				palabra = sc.next().toLowerCase();
				// Llamamos a la función compruebaPalabra para comprobar si hemos acertado la
				// palabra, si es así la variable palabraPista se actualiza con la palabra
				// secreta.
				compruebaPalabra(palabra);

				// Comprobamos si la palabra es distinta a la palabra que intentamos descubir.
				// Si es así incrementamos los números de intentos en -1.
				if (!palabra.equals(palabraSecreta)) {
					NUMINTENTOS--;
				}
			}

			// Llamamos a la función pintaPista para imprimir las letras no acertadas y la
			// pista.
			pintaPista();
			// Imprimimos el número de intentos que nos quedan.
			System.out.println("Intentos --> " + NUMINTENTOS);
			System.out.println();

			// Comprobamos si la palabra es distinta a la palabra que intentamos adivinar y
			// si los números de intentos son distintos de 0 volvemos a preguntar una
			// opción.
		} while (!palabra.equals(palabraSecreta) && NUMINTENTOS != 0);

		// Si los intentos son mayor que 0, mostramos un enhorabuena. Significa que
		// hemos acertado la palabra.
		if (NUMINTENTOS > 0) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
			// Si no, mostramos game over porque el número de intentos se ha agotado.
		} else {
			System.out.println("GAME OVER");
		}

		// Cierre de Scanner.
		sc.close();
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
		System.out.println();

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

		// Comprobamos si la letra pasada como parametro no aparece en la palabra
		// secreta y si en la variable noAcertadas aparece la letra, para en el caso de
		// que se vuelva a introducir no se vuelva a añadir otra vez.
		if (!palabraSecreta.contains(String.valueOf(letra)) && noAcertadas.indexOf(letra) < 0) {

			// Almacenamos en la variable noAcertadas la letra que no se encuentra en la
			// palabra secreta.
			noAcertadas += letra;
			
			//Si no
		} else {
			//Recorremos la palabra secreta. 
			for (int i = 0; i < palabraSecreta.length(); i++) {

				//Comprobamos si la letra es igual a la letra que estamos recorriendo de la palabra secreta.
				if (letra == palabraSecreta.charAt(i)) {
					//Almacenamos en el aray tablaPalabraPista la letra.
					tablaPalabraPista[i] = letra;
				}
			}
		}

		// Almacenamos en palabra pista la tablaPalabraPista en forma de cadena con un
		// valueOf.
		palabraPista = String.valueOf(tablaPalabraPista);
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

			// Actualizamos el array tablaPalabraPista con la palabra completa, para en el
			// caso de acertar mostrar la palabra completa.
			for (int i = 0; i < palabraSecreta.length(); i++) {
				tablaPalabraPista[i] = palabraSecreta.charAt(i);
			}
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
