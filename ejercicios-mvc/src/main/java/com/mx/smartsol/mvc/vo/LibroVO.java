package com.mx.smartsol.mvc.vo;

public class LibroVO {

	private Long id;
	private String titulo;
	private String autor;
	private String isbn;
	private Integer anio;
	
	public LibroVO(){}
	
	public LibroVO(String titulo, String autor, String isbn, Integer anio) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anio = anio;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	
}
