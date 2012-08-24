package com.mx.smartsol.mvc.servicios;

import java.util.List;

import com.mx.smartsol.mvc.vo.LibroVO;

public interface ServiciosLibro {

	public List<LibroVO> listar();
	
	public void registrar(LibroVO vo);
		
	public void eliminar(Long id);
	
	public LibroVO buscar(String nombre);
	
	public LibroVO buscar(Long id);
	
}
