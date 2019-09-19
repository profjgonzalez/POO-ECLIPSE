package clase11_static;

import java.util.Scanner;

public class Maximo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe tres valores de punto flotante, separados por espacios: ");
		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		double numero3 = entrada.nextDouble();
		
		System.out.println("El numero Maximo es: " + numeroMaximo(numero1, numero2, numero3));
	}
	
	public static double numeroMaximo(double numero1, double numero2, double numero3) {
		return Math.max(numero1, Math.max(numero2, numero3));
		
	}

}
