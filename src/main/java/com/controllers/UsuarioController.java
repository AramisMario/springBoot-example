package com.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Usuario;
import com.services.interfaces.IUsuarioService;


@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {		
		usuarioService.crearUsuario(usuario);
		
		return usuario;
	}
	
	@GetMapping("/usuarioId/{id}")
	public Usuario buscar(@PathVariable("id") Long id) {
		return usuarioService.consultarUsuario(id);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> allUsuarios(){
		return usuarioService.consultarUsuarios();
	}

	@PutMapping("/editarUsuario")
	public void modificar(@RequestBody Usuario usuario) {
		usuarioService.editarUsuario(usuario);
	}
	
	@DeleteMapping(value="eliminarUsuario/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		usuarioService.eliminarUsuario(id);
	}
	
}