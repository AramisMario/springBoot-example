package com.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Empleado extends Persona{
	@Column(name="seguroSocial")
	private int seguroSocial;
	@Column(name="sueldo")
	private int sueldo;
	public int getSeguroSocial() {
		return seguroSocial;
	}
	public void setSeguroSocial(int seguroSocial) {
		this.seguroSocial = seguroSocial;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public abstract int calcularSueldo();
}
