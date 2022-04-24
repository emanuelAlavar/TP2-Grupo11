package ar.edu.unju.fi.ejercicio13y14;

import java.util.Calendar;

public class Principal14 {

	public static void main(String[] args) {
		Empleado empleadoUno = new Empleado();
		Empleado empleadoDos = new Empleado("Emanuel",3333,170);
		
		Calendar fecha= Calendar.getInstance();
		fecha.set(2020, 7, 14);
		Empleado empleadoTres = new Empleado("Carlos",fecha,145);
		Empleado empleadoCuatro = new Empleado("Marcelo",161);
		
		System.out.println(empleadoUno);
		System.out.println(empleadoDos);
		System.out.print(empleadoTres);
		System.out.println(", fechaIngreso="+empleadoTres.getFechaIngreso().get(Calendar.DATE)+"-"+ empleadoTres.getFechaIngreso().get(Calendar.MONTH)+"-"+ empleadoTres.getFechaIngreso().get(Calendar.YEAR));
		System.out.println(empleadoCuatro);
	}
}