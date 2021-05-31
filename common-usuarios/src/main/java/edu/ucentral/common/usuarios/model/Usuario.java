package edu.ucentral.common.usuarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(unique = true)
	private String correo;
	private String celular;
	@Column(unique = true)
	private String user;
	private String password;
	@Column(unique = true)
	private String cedula;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tipousuarios")
	private TipoUsuario tipousuarios;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public TipoUsuario getTipousuarios() {
		return tipousuarios;
	}

	public void setTipousuarios(TipoUsuario tipousuarios) {
		this.tipousuarios = tipousuarios;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
