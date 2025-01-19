package boletin1;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa solicita una frase por teclado al jugador 1 y una función se
 * debe de encargar de generar un anagrama para esa frase y el jugador 2 debe de
 * acertar la palabra correcta.
 */
public class EjercicioA15 {

	// Creamos el Scanner para solicitar la frase y la palabra por teclado.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos la variable jugador2 como String para almacenar la frase introducida
		// por el jugador 2.
		String jugador2 = "";

		// Creamos la variable fraseAnagrama como String para almacenar la frase
		// devuelta por la función transformarEnAnagrama.
		String fraseAnagrama = "";

		// Asignamos a la variable frase la frase devuelta por la función validar frase,
		// que en la introducida por el usuario pero comprobada para que no sea cadena
		// vacia.
		frase = validarFrase(frase);

		// Asignamos a la variable fraseAnagrama la frase devuelta por la función
		// transformarEnAnagrama.
		fraseAnagrama = transformarEnAnagrama(frase);

		// Comprobamos mediante un do-while si el anagrama generado por la función es
		// distinto a la opción introducida por el jugador 2, si es así, se le vuelve a
		// preguntar al jugador 2 de nuevo.
		do {
			// Imprimimos el anagrama de la frase.
			System.out.println();
			System.out.println("¿Que palabra será? --> " + fraseAnagrama);

			// Le pedimos al jugador 2 que intente adivinar que frase o palabra puede ser.
			System.out.println("Jugador 2 - Introduce una opción: ");
			jugador2 = sc.nextLine();

		} while (!frase.equals(jugador2));

		// Imprimimos un mensaje de felicitación si ha acertado el jugador 2 la frase.
		System.out.println("¡ENHORABUENA! Has acertado la frase del jugador 1.");

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de comprobar que la frase introducida por el usuario
	 * sea distinta a cadena vacia.
	 * 
	 * @param frase La frase introducida por el usuario.
	 * @return Devolvemos la frase introducida por el usuario.
	 */
	public static String validarFrase(String frase) {

		// Nos creamos la variable salir como boolean para comprobar cuando devemos de
		// volver a ejecutar el bucle o no.
		boolean salir = false;

		// Comprobamos si la variable salir es igual a true o false, para saber so hay
		// que volver a preguntar o no.
		do {
			try {
				// Le pedimos al usuario que introduzca una frase y la leemos.
				System.out.println("Introduce una frase --> ");
				frase = sc.nextLine();
				// Comprobamos mediante el assert si la cadena es distinta a cadena vacia, si lo
				// es se ejecuta el salir igual a false y no se vuelve a preguntar.
				assert (!frase.equals("")) : "La cadena introducida no puede estar vacia";
				salir = false;
				// En caso de que fuese cadena vacia, saltaria la excepción se mostraría un
				// mensaje de error y se volveria a ejecutar el bucle porque se pondria salir a
				// true.
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				salir = true;
			}

		} while (salir);

		// Devolvemos la frase introducida por el usuario.
		return frase;
	}

	/**
	 * Esta función se encarga de transformar la frase pasada como parametro y en
	 * convertirla en anagrama.
	 * 
	 * @param frase La frase introducida por el usuario.
	 * @return Devuelve la frase transformada en una anagrama.
	 */
	public static String transformarEnAnagrama(String frase) {

		// Creamos variable fraseAnagrama como String para alamcenar la palabra ya
		// transformada en anagrama.
		String fraseAnagrama = "";

		// Declaramos el array tablaFrase como char para almacenar cada caracter de la
		// frase en una posición del array.
		char[] tablaFrase;

		// Con el metodo toCharArray relleno la tabla con cada caracter de la frase.
		tablaFrase = frase.toCharArray();

		// Creamos la variable pos como int para almacenar el caracter que estamos
		// recorriendo con el for.
		int pos;

		// Creamos la variable caracterR como char para guardar el caracter que estamos
		// recorriendo con el for.
		char caracterR;

		// Creamos la clase Random para generar posiciones aleatorias donde colocar los
		// nuevos caracteres.
		Random rand = new Random();

		// Recorremos el array tablaFrase.
		for (int i = 0; i < tablaFrase.length; i++) {
			// Generamos una posición aleatoria entre 0 y la longitud de la tabla y la
			// almacenamos en la variable pos.
			pos = rand.nextInt(0, tablaFrase.length);

			// Comprobamos que el indice que estamos recorriendo sea distinto a la posición
			// aleatoria y tanto el caracter de la posición aleatoria y el que estamos
			// recorriendo sea distinto a un espacio en blanco. Porque así evitamos que los
			// espacios se muevan de sitio.
			if (i != pos && tablaFrase[i] != ' ' && tablaFrase[pos] != ' ') {
				// En la variable caracterR almacenamos el caracter que estamos recorriendo.
				caracterR = tablaFrase[i];

				// En la posición que estamos recorriendo machamos el caracter por el caracter
				// de la posición generada.
				tablaFrase[i] = tablaFrase[pos];

				// En la posición generada alaatoriamente almacenamos el caracter que estabamos
				// recorriendo.
				tablaFrase[pos] = caracterR;
			}
		}

		// En la variable fraseAnagrama utilizamos el metodo valueOf para transformar en
		// cadena el array tablaFrase.
		fraseAnagrama = String.valueOf(tablaFrase);

		// Devolvemos la frase ya transformada.
		return fraseAnagrama;
	}

}
