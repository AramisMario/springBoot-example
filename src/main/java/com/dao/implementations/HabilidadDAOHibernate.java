package com.dao.implementations;

import com.dao.interfaces.IHabilidadDAO;
import com.models.Habilidad;
import org.springframework.stereotype.Repository;
@Repository
public class HabilidadDAOHibernate extends GenericDAOHibernate<Habilidad,Long> implements IHabilidadDAO{
	// aqui se implemtentan los metodos definidos en IHabilidadDAO
}
