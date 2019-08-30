package clase5;
//Nombre: CuentaController.java
/*
	Autor: Ing. Jorge Gonz�lez
	Descripci�n: Clase controladora que emplea objetos Cuenta, obtiene datos que provee el usuario
	y muestra por pantalla los datos capturados utilizando setters y getters
*/

import java.util.Scanner;

public class CuentaController {

	//metodo que comienza la ejecuci�n de cada aplicaci�n en Java
	public static void main(String[] args) {
		
		//Crea un objeto Scanner para obtener la entrada desde el s�mbolo del sistema
		Scanner entrada = new Scanner(System.in);
		
		//Crea un objeto cuenta y lo asigna a miCuenta
		Cuenta miCuenta = new Cuenta();
		
		System.out.println("El nombre de la cuenta es: " + miCuenta.getNombre() + "\nEl n�mero de cuenta es: " + miCuenta.getNumeroCuenta() + "\nEl tipo es: " + miCuenta.getTipo() + "\n");
		
		//Pide y lee el nombre
		System.out.print("Introduce el nombre de la cuenta: ");
		String elNombre = entrada.nextLine();
		
		//Pide y lee el n�mero de la cuenta
		System.out.print("Introduce el n�mero de la cuenta: ");
		String elNumeroCuenta = entrada.nextLine();
		
		//Pide y lee el tipo de cuenta
		System.out.print("Introduce el tipo de la cuenta: ");
		String elTipo = entrada.nextLine();
		
		miCuenta.setNombre(elNombre);//Coloca el nombre dentro de miCuenta
		miCuenta.setNumeroCuenta(elNumeroCuenta);//Coloca el n�mero de cuenta dentro de miCuenta
		miCuenta.setTipo(elTipo); //Coloca el tipo dentro de miCuenta
		
		//Muestra los datos capturados por el usuario empleando los metodos getters
		System.out.println("\nEl nombre de la cuenta es: " + miCuenta.getNombre() + "\nEl n�mero de cuenta es: " + miCuenta.getNumeroCuenta() + "\nEl tipo es: " + miCuenta.getTipo());
	}//Fin del m�todo main
}//Fin de la clase
