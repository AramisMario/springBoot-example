package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Reparacion;
import com.services.interfaces.IReparacionService;

public class ReparacionController {
	@Autowired
	private IReparacionService reparacionService;
	
	@PostMapping("/reparacion")
	public Reparacion guardarDetalle(@RequestBody Reparacion reparacion) {		
		reparacionService.crearReparacion(reparacion);
		
		return reparacion;
	}
	
	@GetMapping("/reparacionId/{id}")
	public Reparacion reparacion(@PathVariable("id") Long id) {
		return reparacionService.consultarReparacion(id);
	}
	
	@GetMapping("/reparaciones")
	public List<Reparacion> allReparaciones(){
		return reparacionService.consultarReparaciones();
	}

	@PutMapping("/reparacionDetalle")
	public void modificar(@RequestBody Reparacion reparacion) {
		reparacionService.editarReparacion(reparacion);
	}
	
	@DeleteMapping(value="eliminarReparacion/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		reparacionService.eliminarReparacion(id);
	}
}
