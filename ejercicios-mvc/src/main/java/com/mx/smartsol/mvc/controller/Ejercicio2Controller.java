package com.mx.smartsol.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mx.smartsol.mvc.util.ServiciosLibroImpl;
import com.mx.smartsol.mvc.vo.LibroVO;

@Controller
@RequestMapping(value="/ej2")
public class Ejercicio2Controller {

	@RequestMapping(method=RequestMethod.GET)
	public String getVista(){
		return "ejercicio2/index";
	}
	
	@RequestMapping(value ="/registro", method=RequestMethod.GET)
	public String getVistaRegistro(){
		return "ejercicio2/registro";
	}	
	
//	@RequestMapping(value ="/registrar", method=RequestMethod.POST)
//	public String registrar(@RequestParam String titulo,
//			@RequestParam String autor,
//			@RequestParam String isbn,
//			@RequestParam Integer anio){
//		LibroVO libro = new LibroVO(titulo, autor, isbn, anio);
//		ServiciosLibroImpl.registrar(libro);
//		
//		return "ejercicio2/index";
//	}	
	
	@RequestMapping(value ="/registrar", method=RequestMethod.POST)
	public String registrar(@ModelAttribute LibroVO libro){
		ServiciosLibroImpl.registrar(libro);
		
		return "ejercicio2/index";
	}
	
	@RequestMapping(value ="/listado", method=RequestMethod.GET)
	public ModelAndView getListado(){
		List<LibroVO> libros = ServiciosLibroImpl.listar();
		
		return new ModelAndView
				("ejercicio2/listado", "listaLibros", libros);
	}	
	
	@RequestMapping("/libro/{idLibro}")
	public ModelAndView buscar(@PathVariable Long idLibro){
		LibroVO libro = ServiciosLibroImpl.buscar(idLibro);
		
		return new ModelAndView("ejercicio2/detalle", "libro", libro);
	}
		
	@RequestMapping("/libro/eliminar/{idLibro}")
	public String eliminar(@PathVariable Long idLibro){
		ServiciosLibroImpl.eliminar(idLibro);
		
		return "redirect:/mvc/ej2/listado";
	}	
}
