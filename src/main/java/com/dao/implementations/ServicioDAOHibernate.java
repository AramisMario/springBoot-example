package com.dao.implementations;

import com.dao.interfaces.IServicioDAO;
import com.models.Servicio;
import org.springframework.stereotype.Repository;
@Repository
public class ServicioDAOHibernate extends GenericDAOHibernate<Servicio,Long> implements IServicioDAO{
	// aqui se implemtentan los metodos definidos en IServicioDAO
}
