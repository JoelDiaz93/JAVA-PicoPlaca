package com.cmc.entidades;

public class Placa {
	private String letras;
	private String numeros;

	public Placa(String placa) {
		super();
		if(placa.length() == 8){
			this.letras = placa.substring(0,3);
			this.numeros = placa.substring(4,8);
		}else{
			System.out.println("ERROR: La placa debe contener 3 letras separadas por un - y 4 numeros");
		}
		
	}

	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}
	
	public String getDigito(){
		return String.valueOf(this.numeros.charAt(this.numeros.length()-1));
		
	}

	@Override
	public String toString() {
		return "Placa [" + letras + "-" + numeros + "]";
	}

}
