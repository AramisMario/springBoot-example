package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IRecepcionistaDAO;
import com.models.Recepcionista;
import com.services.interfaces.IRecepcionistaService;
@Service("recepcionistaService")
@Transactional
public class RecepcionistaService implements IRecepcionistaService{
	@Autowired
	private IRecepcionistaDAO recepcionistaDAO;
	@Override
	public void crearRecepcionista(Recepcionista recepcionista) {
		recepcionistaDAO.save(recepcionista);
	}
	
	@Override
	public Recepcionista consultarRecepcionista(Long id) {
		Recepcionista recepcionista;
		try {
			recepcionista = recepcionistaDAO.find(Recepcionista.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return recepcionista;
	}

	@Override
	public List<Recepcionista> consultarRecepcionista() {
		List<Recepcionista> recepcionistas;
		try {
			recepcionistas = recepcionistaDAO.findAll(Recepcionista.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return recepcionistas;
	}

	@Override
	public void eliminarRecepcionista(Long id) {
		try {
		recepcionistaDAO.remove(Recepcionista.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editarRecepcionista(Recepcionista recepcionista) {
		recepcionistaDAO.save(recepcionista);
	}



}
