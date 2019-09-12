package clase9_instruccion_dowhile;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String respuesta = "S";
		do {
			System.out.println("##########Menu########");
			System.out.println("Teclea la operación segun requieras: ");
			System.out.println("1. Suma de dos numeros");
			System.out.println("2. Resta de dos numeros");
			System.out.println("3. Division de dos numeros");
			System.out.println("4. Multiplicacion de dos numeros");
			
			int opcion = 0;
			System.out.print("Selecciona una opción:");
			opcion = entrada.nextInt();
			int numero1 = 0;
			int numero2 = 0;
			double resultado = 0;
			
			System.out.print("\nCaptura el primer numero: ");
			numero1 = entrada.nextInt();
			System.out.print("\nCaptura el segundo numero: ");
			numero2 = entrada.nextInt();
			
			if(opcion == 1)
				resultado = numero1 + numero2;
			else if(opcion ==2)
				resultado = numero1 - numero2;
			else if(opcion == 3)
				resultado = numero1 / numero2;
			else if(opcion == 4)
				resultado = numero1 * numero2;
			
			System.out.printf("El resultado es: %.2f%n", resultado);			
			System.out.println("############################################");
			
			System.out.print("¿Quieres salir? - [S - Si, N - No]\n");
			respuesta = entrada.next();
			
		}while(!respuesta.equals("S"));
		
		System.out.println("Termina la aplicación");
	}

}
