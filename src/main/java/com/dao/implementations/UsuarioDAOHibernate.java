package com.dao.implementations;

import com.dao.interfaces.IUsuarioDAO;
import com.models.Usuario;
import org.springframework.stereotype.Repository;
@Repository
public class UsuarioDAOHibernate extends GenericDAOHibernate<Usuario,Long> implements IUsuarioDAO{
	// aqui se implemtentan los metodos definidos en IUsuarioDAO
}
