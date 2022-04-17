package fi.unju.edu.ar.ejercicio1;

public class Factorial {
	
	public int factorial (int num) {
		int fact = 1;
		int i;
		
		for(i = 1; i <= num; i++){
			fact = fact * i;
		}
	return fact;
	}	
}
