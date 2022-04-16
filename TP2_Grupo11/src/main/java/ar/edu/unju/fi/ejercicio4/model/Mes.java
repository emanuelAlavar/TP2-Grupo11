package ar.edu.unju.fi.ejercicio4.model;

public class Mes {
	private int numero;

	public Mes() {
		
	}
	
	public Mes(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String esMes(int numero) {
		if(numero==1)
			return "SI es un mes valido";
		if(numero==2)
			return "SI es un mes valido";
		if(numero==3)
			return "SI es un mes valido";
		if(numero==4)
			return "SI es un mes valido";
		if(numero==5)
			return "SI es un mes valido";
		if(numero==6)
			return "SI es un mes valido";
		if(numero==7)
			return "SI es un mes valido";
		if(numero==8)
			return "SI es un mes valido";
		if(numero==9)
			return "SI es un mes valido";
		if(numero==10)
			return "SI es un mes valido";
		if(numero==11)
			return "SI es un mes valido";
		if(numero==12)
			return "SI es un mes valido";
		else
			return "NO EXISTE este mes";
	}
}