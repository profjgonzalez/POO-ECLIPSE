package clase7;

public class Estudiante {
	
	private String nombre;
	
	private double promedio;
	
	public Estudiante(String nombre, double promedio) {
		
		this.nombre = nombre;
		
		if(promedio > 0.0 && promedio <= 100.0)
			this.promedio = promedio;
	}
	
	public Estudiante() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		if(promedio > 0.0 && promedio <= 100.0)
			this.promedio = promedio;
	}
	
	public String obtenerTestimonio() {
		if(promedio >= 90.00)
			return "A";
		else if(promedio >= 80.00)
			return "B";
		else if(promedio >= 70.00)
			return "C";
		else if(promedio >= 60.00)			
			return "D";
		else
			return "F";
	}
}
