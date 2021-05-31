package edu.ucentral.servicio.lugares.service;

import java.util.List;

import edu.ucentral.common.lugares.model.SitioTuristico;

public interface LugaresService {
	public List<SitioTuristico> findAll();
	public void save(SitioTuristico sitioturistico);
	public SitioTuristico findById(Long id);
	public void delete(SitioTuristico sitioturistico);
}
