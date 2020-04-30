package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Vehiculo;
import com.services.interfaces.IVehiculoService;

@RestController
public class VehiculoController {
	@Autowired
	private IVehiculoService vehiculoService;
	
	@PostMapping("/vehiculo")
	public Vehiculo guardarVehiculo(@RequestBody Vehiculo vehiculo) {
		vehiculoService.crearVehiculo(vehiculo);
		return vehiculo;
	}
	
	@GetMapping("/vehiculoId/{id}")
	public Vehiculo buscar(@PathVariable("id") Long id) {
		return vehiculoService.consultarVehiculo(id);
	}
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> allVehiculos(){
		return vehiculoService.consultarVehiculos();
	}

	@PutMapping("/editarVehiculo")
	public void modificar(@RequestBody Vehiculo vehiculo) {
		vehiculoService.editarVehiculo(vehiculo);
	}
}
