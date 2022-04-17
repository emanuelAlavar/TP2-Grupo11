package fi.unju.edu.ar.ejercicio2;

public class Bisiesto {
	
	public boolean bisiesto (double anio) {
		// Divisible entre 4, y (NO divisible entre 100 o divisible entre 400)
		return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
	}	
}
