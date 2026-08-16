package com.krakedev.peaje.entidades;

public class Conductor {
	//Atributos
	private String cedula;
	private String nombre;
	private String apellido;
	
	//Constructor vacio
		public Conductor() {
		}
	
	//Constructor recibe cedula nombre y apellido
	public Conductor(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	
	//Getters y Setters
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Metodo imprimir
	public void imprimir() {
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: "+nombre);
		System.out.print("Apellido: "+apellido);
	}
	
	
}
