package com.mx.smartsol.mvc.vo;

public class ClienteVO {

	private Long id;
	private String nombreCompleto;
	private String email;
	private Integer edad;
	
	public ClienteVO(){}
	
	public ClienteVO(String nombreCompleto, String email, Integer edad) {
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.edad = edad;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
