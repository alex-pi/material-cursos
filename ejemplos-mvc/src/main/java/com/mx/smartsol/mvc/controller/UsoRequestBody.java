package com.mx.smartsol.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;

/**
 * Uso de {@link RequestBody} para recibir contenido JSON de una petición.
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/ejemplos/usoreqbody")
public class UsoRequestBody {

	@RequestMapping(method=RequestMethod.GET)
	public String getVista(){
		return "reqbody/reqbody";
	}
	
	@RequestMapping(value="/registrar", method=RequestMethod.POST)
	public ModelAndView registrar(@RequestBody ClienteVO cliente){
		ServiciosClienteImpl.registrar(cliente);
		
		return new ModelAndView("reqbody/listado", "listaClientes", ServiciosClienteImpl.listar());
	}
}
