package clase7;

import java.util.Scanner;

public class PromedioClaseCentinela {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		
		int contadorCalificaciones = 0;
		
		System.out.print("Escriba la calificación o el valor -1 para terminar: ");
		int calificacion = entrada.nextInt();
		
		while(calificacion != -1) {
			
			total += calificacion;
			
			contadorCalificaciones ++;
			
			System.out.print("Escriba la calificación o el valor -1 para terminar: ");
			calificacion = entrada.nextInt();
			
		}
		
		if(contadorCalificaciones > 0) {
			double promedio = total / contadorCalificaciones;
			
			System.out.printf("%nEl total de las %d calificaciones introducidas es: %d%n", contadorCalificaciones, total);
			
			System.out.printf("El promedio de la clase es: %.2f", promedio);
		}
		else {
			System.out.println("No se introdujo nunguna calificación");
		}
	}
}
