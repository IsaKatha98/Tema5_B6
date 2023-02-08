package ejercicio7;

public class Funciones {

	public static int [] buscarTodos (int[] t, int valor) {

	

		// Declaramos las variables pertinentes.
		int buscar;
		int indexBuscar = 0; // Variable donde guardamos la posición del valor que buscamos

		// En un bucle while, buscamos el valor "clave".
		while (indexBuscar < t.length && clave != t[indexBuscar]) {

			// Aumentamos en uno el bucle.
			indexBuscar++;

		}

		if (indexBuscar < t.length) {

			buscar = indexBuscar;

		} else {

			buscar = -1;

		}

		return buscar;

	}
	
}
