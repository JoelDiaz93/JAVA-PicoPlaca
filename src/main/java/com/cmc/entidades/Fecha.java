package com.cmc.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
	private Date fecha;
	
	public Fecha(String fecha) {
		try {
			this.fecha = new SimpleDateFormat("yyyy/MM/dd").parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getFormatoFecha(){
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		String fechaFormato = formato.format(this.fecha);
		return fechaFormato;
	}

	@Override
	public String toString() {
		return "Fecha [" + this.getFormatoFecha() + "]";
	}
	
	
}
