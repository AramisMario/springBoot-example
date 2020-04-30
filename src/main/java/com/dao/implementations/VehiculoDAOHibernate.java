package com.dao.implementations;

import com.dao.interfaces.IVehiculoDAO;
import com.models.Vehiculo;
import org.springframework.stereotype.Repository;
@Repository
public class VehiculoDAOHibernate extends GenericDAOHibernate<Vehiculo, Long> implements IVehiculoDAO {
	// aqui se implemtentan los metodos definidos en IUsuarioDAO
}
