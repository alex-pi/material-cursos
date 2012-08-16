package com.mx.smartsol.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mx.smartsol.mvc.util.ServiciosClienteImpl;
import com.mx.smartsol.mvc.vo.ClienteVO;

/**
 * Por medio de una búsqueda el ejemplo muestra el uso de {@link PathVariable}
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/ejemplos/usopathv")
public class UsoPathVariable {

	@RequestMapping
	public String getVista(){
		return "pathvar/pathvar";
	}	
	
	@RequestMapping(value="/buscar/{nombre}")
	public ModelAndView buscar(@PathVariable String nombre){
		ClienteVO c = ServiciosClienteImpl.buscar(nombre);
		
		return new ModelAndView("pathvar/detalle","cliente",c);
	}
}
