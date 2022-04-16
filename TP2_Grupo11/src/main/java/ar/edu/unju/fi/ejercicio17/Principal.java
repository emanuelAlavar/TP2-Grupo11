package ar.edu.unju.fi.ejercicio17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
		
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(1999, 9, 2), LocalDate.of(2022, 4, 10)); //b.1
		System.out.println("Fecha 1: "+pf1.getFecha1()+"\n"+"Fecha 2: "+pf1.getFecha2());
		
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(12, 20), LocalTime.of(16, 40)); //b.2
		pf2.setTime1(pf2.getTime1().minusHours(-5));
		pf2.setTime2(pf2.getTime2().minusMinutes(20));
		System.out.println("Time 1: "+pf2.getTime1()+"\n"+"Time 2: "+pf2.getTime2());
		
		pf1.compararFechas(); //b.3
		
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(pf1.getFecha1(), pf2.getTime1()), LocalDateTime.of(pf1.getFecha2(), pf2.getTime2())); //b.4
		System.out.println("Fecha y Time 1: "+pf3.getDateTime1()+"\n"+"Fecha y Time 2: "+pf3.getDateTime2());
		
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(1999, 9, 2), LocalDate.of(2022, 4, 14)); //b.5
		System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()+" años, "+pf4.contarTiempoTranscurrido().getMonths()+" meses, y "+pf4.contarTiempoTranscurrido().getDays()+" días desde la fecha "+pf4.formatearFecha(pf4.getFecha1())+" hasta la fecha "+pf4.formatearFecha(pf4.getFecha2()));
		
		boolean error; //b.6
		ProcesoFecha pf5 = new ProcesoFecha();
		Scanner lector = new Scanner(System.in);
		do{
			error = false;
			try {
				System.out.println("Ingrese una primer fecha con formato dd/MM/yyyy");
				String input = lector.next();
				SimpleDateFormat formatear = new SimpleDateFormat("dd/MM/yyyy");
				Date fecha = formatear.parse(input);
				LocalDate localFecha = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				pf5.setFecha1(localFecha);
				LocalDate var1 = pf5.getFecha1().minusDays(-365);
				System.out.println(var1);
				System.out.println("Ingrese una segunda fecha con formato dd/MM/yyyy");
				input = lector.next();
				fecha = formatear.parse(input);
				localFecha = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				pf5.setFecha2(localFecha);
				LocalDate var2 = pf5.getFecha2().minusMonths(6);
				System.out.println(var2);
			} catch (ParseException | DateTimeException e) {
				System.out.println("Ingresó una fecha erronea");
				error = true; }
		} while (error);
		lector.close();
		System.out.println("El programa ha finalizado con éxito");
		System.exit(0);
	}

}
