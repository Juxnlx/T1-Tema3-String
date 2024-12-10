package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una frase y una función se debe de encargar
 * de devolver en el main cuantos espacios en blanco contiene.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable frase como String para almacenar una frase introducida
		// por el usuario.
		String frase = "";

		// Creamos la variable contEspacios como int para almacenar la cantidad de
		// espacios que tiene la frase introducida por el usuario.
		int contEspacios;

		// Creamos el Scanner para leer la frase por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la frase que desea y la leemos por
		// teclado.
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();

		// Le asignamos a la variable contEspacios la llamada a la función
		// cuentaEspacios, que será la que devolverá la cantidad de espacios.
		contEspacios = cuentaEspacios(frase);

		// Imprimimos el número de espacios.
		System.out.println("¿Cuantos espacios tiene la frase introducida? --> " + contEspacios);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de contar los espacios en blanco que contiene la
	 * frase introducida por el usuario.
	 * 
	 * @param cadena La frase introducida por el usuario.
	 * @return Los números de espacios en blanco que contiene la frase introducida
	 *         por el usuario.
	 */
	public static int cuentaEspacios(String cadena) {
		// Creamos la variable numEspacios para almacenar el número de espacios de la
		// frase pasada como parametro.
		int numEspacios = 0;

		// Con este for recorremos cada caracter de la frase introducida por el usuario.
		for (int i = 0; i < cadena.length(); i++) {
			// Vamos comprobando caracter a caracter si es igual a un espacio en blanco, si
			// es así incrementamos numEspacios en +1. 
			if (cadena.charAt(i) == ' ') {
				numEspacios++;
			}
		}

		//Devolvemos el contador de espacios en blanco.
		return numEspacios;
	}
}
