package boletin1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita al usuario una palabra y un número por el cual se
 * guardaran tantas letras en cada posición del array, esto lo realiza una
 * función y el main lo muestra.
 */
public class EjercicioA20 {

	public static void main(String[] args) {

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario.
		String palabra = "";

		// Creamos la variable secuencia como int para almacenar la secuencia de letras,
		// este valor será introducido por el usuario.
		int secuencia;

		// Declaramos el array tablaPalabra como String para almacenar el array devuelto
		// por la función secuenciaPalabra.
		String[] tablaPalabra;

		// Creamos el Scanner para leer la palabra y la secuencia introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la palabra y la leemos.
		System.out.print("Introduce una palabra: ");
		palabra = sc.nextLine();

		// Le pedimos al usuario que introduzca la secuencia a llevar a cabo y la
		// leemos.
		System.out.print("Introduce la secuencia: ");
		secuencia = sc.nextInt();

		// Asignamos a nuestro array tablaPalabra la tabla devuelta por la función
		// secuenciaPalabra, haciendo un llamamiento a ella.
		tablaPalabra = secuenciaPalabra(palabra, secuencia);

		// Imprimos el array almacenado donde se encuentra la palabra estructurada por
		// la secuencia asignada.
		System.out.println();
		System.out.println("Palabra secuenciada: " + Arrays.toString(tablaPalabra));

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función se encarga de dividir una palabra en una secuencia concreta y
	 * cada secuencia la almacena en una posición de un array.
	 * 
	 * @param palabra   La palabra pasada como parametro.
	 * @param secuencia La secuencia por la que estructurar la palabra.
	 * @return Devolvemos el array donde se encuentra cada secuencia de la palabra
	 *         en una posición concreta.
	 */
	public static String[] secuenciaPalabra(String palabra, int secuencia) {

		// Declaramos el array tablaPalabra como String para almacenar en cada posición
		// ciertas secuencias de letras de la palabra pasada como parametro.
		String tablaPalabra[];

		// Creamos la variable dimensionTabla como int para almacenar el tamaño que
		// tendra nuestro array.
		int dimensionTabla;

		// Creamos la variable longPalabra como int para almacenar la longitud de la
		// palabra y que el ternario quede mas claro y mas pequeño.
		int longPalabra;

		// Creamos la variable pos para almacenar la posición de inicio desde donde
		// debemos de coger extraer la cadena para cada posición.
		int pos = 0;

		// A la variable longPalabra le asignamos la longitud de la palabra.
		longPalabra = palabra.length();

		// En la variable dimensionTabla realizamos un ternario para saber cual sera el
		// tamaño de nuestro array, si la longitud de la palabra entre el modulo de la
		// secuencia da de resto 0, entonces el tamaño del array sera el cociente de esa
		// dimensión, pero en caso de no ser par la longitud del array seria ese
		// cociente de la división mas 1 para almacenar esas letras de la palabra que
		// sobran y no completan una secuencia.
		dimensionTabla = (longPalabra % secuencia) == 0 ? longPalabra / secuencia : (longPalabra / secuencia) + 1;

		// Creamos la tabla con la dimension ya calculada en la variable dimensionTabla.
		tablaPalabra = new String[dimensionTabla];

		// Con este for recorremos el array donde almacenaremos la secuencia de letras
		// de la palabra.
		for (int i = 0; i < tablaPalabra.length; i++) {

			// Comprobamos si la posición mas la secuencia (el fin) es menor que la longitud
			// de la palabra. Si es así significa que existen letras suficientes para
			// rellenar una posición completa.
			if (pos + secuencia < longPalabra) {

				// En la posición en la que estamos del array hacemos una copia de la palabra
				// desde la posición hasta la posición mas la secuencia que hay que coger.
				tablaPalabra[i] = palabra.substring(pos, pos + secuencia);

				// La posición la actualizamos para que en la proxima vuelta, empieze donde a
				// acabado la anterior en pos + secuencia.
				pos += secuencia;

				// Con el else comprobamos que la pos + secuencia no sea mayor que la longitud
				// de la palabra. Eso significa que nos encontramos en la ultima posición y que
				// no la vamos a rellenar con la secuencia introducida si no con las que sobre
				// que seran menos.
			} else {

				// En la posición final de array hacemos una copia de la palabra desde la ultima
				// posición hasta la longitud de la palabra y así rellenamos la ultima posición
				// con los caracteres restantes.
				tablaPalabra[i] = palabra.substring(pos, longPalabra);
			}

		}

		// Devolvemos el array con la palabra repartida en el con las pertinentes
		// secuencias.
		return tablaPalabra;
	}

}
