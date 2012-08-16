package com.mx.smartsol.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;

/**
 * El ejemplo muestra la resolución implícita de vistas y el uso
 * de {@link ModelAttribute} sobre métodos.
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
public class UsoModelAttribute {
	
	@ModelAttribute("clienteDefault")
	public ClienteVO obtenerClienteDefault(){
		return ServiciosClienteImpl.buscar(1l);
	}

	@RequestMapping(value="/vista/implicita", method=RequestMethod.GET)
	public ModelMap resolverVistaImplicita(){
		ModelMap m = new ModelMap("fecha", new Date()); 
		
		return m;
	}

}
