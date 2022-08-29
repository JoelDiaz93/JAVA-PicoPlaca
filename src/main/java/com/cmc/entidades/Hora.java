package com.cmc.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {
	private Date hora;
	
	public Hora(String hora) {
		try {
			this.hora = new SimpleDateFormat("HH:mm").parse(hora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	public String getFormatoHora(){
		SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
		String fechaFormato = formato.format(this.hora);
		return fechaFormato;
	}

	@Override
	public String toString() {
		return "Hora [" + this.getFormatoHora() + "]";
	}
	
	
	
}
