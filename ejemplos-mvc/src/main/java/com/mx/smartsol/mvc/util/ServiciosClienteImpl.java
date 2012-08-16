package com.mx.smartsol.mvc.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mx.smartsol.mvc.vo.ClienteVO;

public class ServiciosClienteImpl {

	private static Map<Long, ClienteVO> cacheClientes = new HashMap<Long, ClienteVO>();
	private static Long seqId = new Long(0);
	
	public static List<ClienteVO> listar(){		
		return new ArrayList<ClienteVO>(cacheClientes.values());
	}
	
	public static void registrar(ClienteVO vo){
		seqId++;
		vo.setId(seqId);		
		cacheClientes.put(seqId, vo);
	}
	
	public static ClienteVO buscar(String nombre){
		Collection<ClienteVO> col = cacheClientes.values();
		for (ClienteVO c : col) {
			if(c.getNombreCompleto().indexOf(nombre) != -1){
				return c;
			}				
		}
		return null;
	}
	
	public static ClienteVO buscar(Long id){
		return cacheClientes.get(id);
	}
	
	static {
		ClienteVO cDefault = new ClienteVO("Carlos Urbina", "curb@gmail.com", 30);
		registrar(cDefault);
	}
}
