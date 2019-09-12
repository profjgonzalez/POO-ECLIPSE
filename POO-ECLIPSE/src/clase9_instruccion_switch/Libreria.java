package clase9_instruccion_switch;

import java.util.Scanner;

public class Libreria {
	
	public static void main(String... args) {	
		Scanner entrada = new Scanner(System.in);		
		int opcion = 0;		
		int totalPagar = 0;
		String clave = "";
		do {
			System.out.println("##########Menu#########");
			System.out.println("°°°°°Tipos de libros°°°");
			System.out.println("°°CF - Ciencia Ficcion°");//80 pesos
			System.out.println("°°NV - Novela°°°°°°°°°°");// 80 pesos
			System.out.println("°°BG - Biografia°°°°°°°");//90 pesos
			System.out.println("°°LT - Literatura°°°°°°");//100 pesos
			System.out.println("°°RC - Recreativos°°°°°");//80 pesos
			System.out.println("°°IS - Instructivos°°°°");// 90 pesos
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("Teclea la operación segun requieras");
			System.out.println("1. Comprar libro");
			System.out.println("2. Pagar");	
			System.out.print("Tu clave: ");	
			opcion = entrada.nextInt();
						
			if(opcion == 1) {
				
				System.out.print("Teclea clave del libro: ");
				clave = entrada.next();
				
				switch(clave) {
					case "CF":
					case "NV":
					case "RC":
						totalPagar += 80;
						break;
					case "BG":
					case "IS":
						totalPagar += 90;
						break;
					case "LT":
						totalPagar += 100;
						break;
					default:
						System.out.println("Clave incorrecta!\n");
				}
				System.out.println("Agregado!\n");
			}
			if(opcion < 1 || opcion >2)
				System.out.println("Clave incorrecta!");
			
		}while(opcion != 2);
		if(totalPagar > 0)
			System.out.printf("El total a pagar es: %d%n", totalPagar);
		else
			System.out.println("No se realizo ninguna compra");
		System.out.println("Fin de la transaccion");
	}
}
