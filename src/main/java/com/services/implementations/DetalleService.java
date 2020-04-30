package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IDetalleDAO;
import com.models.Detalle;
import com.services.interfaces.IDetalleService;
@ComponentScan("com.dao")
@Service("detalleService")
@Transactional
public class DetalleService implements IDetalleService{
	@Autowired
	private IDetalleDAO detalleDAO;
	@Override
	public void crearDetalle(Detalle detalle) {
		detalleDAO.save(detalle);
	}

	@Override
	public List<Detalle> consultarDetalles() {
		List<Detalle> detalles;
		try {
			detalles = detalleDAO.findAll(Detalle.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return detalles;
	}

	@Override
	public void eliminarDetalle(Long id) {
		try {
			detalleDAO.remove(Detalle.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void editarDetalle(Detalle detalle) {
		detalleDAO.save(detalle);
		
	}

	@Override
	public Detalle consultarDetalle(Long id) {
		Detalle detalle;
		try {
			detalle = detalleDAO.find(Detalle.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return detalle;
	}

}
