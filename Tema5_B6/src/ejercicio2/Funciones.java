package ejercicio2;

public class Funciones {

	// Hacemos una función que haga el máximo de la tabla.
	public static int maximo(int[] t) {

		// Creamos la variable maximo.
		int maximo = 0;

		// Recorremos la tabla y clasificamos según el
		for (int i = 0; i < t.length; i++) {

			// Hacemos un if en caso de que se encuentre con un valor máximo.
			if (t[i] > maximo) {

				maximo = t[i];
			}

		}

		return maximo;

	}

}
