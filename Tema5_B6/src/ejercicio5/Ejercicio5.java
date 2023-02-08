package ejercicio5;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {


		// Creamos una tabla del tamaño 10.
		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10+1);
		}

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));

		

			
	}

}
