package ejercicio6;

import java.util.Arrays;

public class Funciones {

	// Hacemos una función que busque que deseche los números superiores a valor
	// y rellene una tabla nueva.
	public static int[] eliminarMayores(int t[], int valor) {

		// Creamos una tabla nueva y las variables necesarias.
		int[] tablaNueva = new int[t.length];

		int index = 0;

		// Hacemos una copia de t en tablaNueva.
		tablaNueva = Arrays.copyOf(t, t.length);

		// Hacemos un bucle que recorra la tabla pero se pare en los números
		// correspondientes.

		while (index < tablaNueva.length) {

			if (tablaNueva[index] >= valor) {

				// Desplazamos los elementos a la derecha del elemento eliminado,
				// una posición a la izquierda.
				System.arraycopy(tablaNueva, index + 1, tablaNueva, index, tablaNueva.length - index - 1);

				// Lo copiamos en la misma tabla, con una posición menos.
				tablaNueva = Arrays.copyOf(tablaNueva, tablaNueva.length - 1);

			} else {

				index++;
			}
		}
		return tablaNueva;

	}

}
