package com.dao.implementations;

import com.dao.interfaces.IMecanicoDAO;
import com.models.Mecanico;

import org.springframework.stereotype.Repository;
@Repository
public class MecanicoDAOHibernate extends GenericDAOHibernate<Mecanico,Long> implements IMecanicoDAO{
	// aqui se implemtentan los metodos definidos en IMecanicoDAO
}
