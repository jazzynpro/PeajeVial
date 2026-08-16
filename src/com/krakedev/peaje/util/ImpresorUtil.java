package com.krakedev.peaje.util;

import com.krakedev.peaje.entidades.Vehiculo;

public class ImpresorUtil {
	public static void imprimirVehiculo (Vehiculo vehiculo) {
		
		System.out.println("INFORMACION DEL VEHICULO");
		System.out.println("Placa: " + vehiculo.getPlaca());
		System.out.println("Tipo: " + vehiculo.getTipo());

		System.out.println("PROPIETARIO");
		System.out.println("Cedula: " + vehiculo.getPropietario().getCedula());
		System.out.println("Nombre: " + vehiculo.getPropietario().getNombre());
		System.out.println("Apellido: " + vehiculo.getPropietario().getApellido());

		System.out.println("TAG ELECTRONICO");
		System.out.println("ID Tag: " + vehiculo.getTag().getIdTag());
		System.out.println("Saldo: " + vehiculo.getTag().getSaldo());
		System.out.println("Activo: " + vehiculo.getTag().isActivo());
		
	}
}
