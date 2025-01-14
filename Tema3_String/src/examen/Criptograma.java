package examen;

import java.util.Arrays;
import java.util.Random;

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
	String fraseCodificada = "";

	public static void main(String[] args) {

		desordenaAbecedario();
		
		System.out.println(Arrays.deepToString(abecedario));
	}
	
	static public void desordenaAbecedario() {
		
		int posF;
		
		int posC;
		
		char caracter;
		
		Random rand = new Random();
		
		for (int i = 0; i < abecedario.length; i++) {
			for (int j = 0; j < abecedario[i].length; j++) {
				
			caracter = abecedario[i][j];
			posF = rand.nextInt(0, 3);
			posC = rand.nextInt(0, 9);
			
			abecedario[i][j] = abecedario[posF][posC];
			
			abecedario[posF][posC] = caracter;
			
			}
		}
	}

}
