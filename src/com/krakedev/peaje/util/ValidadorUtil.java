package com.krakedev.peaje.util;

public class ValidadorUtil {
	//Metodo esMontoValido
	public boolean esMontoValido(double monto) {
		if(monto > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//Metodo esTipoValido
	public boolean esTipoValido(String tipo) {
		if(tipo.equals("L") || tipo.equals("P")) {
			return true;
		}else {
			return false;
		}
	}
}
