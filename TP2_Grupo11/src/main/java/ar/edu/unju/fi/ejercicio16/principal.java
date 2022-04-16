package ar.edu.unju.fi.ejercicio16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class principal {

	public static void main(String[] args) {
		SpringApplication.run(principal.class, args);
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Ingrese un valor entero");
			n = scanner.nextInt();
		} while(n%1!=0);
		scanner.close();
		CalculoMatematico CM = new CalculoMatematico(n);
		System.out.println("Metodo sumatoria: "+CM.calcularSumatoria());
		System.out.println("Metodo productoria: "+CM.calcularProductoria());
		
	}

}
