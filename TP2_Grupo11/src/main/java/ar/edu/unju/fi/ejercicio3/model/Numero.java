package ar.edu.unju.fi.ejercicio3.model;

public class Numero {
	private int numero;

	public Numero() {
		
	}
	
	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String esPar(int numero){
			if(numero % 2==0) {
				return "SI es un numero par";
			}else 
				return "NO es un numero par";				
	}	
}