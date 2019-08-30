package clase5;
//Nombre: Cuenta.java
/*
	Autor: Ing. Jorge Gonz�lez
	Descripci�n: Programa datos de una cuenta
*/

public class Cuenta {
	
	private String nombre; //variable de instancia nombre
	
	private String numeroCuenta; //variable de instancia cuenta
	
	private String tipo; //variable de instancia tipo
	
	
	//M�todo para obtener el nombre del objeto
	public String getNombre() {
		return nombre;
	}

	//M�todo para establecer el nombre en el objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//M�todo para obtener el n�mero de cuenta del objeto
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	//M�todo para establecer el n�mero de cuenta en el objeto
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	//M�todo para obtener el tipo del objeto
	public String getTipo() {
		return tipo;
	}

	//M�todo para establecer el tipo en el objeto
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
