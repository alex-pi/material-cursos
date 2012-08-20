package com.mx.smartsol.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ejemplos/usorm")
public class UsoRequestMapping {
	
	@RequestMapping
	public String getVista(){
		return "usorm/usorm";
	}

	@RequestMapping(value="/registro/cliente", method=RequestMethod.GET)
	public String registro(HttpServletRequest request){
		String qs = request.getRequestURL().toString();
		
		String vista = "usorm/default";
		if(qs.indexOf("cliente") != -1){
			vista = "usorm/cliente";
		} else if(qs.indexOf("producto") != -1) {
			vista = "usorm/producto";
		}
		
		return vista;
	}
}
