package com.models;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Mecanico extends Empleado{
	
	@OneToOne
	@JoinColumn(name="recepcionista_id")
	private Habilidad habilidad;
	
	@Override
	public int calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
