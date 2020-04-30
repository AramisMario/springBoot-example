package com.services.interfaces;

import java.util.List;

import com.models.Usuario;

public interface IUsuarioService {
	void crearUsuario(Usuario usuario);
	List<Usuario> consultarUsuarios();
	Usuario consultarUsuario(Long id);
	void eliminarUsuario(Long id);
	void editarUsuario(Usuario usuario);
}
