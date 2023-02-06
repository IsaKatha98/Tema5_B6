package ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos un array y las variables necesarias.
		int[] tabla = { 3, 6, 7, 2, 68, 13, 5 };

		int max; // Variable donde guardamos el valor máximo de la tabla.

		// Invocamos la función.
		max = Funciones.maximo(tabla);

		// Imprimimos el resultado.
		System.out.println("Dada la siguiente tabla: ");
		System.out.println(Arrays.toString(tabla));
		System.out.println("El valor máximo de la tabla es: " + max);

	}

}
