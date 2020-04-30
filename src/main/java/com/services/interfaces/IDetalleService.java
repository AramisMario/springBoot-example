package com.services.interfaces;

import java.util.List;

import com.models.Detalle;

public interface IDetalleService {
	void crearDetalle(Detalle detalle);
	List<Detalle>consultarDetalles();
	void eliminarDetalle(Long id);
	void editarDetalle(Detalle detalle);
	Detalle consultarDetalle(Long id);
}
