package clase4;
//Nombre: Programa 4. NumeroMayor.java
/*
	Autor: Ing. Jorge González
	Descripción: Programa que dados 3 números los me dice cuál es el mayor
*/

import java.util.Scanner;

public class NumeroMayor {
	
	//metodo que comienza la ejecución de cada aplicación en Java
	public static void main(String args[])
	{
	    //Objeto Scanner para obtener la entrada de la ventana de comandos
	    Scanner entrada = new Scanner(System.in);
	
	    int numeroUno; //Primer número a multiplicar
	    int numeroDos; //Segundo número a multiplicar
	    int numeroTres; //Segundo número a multiplicar
	    
	    int mayor;
	    
	    //Obtención de los datos
	    System.out.print("Captura el numero uno: ");
	    numeroUno = entrada.nextInt(); //Lee el primer número del usuario
	
	    System.out.print("Captura el numero dos: ");
	    numeroDos = entrada.nextInt(); //Lee el segundo número del usuario
	    
	    System.out.print("Captura el numero tres: ");
	    numeroTres = entrada.nextInt(); //Lee el segundo número del usuario
	
	    if(numeroUno > numeroDos) {
	    	mayor = numeroUno;
	    }
	    else {
	    	mayor = numeroDos;
	    }
	    
	    if(numeroTres > mayor) {
	    	mayor = numeroTres;
	    }
	
	    System.out.printf("El número mayor es:%d%n", mayor);
	}//fin del método main

}
