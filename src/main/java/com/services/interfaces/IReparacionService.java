package com.services.interfaces;

import java.util.List;

import com.models.Reparacion;

public interface IReparacionService {
	void crearReparacion(Reparacion reparacion);
	List<Reparacion>consultarReparaciones();
	void eliminarReparacion(Long id);
	void editarReparacion(Reparacion reparacion);
	Reparacion consultarReparacion(Long id);
}
