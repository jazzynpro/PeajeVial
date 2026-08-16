package com.krakedev.peaje.entidades;

public class TestVehiculo {

	public static void main(String[] args) {
		//Crear conductor
		Conductor conductor = new Conductor("1723879662", "Cynthia" ,"Cacuango");
		//Crear vehiculo
		Vehiculo vehiculo = new Vehiculo("PQZ0689");
		//Crear Tag
		TagElectronico tag = new TagElectronico("125415");
		
		//Asociar objetos mediante composicion
		vehiculo.setPropietario(conductor);
		vehiculo.setTag(null);
		//Imprimir
		vehiculo.imprimir();
	}

}
