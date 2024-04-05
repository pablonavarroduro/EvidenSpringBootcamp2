package com.eviden.ejspring.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eviden.ejspring.modelo.entidades.Pelicula;
import com.eviden.ejspring.modelo.persistencia.DaoPeliculas;

@Service
public class GestorPeliculas {
	@Autowired
	private DaoPeliculas daoPelicula;
	
	public void insertarPelicula(Pelicula p) {
		this.daoPelicula.insertar(p);		
	}
	
	public List<Pelicula> listar(){
		return this.daoPelicula.listar();
	}
}
