package clase11_securerandom;

import java.security.SecureRandom;

public class DadosEnum {
	
	private enum Estado{GANASTE, PERDISTE, EMPATASTE};

	public static void main(String[] args) {
		
		int tiro1Jugador = 0;
		int tiro2Jugador = 0;
		int tiro1Maquina = 0;
		int tiro2Maquina = 0;
		
		
		SecureRandom numerosAleatorios = new SecureRandom();
		Estado estadoJuego;
		
		tiro1Jugador = 1 + numerosAleatorios.nextInt(6);//Tiro 1 jugador 1
		System.out.printf("Tiro 1 jugador: %d%n", tiro1Jugador);
		tiro2Jugador += 1 + numerosAleatorios.nextInt(6); 
		System.out.printf("Tiro 2 jugador: %d%n", tiro2Jugador);
		System.out.printf("Suma jugador: %d%n%n", tiro1Jugador + tiro2Jugador);
		
		tiro1Maquina = 1 + numerosAleatorios.nextInt(6);//Tiro 1 jugador 1
		System.out.printf("Tiro 1 Maquina: %d%n", tiro1Maquina);
		tiro2Maquina += 1 + numerosAleatorios.nextInt(6); 
		System.out.printf("Tiro 2 Maquina: %d%n", tiro2Maquina);
		System.out.printf("Suma Maquina: %d%n%n", tiro1Maquina + tiro2Maquina);
		
		if((tiro1Jugador + tiro2Jugador) > (tiro1Maquina + tiro2Maquina)) {
			estadoJuego = Estado.GANASTE;
		}else if((tiro1Jugador + tiro2Jugador) == (tiro1Maquina + tiro2Maquina))
			estadoJuego = Estado.EMPATASTE;
		else
			estadoJuego = Estado.PERDISTE;
		
		System.out.println("En el juego: " + estadoJuego.toString());
	}

}
