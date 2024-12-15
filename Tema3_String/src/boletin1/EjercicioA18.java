package boletin1;

import java.util.Scanner;

/**
 * Este programa solicita al usuario un titulo y un parrafo y una función se
 * encargará de transformar ese codigo en html.
 */
public class EjercicioA18 {

	public static void main(String[] args) {

		// Creamos la variable titulo como String para almacenar el titulo introducido
		// por el usuario.
		String titulo = "";

		// Creamos la variable contenido como String para almacenar el parrafo
		// introducido por el usuario.
		String contenido = "";

		// Creamos la variable paginaWeb como String para almacenar nuestro codigo HTML
		// devuelto por la función convertirEnHTML.
		String paginaWeb = "";

		// Creamos el Scanner para leer el titulo y el contenido introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el titulo y lo leemos.
		System.out.println("Introduce el título de tu página web: ");
		titulo = sc.nextLine();

		// Le pedimos al usuario que introduzca el contenido y lo leemos.
		System.out.println("Introduce el contenido de tu página web: ");
		contenido = sc.nextLine();

		// Asignamos a la variable paginaWeb la cadena devuelta por la función
		// convertirEnHTML.
		paginaWeb = convertirEnHTML(titulo, contenido);

		// Imprimimos la página web
		System.out.println("\nCódigo HTML --> \n");
		System.out.println(paginaWeb);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de añadir el código y el contenido en formato html.
	 * 
	 * @param titulo  El titulo introducido por el usuario.
	 * @param parrafo EL parrafo introducido por el usuario.
	 * @return El codigo pasado como parametro pero en formato html.
	 */
	public static String convertirEnHTML(String titulo, String parrafo) {

		// Creamos al variable codigoHTML como String para almacenar todo el código de
		// nuestra página web.
		String codigoHTML = "";

		// Vamos concatenando todo el codigo a devolver con el titulo y el contenido
		// pasado como parametro.
		codigoHTML += "<html> \n";
		codigoHTML += "   <head> \n";
		codigoHTML += "      <title>" + titulo + "</title> \n";
		codigoHTML += "   </head> \n";
		codigoHTML += "   <body> \n";
		codigoHTML += "      <h1>" + titulo + "</h1> \n";
		codigoHTML += "      <br/> \n";
		codigoHTML += "      <p> \n";
		codigoHTML += "      " + parrafo + "\n";
		codigoHTML += "      </p> \n";
		codigoHTML += "   </body> \n";
		codigoHTML += "</html>";

		//Devolvemos el codigo en html.
		return codigoHTML;
	}

}
