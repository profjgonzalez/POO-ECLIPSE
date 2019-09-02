package clase6Bis;

import java.util.Scanner;

public class CuentaController {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("Jorge Gonzalez", 135.00);
		Cuenta cuenta2 = new Cuenta("James Gosling", -10000.00);
		
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
		System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.getNombre(), cuenta2.getSaldo());

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriba el monto a depositar para la cuenta1: ");
		double montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
		cuenta1.depositar(montoDeposito);
		
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
		System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.getNombre(), cuenta2.getSaldo());
		
		System.out.print("Escriba el monto a depositar para la cuenta2: ");
		montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
		cuenta2.depositar(montoDeposito);
		
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.getNombre(), cuenta1.getSaldo());
		System.out.printf("Saldo de %s: $%.2f%n", cuenta2.getNombre(), cuenta2.getSaldo());
	}
}
