package com.eviden.ejspring.modelo.entidades;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="directorBean")
@Scope(value="prototype")
public class Director {
	private String id;
	private String nombre;
	
	public Director() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
