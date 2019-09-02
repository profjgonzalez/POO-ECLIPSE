package clase6;
//Nombre: CuentaController.java
/*
	Autor: Ing. Jorge González
	Descripción: Clase controladora que emplea objetos Cuenta inicializados desde el constructor
*/

public class CuentaController {

	public static void main(String[] args) {
		
		//Creación de objetos mediante constructor
		Cuenta cuenta1 = new Cuenta("Jorge Gonzalez", "CT-13456-FRC", "Debito");
		Cuenta cuenta2 = new Cuenta("James Gosling", "CT-789465-MG", "Credito");
		
		System.out.printf("El nombre es: %s, El número de cuenta es: %s, El tipo es: %s%n%n", cuenta1.getNombre(), cuenta1.getNumeroCuenta(), cuenta1.getTipo());
		System.out.printf("El nombre es: %s, El número de cuenta es: %s, El tipo es: %s%n%n", cuenta2.getNombre(), cuenta2.getNumeroCuenta(), cuenta2.getTipo());

	}//Fin del método main
}//Fin de la clase
