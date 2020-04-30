package com.dao.implementations;

import com.dao.interfaces.IReparacionDAO;
import com.models.Reparacion;
import org.springframework.stereotype.Repository;
@Repository
public class ReparacionDAOHibernate extends GenericDAOHibernate<Reparacion,Long> implements IReparacionDAO{

}
