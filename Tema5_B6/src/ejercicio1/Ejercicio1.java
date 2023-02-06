package ejercicio1;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un array y las variables necesarias.
		int[] tabla = { 1, 2, 3, 4, 5 };

		int totalValores; // Variable donde guardamos la suma de los valores de la tabla.

		// Invocamos la función.
		totalValores = Funciones.sumaTabla(tabla);

		// Imprimimos el resultado.
		System.out.println("Dada la siguiente tabla: ");
		System.out.println(Arrays.toString(tabla));
		System.out.println("La suma de los valores es: " + totalValores);
	}

}
