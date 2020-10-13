package com.tecsup.lab01.model;

public class User {

	
	public String nombre;
	public String apellPaterno;
	public int edad;

	public User(String nombre, String apellPaterno, int edad) {
		super();
		this.nombre = nombre;
		this.apellPaterno = apellPaterno;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellPaterno() {
		return apellPaterno;
	}
	public void setApellPaterno(String apellPaterno) {
		this.apellPaterno = apellPaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
