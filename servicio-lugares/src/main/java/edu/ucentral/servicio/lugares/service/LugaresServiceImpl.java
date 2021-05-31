package edu.ucentral.servicio.lugares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucentral.common.lugares.model.SitioTuristico;
import edu.ucentral.servicio.lugares.repository.LugaresRepository;

@Service
public class LugaresServiceImpl implements LugaresService{
	
	@Autowired
	private LugaresRepository sitioturisticoRepository;
	
	@Override
	public List<SitioTuristico> findAll() {
		return (List<SitioTuristico>) sitioturisticoRepository.findAll();
	}
	
	@Transactional
	public void save(SitioTuristico sitioturistico) {
		sitioturisticoRepository.save(sitioturistico);
	}

	@Override
	@Transactional(readOnly = true)
	public SitioTuristico findById(Long id) {
		return sitioturisticoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(SitioTuristico sitioturistico) {
		sitioturisticoRepository.delete(sitioturistico);
	}

}
