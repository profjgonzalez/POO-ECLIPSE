package clase4;
//Nombre: Programa 4. NumeroMayor.java
/*
	Autor: Ing. Jorge Gonz�lez
	Descripci�n: Programa que dados 3 n�meros los me dice cu�l es el mayor
*/

import java.util.Scanner;

public class NumeroMayor {
	
	//metodo que comienza la ejecuci�n de cada aplicaci�n en Java
	public static void main(String args[])
	{
	    //Objeto Scanner para obtener la entrada de la ventana de comandos
	    Scanner entrada = new Scanner(System.in);
	
	    int numeroUno; //Primer n�mero a multiplicar
	    int numeroDos; //Segundo n�mero a multiplicar
	    int numeroTres; //Segundo n�mero a multiplicar
	    
	    int mayor;
	    
	    //Obtenci�n de los datos
	    System.out.print("Captura el numero uno: ");
	    numeroUno = entrada.nextInt(); //Lee el primer n�mero del usuario
	
	    System.out.print("Captura el numero dos: ");
	    numeroDos = entrada.nextInt(); //Lee el segundo n�mero del usuario
	    
	    System.out.print("Captura el numero tres: ");
	    numeroTres = entrada.nextInt(); //Lee el segundo n�mero del usuario
	
	    if(numeroUno > numeroDos) {
	    	mayor = numeroUno;
	    }
	    else {
	    	mayor = numeroDos;
	    }
	    
	    if(numeroTres > mayor) {
	    	mayor = numeroTres;
	    }
	
	    System.out.printf("El n�mero mayor es:%d%n", mayor);
	}//fin del m�todo main

}
