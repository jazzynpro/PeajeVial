package com.krakedev.peaje.entidades;

import com.krakedev.peaje.servicios.EstacionPeaje;
import com.krakedev.peaje.util.ImpresorUtil;

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
		vehiculo.setTag(tag);
		//Imprimir
		vehiculo.imprimir();
		//Ejecutar ImporesotUtil
		ImpresorUtil.imprimirVehiculo(vehiculo);
		
		//Metodo probar Estacion peaje
		EstacionPeaje estacion = new EstacionPeaje();
		//Recargar Tag
		estacion.recargarTag(tag, 10);
		System.out.print("Saldo recargado: "+tag.getSaldo());
		//Cobrar Peaje
		estacion.cobrarPeaje(vehiculo);
		System.out.println("Saldo despues de cobrar peaje: " + tag.getSaldo());
		
		
		
		
		
	}
		
}
