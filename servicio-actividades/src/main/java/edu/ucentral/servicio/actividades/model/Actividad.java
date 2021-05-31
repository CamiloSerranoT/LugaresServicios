package edu.ucentral.servicio.actividades.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import edu.ucentral.common.lugares.model.SitioTuristico;

@Entity 
@Table(name="actividades")
public class Actividad implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String nombre; 
	private String descripcion;
	private int duracion ; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechainicio ;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechafinal ;
	
	private String hora ; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sitiosturisticos")
	private SitioTuristico sitiosturisticos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Date getFechaInicio() {
		return fechainicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechainicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechafinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechafinal = fechaFinal;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public SitioTuristico getSitiosturisticos() {
		return sitiosturisticos;
	}

	public void setSitiosturisticos(SitioTuristico sitiosturisticos) {
		this.sitiosturisticos = sitiosturisticos;
	}
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
