package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Recepcionista;
import com.services.interfaces.IRecepcionistaService;

public class RecepcionistaController {
	@Autowired
	private IRecepcionistaService recepcionistaService;
	
	@PostMapping("/recepcionista")
	public Recepcionista guardarRecepcionista(@RequestBody Recepcionista recepcionista) {		
		recepcionistaService.crearRecepcionista(recepcionista);
		
		return recepcionista;
	}
	
	@GetMapping("/recepcionistaId/{id}")
	public Recepcionista recepcionista(@PathVariable("id") Long id) {
		return recepcionistaService.consultarRecepcionista(id);
	}
	
	@GetMapping("/recepcionistas")
	public List<Recepcionista> allRecepcionistas(){
		return recepcionistaService.consultarRecepcionista();
	}

	@PutMapping("/editarRecepcionista")
	public void modificar(@RequestBody Recepcionista recepcionista) {
		recepcionistaService.editarRecepcionista(recepcionista);
	}
	
	@DeleteMapping(value="eliminarRecepcionista/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		recepcionistaService.eliminarRecepcionista(id);
	}
}
