package com.cmc.entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class Horario {
	private Fecha fecha;
	private Hora[] matutino = new Hora[2];
	private Hora[] vespertino = new Hora[2];
	private ArrayList<String> digito;

	public Horario(Fecha fecha, Hora matutino1, Hora matutino2, Hora vespertino1, Hora vespertino2, String digito1,
			String digito2) {
		super();
		this.fecha = fecha;
		this.matutino[0] = matutino1;
		this.matutino[1] = matutino2;
		this.vespertino[0] = vespertino1;
		this.vespertino[1] = vespertino2;
		digito = new ArrayList<String>();
		this.digito.add(digito1);
		this.digito.add(digito2);
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora[] getMatutino() {
		return matutino;
	}

	public void setMatutino(Hora[] matutino) {
		this.matutino = matutino;
	}

	public Hora[] getVespertino() {
		return vespertino;
	}

	public void setVespertino(Hora[] vespertino) {
		this.vespertino = vespertino;
	}

	public ArrayList<String> getDigito() {
		return digito;
	}

	public void setDigito(ArrayList<String> digito) {
		this.digito = digito;
	}

	@Override
	public String toString() {
		return "----------- HORARIO -----------\n" + fecha + "\nMatutino=" + Arrays.toString(matutino) + "\nVespertino="
				+ Arrays.toString(vespertino) + "\nDigitos=" + digito+"\n---------------------------------\n";
	}
	
	

}
