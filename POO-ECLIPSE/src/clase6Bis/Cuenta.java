package clase6Bis;

public class Cuenta {
	
	private String nombre;
	
	private double saldo;
	
	public Cuenta(String nombre, double saldo) {
		this.nombre = nombre;
		
		/*
		 * Valida que saldo sea mayor a 0.0 de lo contrario la 
		 * variable de instancia saldo mantiene su valor inicial 
		 * predeterminado o sea 0.0
		 * */
		if(saldo > 0.0) {
			this.saldo = saldo;
		}
	}
	
	public void depositar(double montoDeposito) {
		if(montoDeposito > 0.0)
			saldo = saldo + montoDeposito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
