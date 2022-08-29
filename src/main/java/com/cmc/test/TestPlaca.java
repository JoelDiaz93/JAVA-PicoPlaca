package com.cmc.test;

import com.cmc.entidades.Placa;
import com.cmc.validar.ValidarPlaca;

public class TestPlaca {
	public static void main(String[] args) {
		Placa p1 = new Placa("ABC-0123");
		ValidarPlaca v1 = new ValidarPlaca(p1);
		
		Placa p2 = new Placa("A3C-0123");
		ValidarPlaca v2 = new ValidarPlaca(p2);
		
		Placa p3 = new Placa("ABC-F123");
		ValidarPlaca v3 = new ValidarPlaca(p3);
	}
}
