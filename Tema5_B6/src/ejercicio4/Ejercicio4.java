package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

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

			tabla[i] = (int) (Math.random() * 100);
		}

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));

		// Ahora preguntamos por el número a buscar.
		System.out.println("Indique el número del que quiere saber la posición: ");
		buscar = sc.nextInt();

		// Invocamos la función en la variable index.
		index = Funciones.buscar(tabla, buscar);

		// Ahora hacemos un if para que se imprima el resultado correcto.
		if (index != -1) {

			System.out.println("La posición de ese número es: " + (index + 1));

		} else {

			System.out.println(index);
		}

		// Cerramos el escáner.
	}

}
