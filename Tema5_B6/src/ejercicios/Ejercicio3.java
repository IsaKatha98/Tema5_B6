package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	// Hacemos una función que genero números aleatorios, los clasifique y los añada
	// a la tabla.
	public static int[] rellenaPares(int longitud, int fin) {

		// Creamos la tabla que luego vamos a devolver.
		int[] tabla = new int[longitud];
		final int MIN = 2;
		final int MAX = fin;

		int aux;// Variable auxiliar.

		// En un bucle for, generamos los números aleatorios correspondientes.
		for (int i = 0; i < tabla.length; i++) {

			// Hacemos un do-while en caso de que se encuentre con un valor par y lo guardamos en
			// la tabla.
			do{
				// Generamos los números aleatorios, siendo el min=2 y el max=fin
				aux = MIN + (int) (Math.random() *(MAX - MIN) + MIN);
				
				tabla[i]=aux;
			
			} while (aux%2!=0);
			
		}

		return tabla;

	}

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		int longitud;
		int fin;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos la usuario por el tamaño de la tabla y por el fin.
		System.out.println("Indique el tamaño de la tabla: ");
		longitud=sc.nextInt();
		System.out.println("Indique hasta que número debe tener la tabla: ");
		fin=sc.nextInt();
		
		//Creamos la tabla.
		int[] tabla= new int[longitud];
		
		//Invocamos la función y pasamos los parámetros correspondientes.
		tabla=rellenaPares(longitud, fin);
		
		//Imprimimos la tabla que resulta.
		System.out.println(Arrays.toString(tabla));
		
		//Cerramos el escáner.
		sc.close();

	}

}
