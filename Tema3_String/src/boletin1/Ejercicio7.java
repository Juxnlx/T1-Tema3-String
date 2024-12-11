package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita una frase y una palabra, y una función se encarga de
 * devolver cuantas veces aparece esa palabra en la frase.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable frase como String para almacenar la frase introducida por
		// el usuario.
		String frase = "";

		// Creamos la variable palabra como String para almacenar la palabra introducida
		// por el usuario y la vamos a buscar en la frase.
		String palabra = "";

		// Creamos la variable contCadena como int para alamcenar las veces que se
		// repite la palabra en la frase.
		int contCadena;

		// Creamos el Scanner para solicitar la frase y la palabra por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Le pedimos al usuario que introduzca una palabra y la leemos.
		System.out.println("Introduce la palabra a buscar --> ");
		palabra = sc.nextLine();

		// Asignamos a la variable contCadena la función contPalabra que sera las que
		// nos devuelva dicha cantidad de repeticiones de la palabra.
		contCadena = contPalabra(frase, palabra);
		
		//Imprimimos la cantidad de veces que aparace la palabra.
		System.out.println("La palabra aparece --> " + contCadena + " veces.");

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de recibir una frase y una palabra como parametro y
	 * de devolver las veces que aparece esa palabra en la frase.
	 * 
	 * @param frase   La frase introducida por el usuario.
	 * @param palabra La palabra que queremos buscar en la frase.
	 * @return Las veces que aparece la palabra en la frse.
	 */
	public static int contPalabra(String frase, String palabra) {

		// Creamos la variable cont como int para contabilizar las veces que aparece la
		// palabra.
		int cont = 0;

		// Creamos la variable indice como int para recorrer cada espacio de la frase.
		int indice = 0;

		// Creamos la variable pos para comprobar si el indexOf nos devuelve una
		// posición positiva o negativa.
		int pos = frase.indexOf(palabra, indice);

		// Comprobamos si la posicion es mayor o igual a 0, si es así significa que hay
		// esa palabra dentro de la frase.
		while (pos >= 0) {

			// El contador lo incrementamos en +1, porque el entrar en el while significa
			// que minimo hay una palabra.
			cont++;

			// EL indice despues de cada vuelta lo tenemos que actualizar ha la posición
			// donde se encuentra la palabra mas la longitud de la palabra para empezar a
			// buscar al final de la palabra.
			indice = pos + palabra.length();

			// Volvemos a comprobar con el indexOf si existe esa palabra en la frase a
			// partir de la encontrada anteriormente, si es así devuelve una posición
			// positiva si no una negativa.
			pos = frase.indexOf(palabra, indice);
		}

		// Devolvemos cont, que es el número de veces que se repite la palabra en la
		// frase.
		return cont;
	}

}
