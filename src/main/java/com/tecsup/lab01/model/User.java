package com.tecsup.lab01.model;

public class User {
	public String nombres;
	public String apellPaterno;
	public int edad;
	
	public User(String nombres, String apellido_paterno, int edad) {
		super();
		this.nombres = nombres;
		this.apellPaterno = apellido_paterno;
		this.edad = edad;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido_paterno() {
		return apellPaterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellPaterno = apellido_paterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
