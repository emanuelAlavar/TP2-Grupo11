package ar.edu.unju.fi.ejercicio15;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio15.model.Persona;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingrese fecha de nacimiento DD/MM/AAAA:");
		int dia=entrada.nextInt();
		int mes=entrada.nextInt();
		int anio=entrada.nextInt();
		entrada.close();
		
		Calendar fecha1 = Calendar.getInstance();	
		fecha1.set(anio, mes, dia);
		
		Calendar fecha2 = Calendar.getInstance();
		int anio2=fecha2.get(Calendar.YEAR);
		int mes2=fecha2.get(Calendar.MONTH);
		int dia2=fecha2.get(Calendar.DAY_OF_MONTH);		
		fecha2.set(anio2, mes2, dia2);
		
		System.out.println(persona.calcularEdad(fecha1,fecha2));
		System.out.println(persona.calcularSigno(fecha1));
		System.out.println(persona.calcularEstacion(fecha1));

	}
}