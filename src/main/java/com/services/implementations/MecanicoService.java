package com.services.implementations;

import java.util.List;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interfaces.IMecanicoDAO;
import com.models.Mecanico;
import com.services.interfaces.IMecanicoService;
@Service("mecanicoService")
@Transactional
public class MecanicoService implements IMecanicoService{
	@Autowired
	private  IMecanicoDAO mecanicoDAO;
	@Override
	public void crearMecanico(Mecanico mecanico) {
		mecanicoDAO.save(mecanico);
		
	}
	
	@Override
	public Mecanico consultarMecanico(Long id) {
		Mecanico mecanico;
		try {
			mecanico = mecanicoDAO.find(Mecanico.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return mecanico;
	}
	
	@Override
	public List<Mecanico> consultarMecanicos() {
		List<Mecanico> mecanicos;
		try {
			mecanicos = mecanicoDAO.findAll(Mecanico.class);
		}catch(InstanceNotFoundException e) {
			return null;
		}
		return mecanicos;
	}

	@Override
	public void eliminarMecanico(Long id) {
		try {
			mecanicoDAO.remove(Mecanico.class,id);
		}catch(InstanceNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editarMecanico(Mecanico mecanico) {
		mecanicoDAO.save(mecanico);
	}

}
