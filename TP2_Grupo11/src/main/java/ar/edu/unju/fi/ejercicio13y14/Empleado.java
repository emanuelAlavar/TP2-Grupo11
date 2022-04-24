package ar.edu.unju.fi.ejercicio13y14;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private Calendar fechaIngreso;
	private int legajo;
	private String email;
	private float sueldo;
	private int horasTrabajadas;
		
	public Empleado() {
		
	}
	
	public Empleado(String nombre, Calendar fechaIngreso, int legajo, String email, int horasTrabajadas) {
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
	
	public Empleado(String nombre, Calendar fechaIngreso, int horasTrabajadas) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;		
		this.horasTrabajadas = horasTrabajadas;
		this.legajo=-9999;
	}
	
	public Empleado(String nombre, int horasTrabajadas) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.legajo=-9999;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
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

	public float calcularSueldo() {
		int horasT=this.horasTrabajadas;
		if(horasT>=161) 
			return horasT*650;
		else {
			return horasT*600;		
		}
	}

	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horasTrabajadas=" + horasTrabajadas;
	}
	
	
}
