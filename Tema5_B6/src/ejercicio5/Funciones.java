package ejercicio5;

import java.util.Arrays;

public class Funciones {
	
	public static int[] sinRepetidos (int t[]) {
		
		//Hacemos un array con el tamaño de t.
		int[] tablaNueva= new int[ t.length];
		
		//Hacemos una copia de la tabla t en tablaNueva, para no modificarla.
		tablaNueva= Arrays.copyOf(t, t.length);
		
		//Ahora ordenanmos t.
		Arrays.sort(tablaNueva);
		
		//Recorremos la tabla nueva y hacemos una búsqueda.
		for (int i=0; i<tablaNueva.length; i++) {
					
					//Asignamos en una variable valor los elementos de la tabla.
					int valor= tablaNueva[i];
					
					//Hacemos una búsqeda si ese valor ya existe en la tabla nueva y lo guardamos en la variable posición.
					int posicion= Arrays.binarySearch(tablaNueva, valor);
					
					//Hacemos un if para saber si el elemento está en la tabla nueva.
					//En caso de que la posición sea negativa, significa que no está en la tabla nueva.
					if (posicion<0) {
						
						//Si no encuentra la posición en la tabla, significa que no existe el elemento,
						//por lo que hay que copiarlo en la tabla nueva.
						
						//Ahora hacemos que en la tabla nueva se añada una posición más.
						tablaNueva= Arrays.copyOf(tablaNueva, tablaNueva.length+1);
						
						//Asignamos a una posición de la tabla un valor.
						tablaNueva[indexNuevo]=valor;
						
						//Sumamos 1 a las posiciones.
						indexNuevo++;
						
					}
					
				}
		
		
		//Devolvemos la tabla.
		return tablaNueva;
	}

}
