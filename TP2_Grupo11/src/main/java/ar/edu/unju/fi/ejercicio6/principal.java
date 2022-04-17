package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;

import ar.edu.unju.fi.ejercicio17.Principal;


public class principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
	int numero = 1;
	
	Scanner lector = new Scanner(System.in);
	
	while (numero>0)
	{
		numero = lector.nextInt();
		
		if (numero==6) { 
			
			System.out.println("el alumno regulariza");
			}
		if (numero>=7 && numero<=10) {
			System.out.println("El alumno promociona");
			}
		if (numero<6 && numero>=1) {
			System.out.println("El alumno desaprueba");
		}
		
	}
	
	
	System.out.println("valor no permitido");
	
	lector.close();
	}
	
}
	
