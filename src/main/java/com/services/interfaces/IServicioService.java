package com.services.interfaces;

import java.util.List;

import com.models.Servicio;

public interface IServicioService {
	void crearServicio(Servicio servicio);
	List<Servicio>consultarServicios();
	void eliminarServicio(Long id);
	void editarServicio(Servicio servicio);
	Servicio consultarServicio(Long id);
}
