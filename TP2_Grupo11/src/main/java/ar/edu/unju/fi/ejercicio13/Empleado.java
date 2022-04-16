package ar.edu.unju.fi.ejercicio13;

public class Empleado {
	private String nombre;
	private String fechaIngreso;
	private int legajo;
	private String email;
	private float sueldo;
	private int horasTrabajadas;
		
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String fechaIngreso, int legajo, String email, int horasTrabajadas) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.horasTrabajadas = horasTrabajadas;
	}



	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		this.nombre = nombre;		
		this.legajo = legajo;		
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Empleado(String nombre, String fechaIngreso, int horasTrabajadas) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;		
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Empleado(String nombre, int horasTrabajadas) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horasTrabajadas=" + horasTrabajadas + "]";
	}

	public float calcularSueldo(int horasTrabajadas) {
		if(horasTrabajadas>=161) 
			return horasTrabajadas*650;
		else {
			return horasTrabajadas*600;		
		}
	}
}
