package boletin1;

import java.util.Scanner;

/**
 * Este programa lee dos cadenas introducidas por el usurio e indica cual de
 * ellas es mas corta, es decir tiene menos caracteres.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable cad1 como String para almacenar la primera cadena
		// introducida por el usuario.
		String cad1 = "";

		// Creamos la variable cad1 como String para almacenar la primera cadena
		// introducida por el usuario.
		String cad2 = "";

		// Creamos el Scanner para leer las dos cadenas introducidas por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la primera cadena y la leemos.
		System.out.println("Introduce la primera cadena --> ");
		cad1 = sc.nextLine();

		// Le pedimos al usuario que introduzca la segunda cadena y la leemos.
		System.out.println("Introduce la segunda cadena --> ");
		cad2 = sc.nextLine();
		
		//Mostramos un mensaje de lo que vamos a mostrar.
		System.out.println();
		System.out.println("¿Que frase será mayor?");

		// Comprobamos mediante un if si la longitud de la primera cadena es mayor que
		// la longitud de la cadena 2.
		if (cad1.length() > cad2.length()) {
			System.out.println("La primera cadena es mayor que la segunda cadena.");

			// Comprobamos mediante un else-if si la longitud de la segunda cadena es mayor
			// que la longitud de la cadena 1.
		} else if (cad2.length() > cad1.length()) {
			System.out.println("La segunda cadena es mayor que la primera cadena.");
			
			//Si no, es empate.
		} else {
			System.out.println("Las dos cadenas son iguales");
		}
		
		//Cierre de Scanner
		sc.close();
	}

}
