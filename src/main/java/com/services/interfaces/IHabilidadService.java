package com.services.interfaces;

import java.util.List;

import com.models.Habilidad;

public interface IHabilidadService {
	void crearHabilidad(Habilidad habilidad);
	List<Habilidad>consultarHabilidades();
	void eliminarHabilidad(Long id);
	void editarHabilidad(Habilidad habilidad);
	Habilidad consultarHabilidad(Long id);
}
