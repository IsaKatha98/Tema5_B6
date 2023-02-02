package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

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
		
		//Creamos una tabla del tamaño introducido rellenada de forma aleatoria.
		int [] tabla = new int[longitud];
		
		for (int i=0; i<tabla.length; i++) {
			
			tabla[i]=(int) Math.random()*100;
		}
		
		//Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));
		
		//Ahora preguntamos por el número a buscar.
		System.out.println("Indique el número del que quiere saber la posición: ");
		buscar=sc.nextInt();
		
		//Invocamos la función en la variable index.
		index=buscar(tabla, buscar);
		
		//Ahora hacemos un if para que se imprima el resultado correcto.
		if (index!=-1) {
			
			System.out.println("La posición de ese número es: "+index);
		
		} else {
			
			System.out.println(index);
		}
		
		//Cerramos el escáner.
	}

}
