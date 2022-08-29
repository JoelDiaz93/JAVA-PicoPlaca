package com.cmc.validar;

import com.cmc.entidades.Placa;

public class ValidarPlaca {

	public ValidarPlaca(Placa placa) {
		if (this.letras(placa) && this.numeros(placa)) {
			System.out.println(placa + " -> Formato Correcto");
		} else {
			System.out.println(placa + " -> Formato Incorrecto");
		}
	}

	public boolean letras(Placa placa) {
		boolean validar = false;

		if (placa.getLetras().length() == 3 && placa.getLetras().matches("[A-Z]*")) {
			validar = true;
		} else {
			System.out.println("ERROR: La placa debe contener 3 letras antes del (-)");
		}

		return validar;
	}

	public boolean numeros(Placa placa) {
		boolean validar = false;

		if (placa.getNumeros().length() == 4 && placa.getNumeros().matches("[0-9]*")) {
			validar = true;
		} else {
			System.out.println("ERROR: La placa debe contener 4 numeros despues del (-)");
		}

		return validar;
	}
}
