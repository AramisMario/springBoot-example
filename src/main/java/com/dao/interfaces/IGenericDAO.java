package com.dao.interfaces;
import java.io.Serializable;
import java.util.List;

import javax.management.InstanceNotFoundException;

public interface IGenericDAO <E, PK extends Serializable> {
	
	void save(E Entity);
	
	E find(Class<E> clazz,PK id) throws InstanceNotFoundException;
	
	boolean exists(PK id);
	
	void remove(Class<E> clazz,PK id) throws InstanceNotFoundException;
	
	List<E> findAll(Class<E> clazz) throws InstanceNotFoundException;
	
	void edit(E Entity);
}
