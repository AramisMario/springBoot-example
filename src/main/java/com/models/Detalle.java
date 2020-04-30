package com.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Detalle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="descripcion",length=350)
	private String descripcion;
	@Column(name="terminado",length=13)
	private String terminado;
	@ManyToOne
	@JoinColumn(name="servicio_id")
	private Servicio servicio;
	@ManyToOne
	@JoinColumn(name="reparacion_id")
	private Reparacion reparacion;
	@OneToOne
	@JoinColumn(name="mecanico_id")
	private Mecanico mecanico;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String isTerminado() {
		return terminado;
	}
	public void setTerminado(String terminado) {
		this.terminado = terminado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
