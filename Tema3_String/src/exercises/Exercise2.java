package exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		// Creamos la variable mensaje para almacenar la frase introducida por el
		// usuario.
		String mensaje = "";

		// Creamos la variable mensajeCifr para almacenar el mensaje ya cifrado.
		String mensajeCifr = "";

		// Creamos la variable letra para almacenar la letra que vayamos recorriendo del
		// mensaje del usuario.
		char letra;

		// Creamos la variable nuevaLetra para almacenar la letra cifrada de la
		// correspondiente a la letra del mensaje del usuario.
		char nuevaLetra;

		// Creamos la variable salto para almacenar los saltos que desea el usuario que
		// haiga en el cifrado del mensaje.
		int salto = 0;

		// Creamos el Scanner para leer el mensaje y el número de saltos introducidos
		// por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el mensaje y lo leemos.
		System.out.println("Introduce el mensaje que quieres cifrar: ");
		mensaje = sc.nextLine().toUpperCase();

		// Le pedimos al usuario que introduzca un número de saltos y los leemos.
		System.out.println("Introduce un número de saltos: ");
		salto = sc.nextInt();

		// Recorremos el mensje
		for (int i = 0; i < mensaje.length(); i++) {
			// En la variable letra almacenamos la letra que estamos recorriendo.
			letra = mensaje.charAt(i);
			// En nuevaLetra almacenamos la letra.
			nuevaLetra = letra;

			// Comprobamos si la letra se encuentra el enntre 'A' y 'Z'.
			if ((letra >= 'A' && letra <= 'Z')) {
				// Obtemos un valor entre 0 y 25. Tambien le añadimos el valor de 'A'.
				nuevaLetra = (char) (((letra - 'A' + salto + 26) % 26) + 'A');

				// Comprobamos si el valor que entramos recorriendo es un numero que seenceuntra
				// entre 0 y 9.
			} else if (letra >= '0' && letra <= '9') {
				// Obtemos un valor entre 0 y 9. Tambien le añadimos el valor de '0'.
				nuevaLetra = (char) (((letra - '0' + salto + 10) % 10) + '0');
			}
			// En la variable mensajeCifr vamos concatenando la nueva letra o número
			mensajeCifr += nuevaLetra;

		}

		// Imprimimos el mensaje ya cifrado.
		System.out.println("Mensaje cifrado: " + mensajeCifr);

		// Cierre de Scanner
		sc.close();

		/*
		 * // Creamos la variable String alfabeto para almacenar todas las letras del //
		 * alfabeto. String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 * 
		 * // Creamos la variable numeros para almacenar todas los números de solo una
		 * // cifra. String numeros = "0123456789";
		 * 
		 * // Creamos la variable mensaje para almacenar la frase introducida por el //
		 * usuario. String mensaje = "";
		 * 
		 * // Creamos la variable mensajeCifr para almacenar el mensaje ya cifrado.
		 * String mensajeCifr = "";
		 * 
		 * // Creamos la variable letra para almacenar la letra que vayamos recorriendo
		 * del // mensaje del usuario. char letra;
		 * 
		 * // Creamos la variable nuevaLetra para almacenar la letra cifrada de la //
		 * correspondiente a la letra del mensaje del usuario. char nuevaLetra;
		 * 
		 * // Creamos la variable salto para almacenar los saltos que desea el usuario
		 * que // haiga en el cifrado del mensaje. int salto = 0;
		 * 
		 * // Creamos la variable posLetra para almacenar la posición donde se encuentra
		 * la // letra en el array. int posLetra;
		 * 
		 * // Creamos la variable posNum para almacenar la posición donde se encuentra
		 * el // número en el array int posNum;
		 * 
		 * // Creamos el Scanner para leer el mensaje y el número de saltos introducidos
		 * // por el usuario. Scanner sc = new Scanner(System.in);
		 * 
		 * // Le pedimos al usuario que introduzca el mensaje y lo leemos.
		 * System.out.println("Introduce el mensaje que quieres cifrar: "); mensaje =
		 * sc.nextLine().toUpperCase();
		 * 
		 * // Le pedimos al usuario que introduzca un número de saltos y los leemos.
		 * System.out.println("Introduce un número de saltos: "); salto = sc.nextInt();
		 * 
		 * // Creamos un for para recorrer el mensaje introducido por el usuario. for
		 * (int i = 0; i < mensaje.length(); i++) { // En la variable letra almacenamos
		 * la letra que estamos recorriendo. letra = mensaje.charAt(i); // En nuevaLetra
		 * almacenamos la letra. nuevaLetra = letra;
		 * 
		 * // En posLetra almacenamos la posición en la que corresponde la letra el el
		 * // abecedario. posLetra = alfabeto.indexOf(letra); // En la posNum
		 * almacenamos la posición a la que corresponde la letra en el // mensaje del
		 * usuario. posNum = mensaje.indexOf(letra);
		 * 
		 * // Comprobamos si la posLetra es mayor o igual a 0, eso significa que estamos
		 * // recorriendo una letra y no un número. if (posLetra >= 0) { // La posLetra
		 * de la nueva letra se calcula de la siguiente forma mediante // modulos.
		 * posLetra = (posLetra + salto + 26) % alfabeto.length(); // La nuevaLetra se
		 * calcula haciendo el charAt de la posición recien calcualda nuevaLetra =
		 * alfabeto.charAt(posLetra); } else if (posNum >= 0) { // El posNum del nuevo
		 * número se calcula de la siguiente forma mediante un // modulo. posNum =
		 * (posNum + salto + 26) % numeros.length(); // La nuevaLetra se calcula
		 * haciendo el charAt de la posición recien calcualda nuevaLetra =
		 * numeros.charAt(posNum); }
		 * 
		 * //En la variable mensajeCifr vamos concatenando la nueva letra o número
		 * mensajeCifr += nuevaLetra; }
		 * 
		 * //Imprimimos el mensaje ya cifrado. System.out.println("Mensaje cifrado: " +
		 * mensajeCifr);
		 * 
		 * //Cierre de Scanner sc.close();
		 */

		/*
		 * String frase = "";
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Introduce la frase a codificar --> "); frase =
		 * sc.nextLine().toUpperCase();
		 * 
		 * System.out.println("Introduce la distancia: "); int distancia = sc.nextInt();
		 * 
		 * char[] tablaFrase;
		 * 
		 * tablaFrase = frase.toCharArray();
		 * 
		 * char nuevoCaracter;
		 * 
		 * for (int i = 0; i < tablaFrase.length; i++) { nuevoCaracter = (char)
		 * (tablaFrase[i] + distancia);
		 * 
		 * if ((tablaFrase[i] >= 'A' && tablaFrase[i] <= 'Z') || (tablaFrase[i] >= '0'
		 * && tablaFrase[i] <= '9') || (tablaFrase[i] == ' ')) { if (nuevoCaracter >
		 * 'Z') { tablaFrase[i] = (char) ('A' + (nuevoCaracter - tablaFrase[i])); } else
		 * if (nuevoCaracter > '9' && nuevoCaracter < 'A') { tablaFrase[i] = (char) ('0'
		 * + (nuevoCaracter - tablaFrase[i])); } else if (tablaFrase[i] == ' ') {
		 * tablaFrase[i] = ' '; } else { tablaFrase[i] = nuevoCaracter; }
		 * 
		 * } } System.out.println("Frase codificada: " +
		 * String.copyValueOf(tablaFrase));
		 * 
		 * // Cierre de Scanner sc.close();
		 */

	}
}
