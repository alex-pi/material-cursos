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
	}
}
