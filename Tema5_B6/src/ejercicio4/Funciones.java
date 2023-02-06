package ejercicio4;

public class Funciones {
	
	// Hacemos una función que busque un número clave.
	public static int buscar(int t[], int clave) {

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
