package com.models;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Usuario extends Persona{
	
	@OneToMany(mappedBy="usuario")
	List<Vehiculo> vehiculos = new ArrayList<>();
	
	
}
