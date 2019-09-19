package clase11_stringbuilder;

import java.util.Scanner;

public class Cadenas {

	public static void main(String... args) {

		String cadena1 = new String();
		
		StringBuilder cadena2 = new StringBuilder();
		
		cadena1 = "Los Beatles eran:\n";
		cadena1 += "John Lennon\n";
		cadena1 += "Paul McCartney\n";
		cadena1 += "Ringo Starr\n";
		cadena1 += "y George Harrison";
		
		cadena2.append("\n\nLos Rolling Stones son:\n")
		.append("Mick Jagger\n")
		.append("Charlie Watts\n")
		.append("Keith Richards\n")
		.append("Brian Jones\n")
		.append("y Bill Wyman");
		
		System.out.println(cadena1);
	
		System.out.println(cadena2.toString());
	}

}

	
	