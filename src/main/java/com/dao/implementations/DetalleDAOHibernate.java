package com.dao.implementations;

import org.springframework.stereotype.Repository;

import com.dao.interfaces.IDetalleDAO;
import com.models.Detalle;
@Repository
public class DetalleDAOHibernate extends GenericDAOHibernate<Detalle,Long> implements IDetalleDAO{
	/// aqui se definen los metodos de la logica del negocio relacionados con detalle
}	
