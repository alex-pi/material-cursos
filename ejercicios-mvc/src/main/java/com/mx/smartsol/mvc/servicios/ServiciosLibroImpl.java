package com.mx.smartsol.mvc.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mx.smartsol.mvc.vo.LibroVO;

@Service
public class ServiciosLibroImpl implements ServiciosLibro {

	private static Map<Long, LibroVO> cacheLibros = new HashMap<Long, LibroVO>();
	private static Long seqId = new Long(0);
	
	public List<LibroVO> listar(){		
		return new ArrayList<LibroVO>(cacheLibros.values());
	}
	
	public void registrar(LibroVO vo){
		seqId++;
		vo.setId(seqId);		
		cacheLibros.put(seqId, vo);
	}
		
	public void eliminar(Long id){	
		cacheLibros.remove(id);
	}
	
	public LibroVO buscar(String nombre){
		Collection<LibroVO> col = cacheLibros.values();
		for (LibroVO c : col) {
			if(c.getIsbn().indexOf(nombre) != -1){
				return c;
			}				
		}
		return null;
	}
	
	public LibroVO buscar(Long id){
		return cacheLibros.get(id);
	}
	
	static {
		LibroVO cDefault = new LibroVO("La segunda muerte de la revolución", "Lorenzo Meyer", "GFGFSER232", 1997);
		seqId++;
		cDefault.setId(seqId);		
		cacheLibros.put(seqId, cDefault);
	}
}
