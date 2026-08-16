package com.krakedev.peaje.servicios;

import com.krakedev.peaje.entidades.Conductor;
import com.krakedev.peaje.entidades.TagElectronico;
import com.krakedev.peaje.entidades.Vehiculo;
import com.krakedev.peaje.util.ValidadorUtil;


public class EstacionPeaje {
	//Atributos
	private int codigoEstacion = 500;
	private double tarifaLiviano = 1.00;
	private double tarifaPesado = 2.50;
	
	// Constructor vacío
		public EstacionPeaje() {
		}
	
	//Getters y Setters
	public int getCodigoEstacion() {
		return codigoEstacion;
	}
	public void setCodigoEstacion(int codigoEstacion) {
		this.codigoEstacion = codigoEstacion;
	}
	public double getTarifaLiviano() {
		return tarifaLiviano;
	}
	public void setTarifaLiviano(double tarifaLiviano) {
		this.tarifaLiviano = tarifaLiviano;
	}
	public double getTarifaPesado() {
		return tarifaPesado;
	}
	public void setTarifaPesado(double tarifaPesado) {
		this.tarifaPesado = tarifaPesado;
	}
	
	//Metodos de negocio
	public Vehiculo registrarVehiculo(String placa, String tipo, Conductor conductor, String idTag) {
		
		ValidadorUtil validador = new ValidadorUtil();

		if (!validador.esTipoValido(tipo)) {
			System.out.println("Este tipo de vehiculo no es valido.");
			return null; 
		}

		Vehiculo vehiculo = new Vehiculo(placa);

		vehiculo.setTipo(tipo);
		vehiculo.setPropietario(conductor);

		TagElectronico tag = new TagElectronico(idTag);

		vehiculo.setTag(tag);

		return vehiculo;
	}
	
	public void recargarTag(TagElectronico tag, double monto) {

		ValidadorUtil validador = new ValidadorUtil();

		if (!validador.esMontoValido(monto)) {
			System.out.println("El monto no es valido.");
			return;
		}

		tag.setSaldo(tag.getSaldo() + monto);
	}
	
	public void cobrarPeaje(Vehiculo vehiculo) {

		String tipo = vehiculo.getTipo();

		double tarifa;

		if (tipo.equals("L")) {
			tarifa = tarifaLiviano;
		} else {
			tarifa = tarifaPesado;
		}

		TagElectronico tag = vehiculo.getTag();

		double saldo = tag.getSaldo();

		if (saldo < tarifa) {
			System.out.println("Saldo insuficiente.");
			return;
		}

		tag.setSaldo(saldo - tarifa);

		System.out.println("Peaje cobrado: $" + tarifa);
	}
	
	public void transferirSaldoTag(TagElectronico origen, TagElectronico destino, double monto) {

		double saldoOrigen = origen.getSaldo();

		if (saldoOrigen < monto) {
			System.out.println("Saldo insuficiente.");
			return;
		}

		origen.setSaldo(saldoOrigen - monto);

		double saldoDestino = destino.getSaldo();

		destino.setSaldo(saldoDestino + monto);

		System.out.println("Transferencia realizada correctamente.");
	}
}
