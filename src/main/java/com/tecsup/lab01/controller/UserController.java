package com.tecsup.lab01.controller;
import com.tecsup.*;
import com.tecsup.lab01.model.User;

public class UserController {

	User p = new User("katherine","Carrera",21);


	public void obtener() 
	{
		System.out.println("Datos:"+p.nombre+" "+p.apellPaterno+" "+p.edad);
	}
	
	
	
}
