package com.mantenimiento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personas {
	
	@Id
	private int IdPersona;
    
	@Column(name = "nombre",length = 50)
	private String nombre;

	@Column(name = "apellido",length = 50)
	private String apellido;
	
	public String getApellido() {
		return apellido;
	}
	
	public int getIdPersona() {
		return IdPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
