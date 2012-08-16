package com.mx.smartsol.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller encargado de devolver la vista principal o index de la aplicación.
 * 
 * El path colocado en la anotación @RequestMappig corresponde a la cofiguración dentro
 * del archivo web.xml
 * 
 * <pre>
 * {@code
 *   <welcome-file-list>
 *       <welcome-file>mvc/index</welcome-file>
 *   </welcome-file-list>   
 * }
 * </pre>
 * 
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {	

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    
    /**
     * Devuelve el index de la aplicación.
     * 
     * @return Un objeto String que corresponde a la vista principal de la aplicación.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String mostrarIndex(){
        
        return new String("index");
    }
	
}
