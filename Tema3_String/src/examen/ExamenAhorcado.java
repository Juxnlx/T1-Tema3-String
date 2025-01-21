package examen;

import java.util.Random;
import java.util.Scanner;

public class ExamenAhorcado {

	// variable global tabla donde guardamos las palabras aleatorias
	static String palabra[] = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "brazo",
			"familia" };
	// constante global número de intentos que tendrá el jugador
	static int NUMINTENTOS = 7;
//variable donde guardaremos la palabra a acertar
	static String palabraSecreta;
//variable global donde se almacenará la pista del juego
	static String palabraPista = "";
//variable global donde se amacenarán las letras usadas pero que no se encuentran en la palabra
	static String noAcertadas = "";
	// objeto escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable cadena
		String palabra = "";
		// variable letra
		char letra;
		// opción menú
		int opcion;
		// variable contador intentos
		int intentos = 0;

		// mensaje de inicio de juego
		System.out.println("Bienvenido al Juego del Ahorcado. Tienes 7 intentos para adivinar una palabra");
		System.out.println();

		// primero generamos la palabra a adivinar
		generaPalabra();

		// inicializamos pista
		iniPista();

		// imprimimos pista
		pintaPista();

		// mientras el jugador no haya acertado la pista y tenga intentos...
		while (!palabra.equals(palabraSecreta) && intentos < NUMINTENTOS) {

			do {
				// llamamos a la función menu y la guardamos en opción
				opcion = menu();

			} while (!(opcion >= 1 && opcion <= 2));

			// con un switch cogemos la opción y hacemos lo que muestra el menú
			switch (opcion) {

			case 1 -> {
				// do while para controlar que no repita una letra varias veces
				do {
					// pedimos la letra al usuario que buscaremos en la palabraSecreta
					System.out.println("Introduce la letra a buscar");
					// guardamos letra con next y charAt a 0 para quedarnos con el carácter en la
					// posición 0
					letra = sc.next().charAt(0);
					// en el while hacemos un indexOf buscando la letra introducida en la cadena
					// noAcertadas. Así evitamos repeticiones de letras
				} while (noAcertadas.indexOf(letra) >= 0);
				// llamamos a la función comprueba letra
				compruebaLetra(letra);

			}
			case 2 -> {
				// pedimos palabra al usuario y la compararemos con la palabraSecreta
				System.out.println("Introduce la palabra");
				// guardamos palabra
				palabra = sc.next();
				// llamamos a la función compruebaPalabra
				compruebaPalabra(palabra);

			}

			}
			// volvemos a imprimir pista
			pintaPista();

			// incrementamos intentos
			intentos++;
			// imprimimos número de intentos restantes
			System.out.println("Número de intentos restantes: " + (NUMINTENTOS - intentos));
			System.out.println();

		}
		// cuando sale del while se comprueba si el jugador ha acertado la palabra o con
		// letras ha conseguido acertarla comparando palabraPista y palabraSecreta
		if (palabraPista.equals(palabraSecreta)) {
			// mensaje de enhorabuena
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");

			// en caso contrario significará que se le han acabado los intentos
		} else {
			// mensaje de fin de juego
			System.out.println("GAME OVER");

		}
		// cerramos escaner
		sc.close();
	}

//almacena en palabraSecreta una palabra aleatoria de la tabla palabra
	static void generaPalabra() {
		// objeto random
		Random rand = new Random();

		// asignamos palabra aleatoria
		palabraSecreta = palabra[rand.nextInt(0, palabra.length)];
	}

//menú del juego
	static int menu() {
		// variable opción
		int opcion;
		// do while para controlar el rango
		do {
			// menú
			System.out.println("Seleccione una de las siguientes opciones:");
			System.out.println("1. Introducir letra");
			System.out.println("2. Introducir palabra");
			// guardamos opción
			opcion = sc.nextInt();
			// mientras opción este fuera de rango seguirá pidiendola
		} while (opcion < 1 || opcion > 2);

		// devolvemos opción
		return opcion;

	}

	// comprueba si la letra está en palabra a acertar. Si está actualiza
	// palabraPista con las posciones acertadas. En caso contrario añade a no
	// acertadas
	static void compruebaLetra(char letra) {
		// variable posición
		int pos = palabraSecreta.indexOf(letra);

		// si la posición en menor que 0, es decir, que no encuentra la letra en la
		// cadena palabraSecreta...
		if (pos < 0) {
			// concantena la letra a la cadena vacía noAcertadas
			noAcertadas += letra;
			// en caso de que si la encuentre...
		} else {
			// do while para repetir para que cambie la cadena palabraPista mientras
			// encuentre la letra en la palabraSecreta
			do {

				// asignamos a palabra pista concatenando el substring de la cadena palabraPista
				// desde la posición 0 hasta la posición en la que ha encontrado la letra + la
				// letra+ la substring de la cadena palabraPista desde la posición +1 hasta el
				// final
				palabraPista = palabraPista.substring(0, pos) + letra
						+ palabraPista.substring(pos + 1, palabraPista.length());
				// si la encuentra encontrada será true

				// sino la encuentra

				// volvemos a inicializar posición esta vez a la posición actual +1
				pos = palabraSecreta.indexOf(letra, pos + 1);
				// cuando no encunetre la letra en la palabraSecreta saldrá del bucle
			} while (pos >= 0);
		}
	}

	// función que inicializa palabraPista
	static void iniPista() {
		// recorremos palabraSecreta
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// y concatenamos tantos guiones como longitud tenga la palabra
			palabraPista += '-';
		}

	}

	// función que comprueba si la cadena introducida es la misma que la palabra a
	// acertar y de ser así la guarda en palabraPista
	static void compruebaPalabra(String palabra) {
		// si la cadena introducida coincide con la palabra a acertar
		if (palabra.equals(palabraSecreta)) {
			// guardamos en palabraPista la cadena
			palabraPista = palabra;
		} else {
			// si no acierta mensaje de fallo
			System.out.println("Has fallado la palabra");
		}
	}

	// función que pinta las letras no acertadas y el contenido de la palabra pista
	static void pintaPista() {

		// recorremos la cadena noAcertadas e imprimimos en horizontal
		for (int i = 0; i < noAcertadas.length(); i++) {
			System.out.print("Letras ausentes en la palabra: ");
			// imprimimos las letras no acertadas
			System.out.print(noAcertadas.charAt(i) + " ");
		}
		System.out.println();
		// imprimimos palabraPista
		System.out.println("Pista: " + palabraPista);
		System.out.println();
	}

}
