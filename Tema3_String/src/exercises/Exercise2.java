package exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		String frase = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la frase a codificar --> ");
		frase = sc.nextLine().toUpperCase();

		System.out.println("Introduce la distancia: ");
		int distancia = sc.nextInt();

		char[] tablaFrase;

		tablaFrase = frase.toCharArray();

		char nuevoCaracter;

		for (int i = 0; i < tablaFrase.length; i++) {
			nuevoCaracter = (char) (tablaFrase[i] + distancia);

			if ((tablaFrase[i] >= 'A' && tablaFrase[i] <= 'Z') || (tablaFrase[i] >= '0' && tablaFrase[i] <= '9') || (tablaFrase[i] == ' ')) {
				if (nuevoCaracter > 'Z') {
					tablaFrase[i] = (char) ('A' + (nuevoCaracter - tablaFrase[i]));
				} else if (nuevoCaracter > '9' && nuevoCaracter < 'A') {
					tablaFrase[i] = (char) ('0' + (nuevoCaracter - tablaFrase[i]));
				} else if (tablaFrase[i] == ' ') {
					tablaFrase[i] = ' ';
				} else {
					tablaFrase[i] = nuevoCaracter;
				}

			} 
		}
			System.out.println("Frase codificada: " + String.copyValueOf(tablaFrase));

			// Cierre de Scanner
			sc.close();
		

	}
}
