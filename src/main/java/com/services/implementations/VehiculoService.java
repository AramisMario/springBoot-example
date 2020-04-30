package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.interfaces.IVehiculoDAO;
import com.models.Vehiculo;
import com.services.interfaces.IVehiculoService;
@Service("vehiculoService")
public class VehiculoService implements IVehiculoService {
	@Autowired
	private IVehiculoDAO vehiculoDAO;
	@Override
	public void crearVehiculo(Vehiculo vehiculo) {
		vehiculoDAO.save(vehiculo);
		
	}

	@Override
	public List<Vehiculo> consultarVehiculos() {
		List<Vehiculo> vehiculos;
		try {
			vehiculos = vehiculoDAO.findAll(Vehiculo.class);
		}catch(InstanceNotFoundException e){
			return null;
		}
		return vehiculos;
	}

	
	@Override
	public Vehiculo consultarVehiculo(Long id) {
		Vehiculo vehiculo;
		try {
			 vehiculo = vehiculoDAO.find(Vehiculo.class, id);
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		return vehiculo;
	}
	
	@Override
	public void eliminarVehiculo(Long id) {
		try {
			vehiculoDAO.remove(Vehiculo.class,id);
		}catch(InstanceNotFoundException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void editarVehiculo(Vehiculo vehiculo) {
		vehiculoDAO.save(vehiculo);
		
	}

}
