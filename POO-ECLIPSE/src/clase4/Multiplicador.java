package clase4;

//Nombre: Programa 3. Multiplicador.java
/*
	Autor: Ing. Jorge Gonz�lez
	Descripci�n: Programa que multiplica dos n�meros y muestra la salida en consola
 */
import java.util.Scanner;

public class Multiplicador
{

	//metodo que comienza la ejecuci�n de cada aplicaci�n en Java
	public static void main(String args[])
	{
    //Objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);

    int numeroUno; //Primer n�mero a multiplicar
    int numeroDos; //Segundo n�mero a multiplicar
    int resultado; //Resultado del producto

    System.out.print("Captura el numero uno: ");
    numeroUno = entrada.nextInt(); //Lee el primer n�mero del usuario

    System.out.print("Captura el numero dos: ");
    numeroDos = entrada.nextInt(); //Lee el segundo n�mero del usuario

    resultado = numeroUno * numeroDos; //Efect�a la operaci�n producto

    System.out.printf("El producto es:%d%n", resultado);
	}//fin del m�todo main
}//fin de la clase HolaMundo
