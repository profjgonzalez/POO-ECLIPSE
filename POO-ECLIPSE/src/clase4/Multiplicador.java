package clase4;

//Nombre: Programa 3. Multiplicador.java
/*
	Autor: Ing. Jorge González
	Descripción: Programa que multiplica dos números y muestra la salida en consola
 */
import java.util.Scanner;

public class Multiplicador
{

	//metodo que comienza la ejecución de cada aplicación en Java
	public static void main(String args[])
	{
    //Objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);

    int numeroUno; //Primer número a multiplicar
    int numeroDos; //Segundo número a multiplicar
    int resultado; //Resultado del producto

    System.out.print("Captura el numero uno: ");
    numeroUno = entrada.nextInt(); //Lee el primer número del usuario

    System.out.print("Captura el numero dos: ");
    numeroDos = entrada.nextInt(); //Lee el segundo número del usuario

    resultado = numeroUno * numeroDos; //Efectúa la operación producto

    System.out.printf("El producto es:%d%n", resultado);
	}//fin del método main
}//fin de la clase HolaMundo
