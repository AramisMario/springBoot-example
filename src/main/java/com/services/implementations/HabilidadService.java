package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IHabilidadDAO;
import com.models.Habilidad;
import com.services.interfaces.IHabilidadService;
@Service("habilidadService")
@Transactional
public class HabilidadService implements IHabilidadService{
	@Autowired
	private IHabilidadDAO habilidadDAO;
	@Override
	public void crearHabilidad(Habilidad habilidad) {
		habilidadDAO.save(habilidad);
		
	}

	@Override
	public List<Habilidad> consultarHabilidades() {
		List<Habilidad> habilidades;
		try {
			habilidades = habilidadDAO.findAll(Habilidad.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return habilidades;
	}

	@Override
	public void eliminarHabilidad(Long id) {
		try {
			habilidadDAO.remove(Habilidad.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void editarHabilidad(Habilidad habilidad) {
		habilidadDAO.save(habilidad);
		
	}

	@Override
	public Habilidad consultarHabilidad(Long id) {
		Habilidad habilidad;
		try {
			habilidad = habilidadDAO.find(Habilidad.class, id);
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		return habilidad;
		
	}

}
