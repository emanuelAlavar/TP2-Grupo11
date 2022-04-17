package fi.unju.edu.ar.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bisiesto esBisiesto = new Bisiesto();
		
		System.out.println("Ingrese un año: ");
		double anio = sc.nextDouble();
		
		// Comprobar si es bisiesto
        boolean resultado = esBisiesto.bisiesto(anio);
        
        // No es necesario hacer el resultado == true porque ya es un booleano
        if (resultado) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        sc.close();
	}

}
