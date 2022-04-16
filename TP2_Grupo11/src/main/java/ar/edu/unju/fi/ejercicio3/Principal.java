package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio3.model.Numero;

public class Principal {

	public static void main(String[] args) {
		Numero unNumero = new Numero(); 
		Scanner sc = new Scanner(System.in);
		int numeros[]= new int[5];
		
		System.out.println("Ingrese 5 numeros: ");
		for(int i=0;i<=4;i++) {			
			numeros[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<=4;i++) {
			System.out.println(numeros[i] +" "+unNumero.esPar(numeros[i])) ;
		}
	}
}