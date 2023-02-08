package ejercicio5;

import java.util.Arrays;

public class Funciones {

	// Hacemos una función que busque que deseche los números repetidos
	//y rellene una tabla nueva.
	public static int[] sinRepetidos(int t[]) {
		
		//declaramos un array de tamaño t, que será la tabla a devolver.
		int[] tablaNueva= new int [t.length];
		
		//Primero tenemos que copiar t, para no modificarla.
		tablaNueva= Arrays.copyOf(t, t.length);
		
		//Ahora, debemos recorrerla y eliminar los números que se repitan.
		
		
		//Devolvemos la tabla.
		return tablaNueva;
		

	}

}
