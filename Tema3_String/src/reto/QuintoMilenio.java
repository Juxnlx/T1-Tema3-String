package reto;

import java.util.Scanner;

public class QuintoMilenio {

	public static void main(String[] args) {

		// Creamos la varible frase como String para almacenar la cadena introducida por
		// el usuario.
		String frase = "";

		// Creamos la variable mensaje como String para almacenar el mensaje introducido
		// por el usuario y que debemos de buscar en la frase.
		String mensaje = "";

		// Creamos la variable reslt para almacenar el valor que nos devuelve la función
		// codigoOculto.
		boolean reslt;

		// Creamos el Scanner para leer la frase y el mensaje introducidos por el
		// usuario por consola.
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos.
		System.out.print("Introduce una frase: ");
		frase = reader.nextLine();

		// Le pedimos al usuario que introduzca el mensaje a buscar y lo leemos.
		System.out.print("Introduce el mensaje: ");
		mensaje = reader.nextLine();

	}

	public static boolean codigoOculto(String frase, String mensaje) {

		// Creamos la variable reslt como boolean para almacenar el resultado de si el
		// mensaje se encuentra encriptado en la frase.
		boolean reslt = false;

		// Devolvemos la variable reslt
		return reslt;
	}

}
