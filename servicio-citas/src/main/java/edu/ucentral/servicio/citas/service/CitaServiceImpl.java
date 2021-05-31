package edu.ucentral.servicio.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucentral.servicio.citas.model.Cita;
import edu.ucentral.servicio.citas.repository.CitaRepository;

@Service
public class CitaServiceImpl implements CitaService{
	@Autowired
	private CitaRepository citaRepository;
	
	@Override
	public List<Cita> findAll() {
		return (List<Cita>) citaRepository.findAll();
	}
	
	@Transactional
	public void save(Cita cita) {
		citaRepository.save(cita);
	}

	@Override
	@Transactional(readOnly = true)
	public Cita findById(Long id) {
		return citaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Cita cita) {
		citaRepository.delete(cita);
	}

	@Override
	public int  sumTotalAcompanatesByFechaAndSitio( String fecha,Long idSitioTuristico) {
		return citaRepository.sumTotalAcompanatesByFechaAndSitio(fecha,idSitioTuristico);
	}
}
