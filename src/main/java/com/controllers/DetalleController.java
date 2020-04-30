package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Detalle;
import com.services.interfaces.IDetalleService;

public class DetalleController {
	@Autowired
	private IDetalleService detalleService;
	
	@PostMapping("/detalle")
	public Detalle guardarDetalle(@RequestBody Detalle detalle) {		
		detalleService.crearDetalle(detalle);
		
		return detalle;
	}
	
	@GetMapping("/detalleId/{id}")
	public Detalle detalle(@PathVariable("id") Long id) {
		return detalleService.consultarDetalle(id);
	}
	
	@GetMapping("/detalle")
	public List<Detalle> allDetalles(){
		return detalleService.consultarDetalles();
	}

	@PutMapping("/editarDetalle")
	public void modificar(@RequestBody Detalle detalle) {
		detalleService.editarDetalle(detalle);
	}
	
	@DeleteMapping(value="eliminarDetalle/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		detalleService.eliminarDetalle(id);
	}
}
