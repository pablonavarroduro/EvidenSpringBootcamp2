package com.eviden.ejspring.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eviden.ejspring.modelo.entidades.Pelicula;
import com.eviden.ejspring.modelo.negocio.GestorPeliculas;

public class Main {

	public static void main(String[] args) {
			ApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
			// prueba de funcionamiento de beans en el contexto de Spring
			
			// en caso de no especificar el nombre del bean en el xml se usa el nombre de la clase con la primera en minuscula
			Pelicula pelicula = ctxt.getBean("pelicula", Pelicula.class);
			pelicula.setId("1");
			pelicula.setTitulo("Titulo 1");
			// al estar el director inyectado en pelicula podemos tratar con el a traves del bean pelicula
			pelicula.getDirector().setId("1");
			pelicula.getDirector().setNombre("Director 1");
			
//			System.out.println(pelicula.toString());
			// A su vez el gestor de la capa de negocio se comunicara con la de persistencia 
			GestorPeliculas gp = ctxt.getBean("gestorPeliculas", GestorPeliculas.class);
			gp.insertarPelicula(pelicula);
			
			List<Pelicula> lp = gp.listar();
			for (Pelicula pelicula2 : lp) {
				System.out.println(pelicula2.toString());
			}
			
	}

}
