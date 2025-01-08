package exercises;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		String frase = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la frase a codificar --> ");
		frase = sc.nextLine().toUpperCase();

		char[] tablaFrase;

		tablaFrase = frase.toCharArray();

		for (int i = 0; i < tablaFrase.length; i++) {
			if ((tablaFrase[i] >= 'A' && tablaFrase[i] <= 'Z') || (tablaFrase[i] >= '0' && tablaFrase[i] <= '9')) { 

				if (tablaFrase[i] == 'Z') {
					tablaFrase[i] = 'A';
				} else if (tablaFrase[i] == '9') {
					tablaFrase[i] = '0';
				} else {
					tablaFrase[i] = (char) (tablaFrase[i] + 1);
				}
			}
		}

		System.out.println("Frase codificada: " + String.copyValueOf(tablaFrase));

		// Cierre de Scanner
		sc.close();
	}

}
