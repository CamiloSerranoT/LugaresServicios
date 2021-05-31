package edu.ucentral.servicio.actividades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucentral.servicio.actividades.model.Actividad;
import edu.ucentral.servicio.actividades.repository.ActividadesRepository;

@Service
public class ActividadServiceImpl implements ActividadService {
	
	@Autowired
	private ActividadesRepository actividadRepository;
	
	@Override
	public List<Actividad> findAll() {
		return (List<Actividad>) actividadRepository.findAll();
	}
	
	@Transactional
	public void save(Actividad actividad) {
		actividadRepository.save(actividad);
	}

	@Override
	@Transactional(readOnly = true)
	public Actividad findById(Long id) {
		return actividadRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Actividad actividad) {
		actividadRepository.delete(actividad);
	}

}
