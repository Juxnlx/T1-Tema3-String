package examen;

import java.util.Random;
import java.util.Scanner;

public class Criptograma {

	// Creamos el array bidimensional abecedario como char para almacenar todas las
	// letras del abecedario.
	static char abecedario[][] = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' } };

	// Creamos el array frases como String para almacenar las frases con la que
	// jugaremos y debemos de adivinar.
	static String frases[] = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };

	// Creamos la variable fraseReal como String para almacenar la frase con la que
	// vamos a jugar.
	static String fraseReal = "";

	// Creamos la variable fraseCodificada como String para almcenar la codificación
	// de la fraseReal.
	static String fraseCodificada = "";

	// Creamos el objeto Random a nivel de clase ya que lo usaremos en mas de una
	// función.
	static Random rand = new Random();

	public static void main(String[] args) {

		// Creamos la variable fraseIguales como boolean para almacenar el valor que nos
		// devuelve la función sonIguales.
		boolean fraseIguales = false;

		// Creamos la variable codigoAcertado como boolean para almacenar el valor qeu
		// nos devuelve la función compruebaCodigo.
		boolean codigoAcertado;

		// Creamos la variable codigo como String para almacenar el codigo introducido
		// por el usuario.
		String codigo = "";

		// Creamos la variable letra como char para almacenar la letra introducida por
		// el usuario.
		char letra;

		// Creamos el Scanner para leer por consola el código y la letra introducidos
		// por el usuario.
		Scanner sc = new Scanner(System.in);

		// Llamamos a la función desordenaAbecedario para desordenar todas las letras
		// del abecedario.
		desordenaAbecedario();

		// Llamamos a la función eligeFrase para asignar a la variable fraseReal una
		// frase de forma aleatoria del array frases.
		eligeFrase();

		// Llamamos a la función codificaFrase frase almacenar en la fraseCodicada toda
		// la codicación de la fraseReal.
		codificaFrase();
		
		while (!fraseIguales) {

			System.out.println(fraseCodificada);

			System.out.print("Introduce un codigo --> ");
			codigo = sc.nextLine();
			System.out.print("Introduce la letra correspondiente --> ");
			letra = sc.nextLine().charAt(0);

			// A la variable codigoAcertado le asignamos el valor que nos devuelve
			// compruebaCodigo.
			codigoAcertado = compruebaCodigo(codigo, letra);

			if (codigoAcertado) {
				System.out.println("¡Bien hecho! Has acertado");
			} else {
				System.out.println("¡Lo siento! Intentelo de nuevo");
			}

			fraseIguales = sonIguales();
		}

		System.out.println("¡ENHORABUENA JUGADOR! Has conseguido descodificar la frase");

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función se encarga de desordenar el array bidimensional abecedario, es
	 * decir cambiar cada letra de posición.
	 */
	public static void desordenaAbecedario() {

		// Creamos la variable posF como int para almacenar el número de la fila de
		// forma aleatoria.
		int posF;

		// Creamos la variable posC como int para almacenar el número de la columna de
		// forma aleatoria.
		int posC;

		// Creamos la variable caracter como char para almacenar el caracter que estamos
		// recorriendo es ese momento.
		char caracter;

		// Recorremos las filas de nuestro array abecedario.
		for (int i = 0; i < abecedario.length; i++) {

			// Recorremos las columnas de nuestro array abecedario.
			for (int j = 0; j < abecedario[i].length; j++) {

				// En la variable caracter almacenamos el caracter que estamos recorriendo.
				caracter = abecedario[i][j];
				// En la variable posF almacenamos el número de una fila de forma aleatoria,
				// nuestra array abecedario consta de 3 filas por ello generamos un número
				// aleatorio entre 0 y 3 excluido.
				posF = rand.nextInt(0, 3);
				// En la variable posC almacenamos el número de una columna de forma aleatoria,
				// nuestra array abecedario consta de 9 columnas por ello generamos un número
				// aleatorio entre 0 y 9 excluido.
				posC = rand.nextInt(0, 9);

				// En la posición que estamos recorriendo almacenamos el caracter que se
				// encuentra en las posiciones que hemos generado aleatoriamente.
				abecedario[i][j] = abecedario[posF][posC];

				// En la posición aleatoria almacenamos el caracter que estabamos recorriendo y
				// almacenamos en la variable caracter.
				abecedario[posF][posC] = caracter;

			}
		}
	}

	/**
	 * Esta función se encarga de seleccionar de forma aleatoria una frase del array
	 * frases y asignar esa frase a la variable fraseReal.
	 */
	public static void eligeFrase() {

		// Creamos la variable posFraseAleatoria como int para alamcenar una posición
		// aleatoria del array frases, para ello utilizamos el random entre 0 y la
		// longitud del array frases.
		int posFraseAleatoria = rand.nextInt(0, frases.length);

		// A la variable fraseReal le asignamos la variable posFraseAleatoria que
		// almacena un indice aleatorio del array de frases.
		fraseReal = frases[posFraseAleatoria];
	}

	/**
	 * Esta frase se encarga de codificar la variable fraseReal y almacenar la
	 * codificación en la variable fraseCodificada.
	 */
	public static void codificaFrase() {

		// Con este for recorremos cada letra de la frase
		for (int i = 0; i < fraseReal.length(); i++) {

			// Comprobamos si el valor que estamos recorriendo es un espacio, si es así,
			// concatenamos doble espacio en blanco a la variable fraseCodificada.
			if (fraseReal.charAt(i) == ' ') {
				fraseCodificada += "  ";
			}

			// Recorremos las filas de nuestro array abecedario.
			for (int j = 0; j < abecedario.length; j++) {
				// Recorremos las columnas de nuestro array abecedario.
				for (int k = 0; k < abecedario[j].length; k++) {

					// Comprobamos si las posiciones que estamos recorriendo del abecedario
					// corresponden con la letra de la frase que estamos recorriendo.
					if (abecedario[j][k] == fraseReal.charAt(i)) {

						// A fraseCodificada le concatenamos la posición de la fila j y la posición de
						// la columna k y un espacio en blanco.
						fraseCodificada += j + "" + k + " ";
					}
				}
			}
		}
	}

	/**
	 * Esta función se encarga de comprobar si el código y la letra pasados por
	 * parametro corresponde en el abecedario, si es así devuelve true en caso
	 * contario false.
	 * 
	 * @return acierto Devuelve true si corresponde codigo y letra. Devuelve false
	 *         si no corresponden codigo y letra.
	 */
	public static boolean compruebaCodigo(String codigo, char letra) {
		// Creamos la variable acierto como boolean para almacenar true o false
		// dependiendo de si el codigo corresponde con la letra.
		boolean acierto = false;

		// Comprobamos si la letra que corresponde al codigo pasado como parametro es
		// igual a la letra, si es así...
		if (abecedario[codigo.charAt(0) - 48][codigo.charAt(1) - 48] == letra) {
			// A fraseCodificada se le remplaza el código por la letra introducida por el
			// usuario.
			fraseCodificada = fraseCodificada.replace(codigo, String.valueOf(letra));

			// La variable acierto la ponemos a true.
			acierto = true;
		}

		// Devolvemos la variable acierto que nos devolvera true si corresponde la letra
		// y el código y false en caso contrario.
		return acierto;
	}

	/**
	 * Esta función se encarga de comprobar que la frase codifica sea igual que la
	 * frase real.
	 * 
	 * @return iguales Devuelve true si las frases son iguales. Devuelve false si
	 *         las frase son distintas.
	 */
	public static boolean sonIguales() {
		// Creamos la variable iguales como boolean para almacenar true o false
		// dependiendo de si frase real y la codificada coinciden.
		boolean iguales;

		// Creamos la variable copiaFraseCodificada como String para modicar al
		// fraseCodificada sin modificar la variable local.
		String copiaFraseCodificada = "";

		// A la variable copiaFraseCodificada le asignamos el mismo valor de frase
		// codicada.
		copiaFraseCodificada = fraseCodificada;

		// A la variable copiaFraseCodificada se le remplaza los simples espacios por
		// cadena vacia.
		copiaFraseCodificada = copiaFraseCodificada.replace(" ", "");

		// A la variable copiaFraseCodificada se le remplaza los dobles espacios por
		// solo uno.
		copiaFraseCodificada = copiaFraseCodificada.replace("  ", " ");

		// Con este ternario asignamos a la variable iguales true si la cadena
		// copiaFraseCodificada (igual que fraseCodificada, pero sin espacios entre
		// letra y palabras) es igual qeu la fraseReal. En caso contrario devolvemos
		// false.
		iguales = copiaFraseCodificada.equals(fraseReal) ? true : false;

		// Devolvemos la variable igual.
		return iguales;
	}
}
