package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.models.Mecanico;
import com.services.interfaces.IMecanicoService;
public class MecanicoController {
	@Autowired
	private IMecanicoService mecanicoService;
	
	@PostMapping("/mecanico")
	public Mecanico guardarMecanico(@RequestBody Mecanico mecanico) {		
		mecanicoService.crearMecanico(mecanico);
		
		return mecanico;
	}
	
	@GetMapping("/mecanicoId/{id}")
	public Mecanico mecanico(@PathVariable("id") Long id) {
		return mecanicoService.consultarMecanico(id);
	}
	
	@GetMapping("/mecanicos")
	public List<Mecanico> allMecanicos(){
		return mecanicoService.consultarMecanicos();
	}

	@PutMapping("/editarMecanico")
	public void modificar(@RequestBody Mecanico mecanico) {
		mecanicoService.editarMecanico(mecanico);
	}
	
	@DeleteMapping(value="eliminarMecanico/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		mecanicoService.eliminarMecanico(id);
	}
}
