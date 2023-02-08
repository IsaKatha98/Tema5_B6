package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		int longitud;
		int borrar;
		
		//qué cojones pasa?
		

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos la usuario por el tamaño de la tabla y por el fin.
		System.out.println("Indique el tamaño de la tabla: ");
		longitud = sc.nextInt();

		// Creamos una tabla del tamaño introducido rellenada de forma aleatoria.
		int[] tabla = new int[longitud];

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10+1);
		}

		// Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));
		
		//Preguntamos que valor quiere borrar el usuario.
		System.out.println("A partir de qué valor se eliminarán los números de la tabla?");
		borrar=sc.nextInt();
		
		//Creamos otra tabla.
		int [] tablaNueva= new int[longitud];
		
		//Invocamos la función.
		tablaNueva= Funciones.eliminarMayores(tabla, borrar);
		
		//Imprimimos el resultado.
		System.out.println(Arrays.toString(tablaNueva));
		
	}

}
