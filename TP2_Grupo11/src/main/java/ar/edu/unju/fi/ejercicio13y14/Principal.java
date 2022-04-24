package ar.edu.unju.fi.ejercicio13y14;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		Calendar fecha= Calendar.getInstance();
		fecha.set(2020, 7, 14);
		Empleado empleado = new Empleado("Emanuel",fecha,3333,"manu@gmail.com",165);
		
		empleado.calcularSueldo();		
		empleado.setSueldo(empleado.calcularSueldo());
		
		System.out.println(empleado.getNombre()+ " | " + empleado.getLegajo()+" | " 
		+ empleado.getEmail()+ " | " + empleado.getHorasTrabajadas()+ " | $" 
		+ empleado.getSueldo()+ " | " + empleado.getFechaIngreso().get(Calendar.DATE)+"-"
		+ empleado.getFechaIngreso().get(Calendar.MONTH)+"-"+ empleado.getFechaIngreso().get(Calendar.YEAR));
	}
}