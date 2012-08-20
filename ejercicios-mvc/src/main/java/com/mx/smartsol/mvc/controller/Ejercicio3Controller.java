package com.mx.smartsol.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ej3")
public class Ejercicio3Controller {

	@RequestMapping(method=RequestMethod.GET)
	public String getVista(){
		return "ejercicio3/index";
	}
	
}
