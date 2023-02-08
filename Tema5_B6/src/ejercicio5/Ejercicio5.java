package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		int longitud;
		int buscar;
		int index;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos la usuario por el tamaño de la tabla y por el fin.
		System.out.println("Indique el tamaño de la tabla: ");
		longitud = sc.nextInt();

		// Creamos una tabla del tamaño introducido rellenada de forma aleatoria.
		int[] tabla = new int[longitud];

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10);
		}

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));

	}

}
