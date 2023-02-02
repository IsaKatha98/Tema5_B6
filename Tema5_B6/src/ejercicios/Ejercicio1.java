package ejercicios;
import java.util.Arrays;

public class Ejercicio1 {
	
	//Hacemos una función que sume los valores de la tabla.
	public static int sumaTabla (int[]tabla) {
		
		//Creamos la variable sumaTabla.
		int sumaTabla=0;
		
		//Recorremos la tabla y vamos sumando los valores.
		for (int i=0; i<tabla.length; i++) {
			
			//Vamos sumando los valores.
			sumaTabla+=tabla[i];
			
		}
		
		return sumaTabla;
		
	}

	public static void main(String[] args) {
		
		//Creamos un array y las variables necesarias.
		int[] tabla= {1,2,3,4,5};
		
		int totalValores; //Variable donde guardamos la suma de los valores de la tabla.
		
		//Invocamos la función.
		totalValores=sumaTabla(tabla);
		
		//Imprimimos el resultado.
		System.out.println("Dada la siguiente tabla: ");
		System.out.println(Arrays.toString(tabla));
		System.out.println("La suma de los valores es: "+totalValores);
	}

}
