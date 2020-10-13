package com.tecsup.lab01.view;

import com.tecsup.lab01.controller.*;


public class UserView {

	public static void main(String[] args){
		
		UserController usuario = new UserController();
		System.out.println(usuario.obtener());
	}
}
