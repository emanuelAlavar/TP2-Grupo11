package fi.unju.edu.ar.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Factorial unFactorial = new Factorial();
			
		System.out.println("Ingrese un numero entero [0-10]: ");
		int n = sc.nextInt();
			
		if((n >= 0) && (n <= 10)) {
			System.out.println("Factorial del numero " + n + " es: " + unFactorial.factorial(n));
		}else {
			System.out.println("Numero fuera de rango.");
		}
		sc.close();
	}
}
