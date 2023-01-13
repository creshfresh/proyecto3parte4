/*Hacer un programa para que pida una palabra de no más de 20 caracteres y efectúe todas
las rotaciones posibles de dicha palabra de forma que el último carácter pase al primero y
los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :
HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones.*/
package strings;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String frase;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dime una frase");
			frase = teclado.nextLine();
		} while (frase.length() > 20 || frase.length() == 0);

		for (int i = 0; i < frase.length(); i++) {
			frase = frase.substring(1) + frase.charAt(0);
			System.out.println(frase);

		}

	}

}
