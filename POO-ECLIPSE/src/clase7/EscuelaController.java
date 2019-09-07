package clase7;

import java.util.Scanner;

public class EscuelaController {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Estudiante estudiante1 = new Estudiante("Jorge Gonzlez", 70.3);
		
		Estudiante estudiante2 = new Estudiante();
		
		System.out.print("Captura el nombre del estudiante 2: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Captura la calificacion del estudiante 2: ");
		double calificacion = entrada.nextDouble();
		
		estudiante2.setNombre(nombre);
		estudiante2.setPromedio(calificacion);
		
		System.out.printf("%nLa calificación del estudiante 1: %s es en número: %.2f y el testimonio asignado: %s%n%n", 
							estudiante1.getNombre(), 
							estudiante1.getPromedio(), 
							estudiante1.obtenerTestimonio()
						 );
		
		System.out.printf("%nLa calificación del estudiante 2: %s es en número: %.2f y el testimonio asignado: %s%n%n", 
							estudiante2.getNombre(), 
							estudiante2.getPromedio(), 
							estudiante2.obtenerTestimonio()
						 );
	}

}
