/*
 Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
debemos trabajar solo con mayúsculas.

 */
package strings;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		String frase;
		char temp;
		String frasecomparar="";
		int n_Frase=0;
		int n_Letras=0;
		int N_LetrasDistintas=0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Dame una frase");
			frase=teclado.nextLine();
			
		}  while (frase.length() > 60 || frase.length() == 0);
		
		frase=frase.toUpperCase();
		//n_Frase=frase.length();
			
		for (int i = 0; i < frase.length(); i++ ) {
			temp = frase.charAt(i);
			if (String.valueOf(temp).equals(frase)){
				n_Frase++;		
			}
						
		}
		System.out.println(n_Frase);
	}
		
			
	
	
}
