package com.cmc.test;

import com.cmc.entidades.Fecha;
import com.cmc.entidades.Hora;
import com.cmc.entidades.Horario;
import com.cmc.entidades.Placa;
import com.cmc.validar.Restriccion;

public class TestRestrccion {

	public static void main(String[] args) {
		Restriccion restriccion = new Restriccion();
		restriccion.agregarPicoPlaca(new Horario(new Fecha("2022/08/18"), new Hora("06:00"), new Hora("09:00"), new Hora("16:00"), new Hora("21:00"), "7", "8"));
		
		System.out.println("Test con 3 parametros Placa, Fecha, Hora --------------------------------------------");
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0123"), new Fecha("2022/08/18"), new Hora("07:00")));
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0120"), new Fecha("2022/08/18"), new Hora("10:00")));
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0127"), new Fecha("2022/08/18"), new Hora("07:00")));
		
		System.out.println("Test con 2 parametros Placa, Fecha --------------------------------------------");
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0123"), new Fecha("2022/08/18")));
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0120"), new Fecha("2022/08/18")));
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0129"), new Fecha("2022/08/18")));
		
		
		System.out.println("Test con 1 parametro Placa --------------------------------------------");
		System.out.println(restriccion.restriccionPicoPlaca(new Placa("ABC-0129")));

	}

}
