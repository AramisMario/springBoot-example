package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IServicioDAO;
import com.models.Servicio;
import com.services.interfaces.IServicioService;
@Service("servicioService")
@Transactional
public class ServicioService implements IServicioService {
	@Autowired
	private IServicioDAO servicioDAO;
	@Override
	public void crearServicio(Servicio servicio) {
		servicioDAO.save(servicio);
	}
	
	@Override
	public Servicio consultarServicio(Long id) {
		Servicio servicio;
		try {
			servicio = servicioDAO.find(Servicio.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return servicio;
	}
	
	@Override
	public List<Servicio> consultarServicios() {
		List<Servicio> servicios;
		try {
			servicios = servicioDAO.findAll(Servicio.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return servicios;
	}

	@Override
	public void eliminarServicio(Long id) {
		try {
			servicioDAO.remove(Servicio.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editarServicio(Servicio servicio) {
		servicioDAO.save(servicio);
	}

}
