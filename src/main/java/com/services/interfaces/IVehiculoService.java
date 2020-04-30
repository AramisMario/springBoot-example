package com.services.interfaces;

import java.util.List;

import com.models.Usuario;
import com.models.Vehiculo;

public interface IVehiculoService {
	void crearVehiculo(Vehiculo vehiculo);
	List<Vehiculo> consultarVehiculos();
	void eliminarVehiculo(Long id);
	void editarVehiculo(Vehiculo vehiculo);
	Vehiculo consultarVehiculo(Long id);
}
