package com.mx.smartsol.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.util.ServiciosLibroImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;
import com.mx.smartsol.mvc.vo.LibroVO;

@Controller
@RequestMapping("/clientes")
public class EjemplosDojoController {
	
	@RequestMapping(value="/{id}")
	@ResponseBody
	public ClienteVO buscar(@PathVariable Long id) throws InterruptedException{
		Thread.sleep((int)(1000*id));
		ClienteVO c = ServiciosClienteImpl.buscar(id);
		
		return c;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<ClienteVO> listarClientes(){
		return ServiciosClienteImpl.listar();
	}
	
	@RequestMapping(value="/libros", method=RequestMethod.GET)
	@ResponseBody
	public List<LibroVO> listarLibros(){
		return ServiciosLibroImpl.listar();
	}	
}