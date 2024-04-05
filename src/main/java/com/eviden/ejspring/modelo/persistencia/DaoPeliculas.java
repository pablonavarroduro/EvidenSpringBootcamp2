package com.eviden.ejspring.modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.eviden.ejspring.modelo.entidades.Pelicula;

@Repository
public class DaoPeliculas {
	@Autowired
	@Qualifier("listaPeliculas")
	private List<Pelicula> listaPeliculas;
	
	public void insertar(Pelicula p) {
		this.listaPeliculas.add(p);
	}
	
	public List<Pelicula> listar(){
		return this.listaPeliculas;
	}
}
