package clase5;
//Nombre: Cuenta.java
/*
	Autor: Ing. Jorge González
	Descripción: Programa datos de una cuenta
*/

public class Cuenta {
	
	private String nombre; //variable de instancia nombre
	
	private String numeroCuenta; //variable de instancia cuenta
	
	private String tipo; //variable de instancia tipo
	
	
	//Método para obtener el nombre del objeto
	public String getNombre() {
		return nombre;
	}

	//Método para establecer el nombre en el objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Método para obtener el número de cuenta del objeto
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	//Método para establecer el número de cuenta en el objeto
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	//Método para obtener el tipo del objeto
	public String getTipo() {
		return tipo;
	}

	//Método para establecer el tipo en el objeto
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
