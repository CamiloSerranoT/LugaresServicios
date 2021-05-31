package edu.ucentral.servicio.citas.service;

import java.util.List;

import edu.ucentral.servicio.citas.model.Cita;

public interface CitaService {
	public List<Cita> findAll();
	public void save(Cita cita);
	public Cita findById(Long id);
	public void delete(Cita cita);
	public int  sumTotalAcompanatesByFechaAndSitio(String fecha,Long idSitioTuristico);
}
