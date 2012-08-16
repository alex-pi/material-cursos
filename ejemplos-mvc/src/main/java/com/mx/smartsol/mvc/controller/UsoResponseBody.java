package com.mx.smartsol.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;

/**
 * Uso de {@link ResponseBody} para recibir contenido JSON de una petición.
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/ejemplos/usoresbody")
public class UsoResponseBody {

	@RequestMapping(method=RequestMethod.GET)
	public String getVista(){
		return "resbody/resbody";
	}
	
	@RequestMapping(value="/buscar", method=RequestMethod.POST)
	@ResponseBody
	public ClienteVO registrar(@RequestBody String nombre){
		return ServiciosClienteImpl.buscar(nombre);
	}
}
