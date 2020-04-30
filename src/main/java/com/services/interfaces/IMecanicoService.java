package com.services.interfaces;

import java.util.List;

import com.models.Mecanico;

public interface IMecanicoService {
	List<Mecanico> consultarMecanicos();
	void eliminarMecanico(Long id);
	void editarMecanico(Mecanico mecanico);
	Mecanico consultarMecanico(Long id);
	void crearMecanico(Mecanico mecanico);
}
