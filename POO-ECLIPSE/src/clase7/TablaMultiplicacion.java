package clase7;

import java.util.Scanner;

public class TablaMultiplicacion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe el numero de la tabla de multiplicacion a generar: ");
		int numeroMultiplicacion = entrada.nextInt();
		
		System.out.print("Escribe el numero iteraciones: ");
		int iteraciones = entrada.nextInt();
		
		int contador = 1;
		
		while(contador <= iteraciones) {
			System.out.printf("%d * %d = %d%n", numeroMultiplicacion, contador, numeroMultiplicacion * contador);
			contador +=1;
		}
	}

}
