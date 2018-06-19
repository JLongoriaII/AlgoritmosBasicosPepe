package com.algoritmosopp.misclases;

import java.util.Date;

public class Mascota {
	private String id;
	private String nombre;
	private String especie;
	private String estado;
	private Date fechaIngreso;
	private Date fechaSalida;
	
	public Mascota() {
		
	}
	
	public Mascota(String id,String nombre,String especie,String estado,Date fechaIngreso, Date fechaSalida) {
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.estado = estado;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public String toString() {
		return "El Id de la mascota es: " + getId() + ", con nombre: " + getNombre() + 
				", de especie: " + getEspecie() + ", con fecha de Inicio: " + getFechaIngreso()
				+ ", se encuentra en estado: " + getEstado();	
		}
}
