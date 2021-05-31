package edu.ucentral.common.lugares.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sitiosturisticos")
public class SitioTuristico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;
    private String nombrelugar;
    private String ubicacion;
    private int cantidadpersonas;
    private int estado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="clasificacion")
    private Clasificacion clasificacion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreLugar() {
		return nombrelugar;
	}

	public void setNombreLugar(String nombrelugar) {
		this.nombrelugar = nombrelugar;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidadPersonas() {
		return cantidadpersonas;
	}

	public void setCantidadPersonas(int cantidadpersonas) {
		this.cantidadpersonas = cantidadpersonas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	} 
}
