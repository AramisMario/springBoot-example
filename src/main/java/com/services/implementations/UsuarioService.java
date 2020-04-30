package com.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.management.InstanceNotFoundException;

import com.dao.interfaces.IUsuarioDAO;
import com.models.Usuario;
import com.services.interfaces.IUsuarioService;
@Service("usuarioService")
@Transactional
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuarioDAO usuarioDAO;

	@Override
	public void crearUsuario(Usuario usuario) {
		usuarioDAO.save(usuario);
		
	}

	@Override
	public Usuario consultarUsuario(Long id) {
		Usuario user;
		try {
			user = usuarioDAO.find(Usuario.class, id);
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return user;
	}
	@Override
	public List<Usuario> consultarUsuarios() {
		List<Usuario> usuarios;
		try {
			usuarios = usuarioDAO.findAll(Usuario.class);
		}catch(InstanceNotFoundException e){
			return null;
		}
		
		return usuarios;
	
	}

	@Override
	public void eliminarUsuario(Long id) {
		try {
			usuarioDAO.remove(Usuario.class,id);
		}catch(InstanceNotFoundException e){
			e.printStackTrace();
		}
	}

	@Override
	public void editarUsuario(Usuario usuario) {
		usuarioDAO.edit(usuario);
		
	}

}
