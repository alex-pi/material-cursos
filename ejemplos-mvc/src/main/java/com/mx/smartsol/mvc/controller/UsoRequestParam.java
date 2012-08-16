package com.mx.smartsol.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;

/**
 * El ejemplo hace uso de {@link RequestParam}
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/ejemplos/usoparams")
public class UsoRequestParam {
	
	@RequestMapping
	public ModelAndView mostrarPrincipal(){
		return new ModelAndView("params/params", "fecha", new Date());
	}
	
	@RequestMapping("/registro")
	public String getVistaRegistrar(){
		return "params/registro";
	}	
	
	@RequestMapping(value="/registrar", method=RequestMethod.POST)
	public ModelAndView registrar(@RequestParam("nombreCompleto") String nombre,
									@RequestParam String email,
									@RequestParam(required=false) Integer edad){
		ClienteVO c = new ClienteVO(nombre, email, edad);
		ServiciosClienteImpl.registrar(c);
		
		List<ClienteVO> clientes = ServiciosClienteImpl.listar();		
		return new ModelAndView("params/listado", "listaClientes", clientes);
//		return "redirect:listar";
	}	
	
	@RequestMapping("/listar")
	public ModelAndView listar(){
		List<ClienteVO> clientes = ServiciosClienteImpl.listar();
		
		return new ModelAndView("params/listado", "listaClientes", clientes);
	}
}
