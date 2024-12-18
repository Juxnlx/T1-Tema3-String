package boletin1;

import java.util.Scanner;

/**
 * Este programa se encarga de crear una función que recibe una sentencia en C y
 * devuelva una cadena sin los comentarios. La sentencia se pedira desde el main
 * al usuario.
 */
public class EjercicioA17 {

	public static void main(String[] args) {
		// Creamos la variable sentencia como String para almacenar la frase introducida
		// por el usuario.
		String sentencia = "";

		// Creamos la variable cadena como String para almacenar la sentencia sin
		// comentarios proporcionada por al función transformarSentencia.
		String cadena = "";

		// Creamos el Scanner para solicitar la sentencia por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la sentencia y la leemos.
		System.out.println("Introduce la sentencia --> ");
		sentencia = sc.nextLine();

		// Asignamos a la variable cadena la cadena sin comentarios devuelta por la
		// función transformarSentencia.
		cadena = transformarSentencia(sentencia);

		// Imprimimos el resultado.
		System.out.println();
		System.out.println("Entrada: " + sentencia);
		System.out.println("Salida: " + cadena);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función recibe una sentencia por teclado y se encarga de quitarle todos
	 * los comentarios.
	 * 
	 * @param sentencia La sentecia pasada como parametro.
	 * @return La sentencia pero sin ningun tipo de comentario.
	 */
	public static String transformarSentencia(String sentencia) {

		// Creamos la variable comentario como String para almacenar los comentarios de
		// la sentencia.
		String comentario = "";

		// Creamos la variable inicio como int para almacenar la posición donde comienza
		// el comentario.
		int inicio = sentencia.indexOf("/*");

		// Creamos la variable fin como int para almacenar la posición donde termina
		// el comentario.
		int fin = sentencia.indexOf("*/");

		// Comprobamos que siempre que la posición del inicio de comentario y la de fin
		// sea mayor que 0, entonces ejecutamos las siguientes instrucciones porque eso
		// significa que hay un comentario en la sentencia.
		while (inicio >= 0 && fin >= 0) {

			// En comentario almacenamos el trozo de comentario que aparece en la sentencia
			// gracias a la posición inicio y fin. Indicamos al fin, fin+2 para que tambien
			// incluya */ porque si no lo excluye.
			comentario = sentencia.substring(inicio, fin + 2);

			// A sentencia le asignamos una el mismo contenido pero sin comentario gracias a
			// que con el metodo replace sustituimos el comentario por cadena vacia.
			sentencia = sentencia.replace(comentario, "");

			// En la variable inicio almacenamos la posición donde aparece el comentario que
			// siempre comienza así, /*.
			inicio = sentencia.indexOf("/*");

			// En la variable fin almacenamos la posición donde aparece el comentario que
			// siempre termina así, */.
			fin = sentencia.indexOf("*/");

		}

		// Y por ultimo ya que tenemos la sentencia sin comentarios con el metodo
		// replace sustituimos los dos espacios en blanco por uno y los espacios a los
		// lados los quitamos. Todo esto en el caso de que se de si no es así se
		// devuelve la cadena tal cual.
		sentencia = sentencia.replace("  ", " ").trim();

		// Devolvemos la sentencia sin comentarios.
		return sentencia;
	}

}
