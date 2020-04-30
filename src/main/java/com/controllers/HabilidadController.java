package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Habilidad;
import com.services.interfaces.IHabilidadService;

public class HabilidadController {
	@Autowired
	private IHabilidadService habilidadService;
	
	@PostMapping("/habilidad")
	public Habilidad guardarDetalle(@RequestBody Habilidad habilidad) {		
		habilidadService.crearHabilidad(habilidad);
		
		return habilidad;
	}
	
	@GetMapping("/habilidadeId/{id}")
	public Habilidad habilidad(@PathVariable("id") Long id) {
		return habilidadService.consultarHabilidad(id);
	}
	
	@GetMapping("/habilidades")
	public List<Habilidad> allHabilidades(){
		return habilidadService.consultarHabilidades();
	}

	@PutMapping("/editarHabilidad")
	public void modificar(@RequestBody Habilidad habilidad) {
		habilidadService.editarHabilidad(habilidad);
	}
	
	@DeleteMapping(value="eliminarHabilidad/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		habilidadService.eliminarHabilidad(id);
	}
}
