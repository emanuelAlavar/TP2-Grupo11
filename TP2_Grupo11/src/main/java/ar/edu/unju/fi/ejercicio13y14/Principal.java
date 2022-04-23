package ar.edu.unju.fi.ejercicio13y14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese horas trabajadas:");
		int horasT= sc.nextInt();
		sc.close();
		System.out.println("Sueldo: $"+empleado.calcularSueldo(horasT));
		empleado.setSueldo(empleado.calcularSueldo(horasT));
		System.out.println(empleado.toString());
		
		
		//Ejercicio 14
		Empleado empleadoUno = new Empleado();
		Empleado empleadoDos = new Empleado("Emanuel Alavar",3333,150);
		Empleado empleadoTres = new Empleado("Hector Cruz","2022-07-12",190);
		Empleado empleadoCuatro = new Empleado("Alejandro Anachuri",160);
		
		
		System.out.println(empleadoUno.toString());
		System.out.println(empleadoDos.toString());
		System.out.println(empleadoTres.toString());
		System.out.println(empleadoCuatro.toString());
	}

}
