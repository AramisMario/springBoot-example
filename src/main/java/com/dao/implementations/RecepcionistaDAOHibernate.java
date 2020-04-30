package com.dao.implementations;

import com.dao.interfaces.IRecepcionistaDAO;
import com.models.Recepcionista;
import org.springframework.stereotype.Repository;
@Repository
public class RecepcionistaDAOHibernate extends GenericDAOHibernate<Recepcionista,Long> implements IRecepcionistaDAO{

}
