package clase9_instruccion_for;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Captura el numero a calcular su factorial: ");
		int numeroFactorial = entrada.nextInt();
		
		if(numeroFactorial < 0) 
			System.out.printf("El factorial del número %d es: %d",numeroFactorial, 0);		
		else if(numeroFactorial == 0) 
			System.out.printf("El factorial del numero %d es: %d", numeroFactorial, 1);			
		else {		
			int resultado = 1;		
			for(int i=1; i <= numeroFactorial; i++) {
				resultado = resultado *i;
				System.out.printf("Iteracion %d: = %d%n%n", i, resultado);
			}
			System.out.printf("El factorial de %d es: %d", numeroFactorial, resultado);
		}
	}

}
