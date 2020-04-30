package com.services.interfaces;

import java.util.List;

import com.models.Recepcionista;

public interface IRecepcionistaService {
	void crearRecepcionista(Recepcionista recepcionista);
	List<Recepcionista> consultarRecepcionista();
	void eliminarRecepcionista(Long id);
	void editarRecepcionista(Recepcionista recepcionista);
	Recepcionista consultarRecepcionista(Long id);
}
