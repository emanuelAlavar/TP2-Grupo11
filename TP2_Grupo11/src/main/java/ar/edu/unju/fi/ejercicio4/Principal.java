package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Mes unMes = new Mes(); 
		Scanner sc = new Scanner(System.in);
		int mes;
		
		do {
			System.out.println("Ingrese numero del mes 1-12: ");					
			mes=sc.nextInt();
		}while(mes<1 || mes>12);
		
		sc.close();		
		
		System.out.println(mes + " "+unMes.esMes(mes));		
	}
}