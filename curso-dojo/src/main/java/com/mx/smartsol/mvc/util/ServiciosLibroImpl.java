package com.mx.smartsol.mvc.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mx.smartsol.mvc.vo.LibroVO;

public class ServiciosLibroImpl {

	private static Map<Long, LibroVO> cacheLibros = new HashMap<Long, LibroVO>();
	private static Long seqId = new Long(0);
	
	public static List<LibroVO> listar(){		
		return new ArrayList<LibroVO>(cacheLibros.values());
	}
	
	public static void registrar(LibroVO vo){
		seqId++;
		vo.setId(seqId);		
		cacheLibros.put(seqId, vo);
	}
		
	public static void eliminar(Long id){	
		cacheLibros.remove(id);
	}
	
	public static LibroVO buscar(String nombre){
		Collection<LibroVO> col = cacheLibros.values();
		for (LibroVO c : col) {
			if(c.getIsbn().indexOf(nombre) != -1){
				return c;
			}				
		}
		return null;
	}
	
	public static LibroVO buscar(Long id){
		return cacheLibros.get(id);
	}
	
	static {
		LibroVO cDefault = new LibroVO("La segunda muerte de la revolución", "Lorenzo Meyer", "GFGFSER232", 1997);
		registrar(cDefault);
		LibroVO l2 = 
				new LibroVO("JavaScript The Good Parts", "Crockford", "343dsfs", 2003);
		registrar(l2);	
		LibroVO l3 = 
				new LibroVO("Issac Asimov", "Segunda Fundación", "5675dfgd", 1955);
		registrar(l3);	
		LibroVO l4 = 
				new LibroVO("Philip K. Dick", "Doctor Strangelove", "435sddg", 1955);
		registrar(l4);		
	}
}
