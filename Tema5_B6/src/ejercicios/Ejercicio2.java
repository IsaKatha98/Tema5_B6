package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	// Hacemos una función que haga el máximo de la tabla.
	public static int maximo (int[] t) {

		// Creamos la variable maximo.
		int maximo=0;

		// Recorremos la tabla y clasificamos según el 
		for (int i = 0; i < t.length; i++) {

			//Hacemos un if en caso de que se encuentre con un valor máximo.
			if (t[i]>maximo) {
				
				maximo=t[i];
			}

		}

		return maximo;

	}

	public static void main(String[] args) {
		
		//Creamos un array y las variables necesarias.
		int[] tabla= {3,6,7,2,68,13,5};
		
		int max; //Variable donde guardamos el valor máximo de la tabla.
		
		//Invocamos la función.
		max=maximo(tabla);
		
		//Imprimimos el resultado.
		System.out.println("Dada la siguiente tabla: ");
		System.out.println(Arrays.toString(tabla));
		System.out.println("El valor máximo de la tabla es: "+max);

	}

}
