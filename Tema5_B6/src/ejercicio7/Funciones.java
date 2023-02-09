package ejercicio7;

import java.util.Arrays;

public class Funciones {

	public static int [] buscarTodos (int[] t, int valor) {

		// Declaramos las variables pertinentes.
		int buscar;
		int indexBuscar = 0; // Variable donde guardamos la posición del valor que buscamos
		int indexConstruirTabla=0;
		
		//Copiamos la tabla t en una nueva para no modificar t.
		int[] tablaNueva= new int [t.length];
		
		tablaNueva=Arrays.copyOf(t, t.length);
		
		// En un bucle while, buscamos el valor 
		while (indexBuscar < tablaNueva.length && valor != t[indexBuscar]) {

			// Aumentamos en uno el bucle.
			indexBuscar++;

		}
		
		//En caso de que encuentre el valor indicado, generará una tabla
		//con los indíces.
		if (indexBuscar < tablaNueva.length) {

			
			//Construimos una tabla distinta con indexBuscar.
			
				
				
			}
				
		} else {

			buscar = -1;

		}

		return buscar;

	}
	
}
