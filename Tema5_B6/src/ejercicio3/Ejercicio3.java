package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		int longitud;
		int fin;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos la usuario por el tamaño de la tabla y por el fin.
		System.out.println("Indique el tamaño de la tabla: ");
		longitud = sc.nextInt();
		System.out.println("Indique hasta que número debe tener la tabla: ");
		fin = sc.nextInt();

		// Creamos la tabla.
		int[] tabla = new int[longitud];

		// Invocamos la función y pasamos los parámetros correspondientes.
		tabla = Funciones.rellenaPares(longitud, fin);

		// Imprimimos la tabla que resulta.
		System.out.println(Arrays.toString(tabla));

		// Cerramos el escáner.
		sc.close();

	}

}
