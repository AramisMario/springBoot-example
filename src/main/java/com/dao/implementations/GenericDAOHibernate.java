package com.dao.implementations;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaQuery;
import javax.management.InstanceNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dao.interfaces.IGenericDAO;
@Repository
@EntityScan("com.models")
public class GenericDAOHibernate<E, PK extends Serializable> implements IGenericDAO<E, PK> {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void save(E Entity) {
		entityManager.persist(Entity);
		
	}
	
	@Override
	public void edit(E Entity) {
		entityManager.merge(Entity);
	}

	@Override
	public E find(Class<E> clazz, PK id) throws InstanceNotFoundException {
		return  entityManager.find(clazz,id);
	}

	@Override
	public boolean exists(PK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remove(Class<E> clazz, PK id) throws InstanceNotFoundException {
			entityManager.createQuery("DELETE  from "+clazz.getName()+" u");	
	}

	@Override
	public List<E> findAll(Class<E> clazz) throws InstanceNotFoundException {
		List<E> results;
		results = entityManager.createQuery("SELECT u from "+clazz.getName()+" u").getResultList();
		return results;
	}
	
}
