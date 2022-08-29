package com.cmc.validar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import com.cmc.entidades.Fecha;
import com.cmc.entidades.Hora;
import com.cmc.entidades.Horario;
import com.cmc.entidades.Placa;

public class Restriccion {
	private HashMap<String, Horario> restriccion = new HashMap<String, Horario>();

	public void agregarPicoPlaca(Horario horario) {
		if (buscarHorario(horario.getFecha()) == null) {
			restriccion.put(horario.getFecha().getFormatoFecha(), horario);
		}
	}

	public Horario buscarHorario(Fecha fecha) {
		if (restriccion.containsKey(fecha.getFormatoFecha())) {
			return restriccion.get(fecha.getFormatoFecha());
		}
		return null;
	}

	@Override
	public String toString() {
		return "Restriccion [restriccion=" + restriccion + "]";
	}

	// Validadores de la restriccion de circulacion
	public String restriccionPicoPlaca(Placa placa, Fecha fecha, Hora hora) {
		Horario horario = buscarHorario(fecha);
		if (horario == null) {
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		} else {
			for (String rDigito : horario.getDigito()) {
				if (rDigito.equals(placa.getDigito())) {
					Hora[] matutino = horario.getMatutino();
					Hora[] vespertino = horario.getVespertino();
					if ((matutino[0].getHora()).before(hora.getHora())
							&& (matutino[1].getHora()).after(hora.getHora())) {
						return "CIRCULACION PROHIBIDA EN EL HORARIO\n" + horario + "\n" + placa;
					} else if ((vespertino[0].getHora()).before(hora.getHora())
							&& (vespertino[1].getHora()).after(hora.getHora())) {
						return "CIRCULACION PROHIBIDA EN EL HORARIO\n" + horario + "\n" + placa;
					} else {
						return "CIRCULACION LIMITADA TOME LA PRECAUCION NECESARIA DURANTE ESTE DIA \n" + placa;
					}
				}
			}
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		}
	}
	
	public String restriccionPicoPlaca(Placa placa, Fecha fecha) {
		Horario horario = buscarHorario(fecha);
		if (horario == null) {
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		} else {
			for (String rDigito : horario.getDigito()) {
				if (rDigito.equals(placa.getDigito())) {
					return "CIRCULACION PROHIBIDA EN EL HORARIO\n" + horario + "\n" + placa;
				}
			}
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		}
	}
	
	public String restriccionPicoPlaca(Placa placa) {
		LocalDate hoy = LocalDate.now();
		String fecha = hoy.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		Horario horario = buscarHorario(new Fecha(fecha));
		if (horario == null) {
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		} else {
			for (String rDigito : horario.getDigito()) {
				if (rDigito.equals(placa.getDigito())) {
					return "CIRCULACION PROHIBIDA EN EL HORARIO\n" + horario + "\n" + placa;
				}
			}
			return "LIBRE CIRCULACION PARA EL VEHICULO \n" + placa;
		}
	}
}
