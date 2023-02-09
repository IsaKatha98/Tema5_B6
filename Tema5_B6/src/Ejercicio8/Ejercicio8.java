package Ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Hacemos un array que rellenará el usuario con valores de 0 a 10.
		int [] tabla= new int[6];
		int numEnteros;
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los números.
		System.out.println("Introduzca 5 números enteros entre 0 y 10: ");
		
		for (int i=0; i<tabla.length; i++) {
			
			numEnteros=sc.nextInt();
			
			tabla[i]=numEnteros;
		}
		
		//Presentamos la tabla.
		System.out.println(Arrays.toString(tabla));

	}

}
