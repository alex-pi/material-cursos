package com.mx.smartsol.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.smartsol.mvc.util.ServiciosLibroImpl;
import com.mx.smartsol.mvc.vo.LibroVO;

@Controller
@RequestMapping("/ej5")
public class Ejercicio5Controller {

	@RequestMapping(method=RequestMethod.GET)
	public String getVista(){
		return "ejercicio5/index";
	}
//	
//	@RequestMapping(value ="/registrar", method=RequestMethod.POST)
//	public ModelAndView registrar(@RequestBody LibroVO libro){
//		ServiciosLibroImpl.registrar(libro);
//		List<LibroVO> libros = ServiciosLibroImpl.listar();
//		
//		return new ModelAndView("ejercicio5/listado","listaLibros",libros);
//	}
	
	
	@RequestMapping(value ="/registrar", method=RequestMethod.POST)
	@ResponseBody
	public List<LibroVO> registrar(@RequestBody LibroVO libro){
		ServiciosLibroImpl.registrar(libro);
		List<LibroVO> libros = ServiciosLibroImpl.listar();
		
		return libros;
	}	
}
