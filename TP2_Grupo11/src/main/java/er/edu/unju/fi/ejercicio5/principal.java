package er.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean equivoco=true;
		Scanner entrada = new Scanner(System.in);
		int numero1;
		do {
		
			numero1 = entrada.nextInt();
			
			switch (numero1)
			{
			  
			case 1 :
				System.out.println("Enero");
				break;
			case 2 :
				System.out.println("febrero");
				break;
			case 3 :
				System.out.println("marzo");
				break;
			case 4 :
				System.out.println("abril");
				break;
			case 5 :
				System.out.println("mayo");
				break;
			case 6 :
				System.out.println("junio");
				break;
			case 7 :
				System.out.println("julio");
				break;
			case 8 :
				System.out.println("agosto");
				break;
			case 9 :
				System.out.println("septiembre");
				break;
			case 10 :
				System.out.println("octubre");
				break;
			case 11 :
				System.out.println("noviembre");
				break;
			case 12 :
				System.out.println("diciembre");
				break;
            default : 
            	equivoco = false;
            	System.out.println("No existe el mes");
			
			}
			
		}while(equivoco);
	}


	}


