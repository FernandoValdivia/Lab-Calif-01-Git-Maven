package com.tecsup.lab01.controller;
import com.tecsup.*;
import com.tecsup.lab01.model.User;

public class UserController {

	User p = new User("Pepe","Rodriguez",21);


	public String obtener() 
	{
		return "Datos:"+p.nombre+" "+p.apellPaterno+" "+p.edad;
	}
	
	
	
}
