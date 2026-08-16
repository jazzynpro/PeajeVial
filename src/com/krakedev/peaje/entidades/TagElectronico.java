package com.krakedev.peaje.entidades;

public class TagElectronico {
	//Atributos
	private String idTag;
	private double saldo;
	private boolean activo;
	//Constructor Vacio
	public TagElectronico() {
	}
	//Constructor principal
	public TagElectronico(String idTag) {
		this.idTag = idTag;
		this.saldo = 0;
		this.activo = true;
	}
	
	//Getters and Setters
	public String getIdTag() {
		return idTag;
	}
	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	//Metodo Imprimir
	public void imprimir() {
		System.out.println("ID Tag: "+idTag);
		System.out.println("Saldo: "+saldo);
		System.out.println("Activo: "+activo);
	}
}
