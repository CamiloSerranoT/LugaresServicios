package edu.ucentral.servicio.citas.model;

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
import edu.ucentral.common.usuarios.model.Usuario;

@Entity
@Table(name="Citas")
public class Cita implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha ; 
	private String hora;
	private int numeroacompanantes; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usuarios")
	private Usuario usuarios; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sitiosturisticos")
	private SitioTuristico sitiosturisticos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getNumeroAcompanantes() {
		return numeroacompanantes;
	}
	public void setNumeroAcompanantes(int numeroacompanantes) {
		this.numeroacompanantes = numeroacompanantes;
	}
	public Usuario getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}
	public SitioTuristico getSitiosturisticos() {
		return sitiosturisticos;
	}
	public void setSitiosturisticos(SitioTuristico sitiosturisticos) {
		this.sitiosturisticos = sitiosturisticos;
	}	
	
	private static final long serialVersionUID = 1L;
}
