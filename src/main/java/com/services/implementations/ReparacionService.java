package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IReparacionDAO;
import com.models.Reparacion;
import com.services.interfaces.IReparacionService;
@Service("reparacionService")
@Transactional
public class ReparacionService implements IReparacionService{
	@Autowired
	private IReparacionDAO reparacionDAO;
	@Override
	public void crearReparacion(Reparacion reparacion) {
		reparacionDAO.save(reparacion);
		
	}

	@Override
	public List<Reparacion> consultarReparaciones() {
		List<Reparacion> reparaciones;
		try {
			reparaciones = reparacionDAO.findAll(Reparacion.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return reparaciones;
	}

	@Override
	public void eliminarReparacion(Long id) {
		try {
			reparacionDAO.remove(Reparacion.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editarReparacion(Reparacion reparacion) {
		reparacionDAO.save(reparacion);
		
	}

	@Override
	public Reparacion consultarReparacion(Long id) {
		Reparacion reparacion;
		try {
			reparacion = reparacionDAO.find(Reparacion.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return reparacion;
	}

}
