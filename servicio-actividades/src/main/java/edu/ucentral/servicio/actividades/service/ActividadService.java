package edu.ucentral.servicio.actividades.service;

import java.util.List;

import edu.ucentral.servicio.actividades.model.Actividad;

public interface ActividadService {
	public List<Actividad> findAll();
	public void save(Actividad actividad);
	public Actividad findById(Long id);
	public void delete(Actividad actividad);
}
