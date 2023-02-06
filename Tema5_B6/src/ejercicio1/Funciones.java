package ejercicio1;

public class Funciones {

	// Hacemos una función que sume los valores de la tabla.
	public static int sumaTabla(int[] tabla) {

		// Creamos la variable sumaTabla.
		int sumaTabla = 0;

		// Recorremos la tabla y vamos sumando los valores.
		for (int i = 0; i < tabla.length; i++) {

			// Vamos sumando los valores.
			sumaTabla += tabla[i];

		}

		return sumaTabla;

	}

}
