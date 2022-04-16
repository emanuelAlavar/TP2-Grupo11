package ar.edu.unju.fi.ejercicio15.model;

import java.time.LocalDate;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String calcularEdad(Calendar fechaNac, Calendar fechaActual) {
		//asignacion y calculo en milisegundos de la diferencia entre fecha actual y fecha de nacimiento
				long milisegundos= fechaActual.getTimeInMillis() - fechaNac.getTimeInMillis();
				//asignacion y conversion de milisegundos a anios
				long anios= milisegundos/1000/60/60/24/365;
				String resultado="Edad actual: "+ anios ;
				return resultado;
	}
	
	public String calcularSigno(Calendar fechaNac) {
		int mes=fechaNac.get(Calendar.MONTH);
		int dia=fechaNac.get(Calendar.DAY_OF_MONTH);
		String signo = null;
		  
        switch (mes) {
            case 1:
	                if (dia<=21)
	                    signo = "Capricornio";
	                else if (dia<=31)
	                    signo = "Acuario";
	                break;
            case 2:
	                if (dia<=21)
	                    signo = "Acuario";
	                else if (dia<=29)
	                    signo = "Piscis";
	                break;
            case 3:
	                if (dia > 20) {
	                    signo = "ARIES";
	                } else {
	                    signo = "PISCIS";
	                }
	                break;
	        case 4:
	                if (dia > 20) {
	                    signo = "TAURO";
	                } else {
	                    signo = "ARIES";
	                }
	                break;
	        case 5:
	                if (dia > 21) {
	                    signo = "GEMINIS";
	                } else {
	                    signo = "TAURO";
	                }
	                break;
	        case 6:
	                if (dia > 20) {
	                    signo = "CANCER";
	                } else {
	                    signo = "GEMINIS";
	                }
	                break;
	        case 7:
	                if (dia > 22) {
	                    signo = "LEO";
	                } else {
	                    signo = "CANCER";
	                }
	                break;
	        case 8:
	                if (dia > 21) {
	                    signo = "VIRGO";
	                } else {
	                    signo = "LEO";
	                }
	                break;
	        case 9:
	                if (dia > 22) {
	                    signo = "LIBRA";
	                } else {
	                    signo = "VIRGO";
	                }
	                break;
	        case 10:
	                if (dia > 22) {
	                    signo = "ESCORPION";
	                } else {
	                    signo = "LIBRA";
	                }
	                break;
	        case 11:
	                if (dia > 21) {
	                    signo = "SAGITARIO";
	                } else {
	                    signo = "ESCORPION";
	                }
	                break;
            case 12:
                if (dia<=21)
                    signo = "Sagitario";
                else if (dia<=31)
                    signo = "Capricornio";
                break;
            default:
            	signo ="El mes introducido no es correcto";
                break;
        }
        return signo;		
	}
	
	public String calcularEstacion(Calendar fechaNac) {
		String estacion ;
		int nMes=fechaNac.get(Calendar.MONTH);
		int diaMes=fechaNac.get(Calendar.DAY_OF_MONTH);
        switch(nMes){
            case 1: case 2:
                estacion = "Verano";
                break;
            case 3:
                estacion = (diaMes<20)?"Verano":"Otonio";
                break;
            case 4: case 5:
                estacion = "Otonio";
                break;
            case 6:
                estacion = (diaMes<20)?"Otonio":"Invierno";
                break;
            case 7: case 8:
                estacion = "Invierno";
                break;
            case 9:
                estacion = (diaMes<20)?"Invierno":"Primavera";
                break;
            case 10: case 11:
                estacion = "Primavera";
                break;
            case 12:
                estacion = (diaMes<20)?"Primavera":"Verano";
                break;
            default:
                estacion = "Estacion desconocida";
        }
		return estacion;
	}
}