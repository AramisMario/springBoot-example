package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Servicio;
import com.services.interfaces.IServicioService;

public class ServicioController {
	@Autowired
	private IServicioService servicioService;
	
	@PostMapping("/servicio")
	public Servicio guardarServicio(@RequestBody Servicio mecanico) {		
		servicioService.crearServicio(mecanico);
		
		return mecanico;
	}
	
	@GetMapping("/servicioId/{id}")
	public Servicio servicio(@PathVariable("id") Long id) {
		return servicioService.consultarServicio(id);
	}
	
	@GetMapping("/servicio")
	public List<Servicio> allServicios(){
		return servicioService.consultarServicios();
	}

	@PutMapping("/editarServicio")
	public void modificar(@RequestBody Servicio mecanico) {
		servicioService.editarServicio(mecanico);
	}
	
	@DeleteMapping(value="eliminarServicio/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		servicioService.eliminarServicio(id);
	}
}
