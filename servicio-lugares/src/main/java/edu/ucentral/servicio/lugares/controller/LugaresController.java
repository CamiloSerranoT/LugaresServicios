package edu.ucentral.servicio.lugares.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.lugares.model.SitioTuristico;

import edu.ucentral.servicio.lugares.service.LugaresService;

@CrossOrigin(origins = "*")
@RestController
public class LugaresController {
	
	@Autowired
	private LugaresService sitioturisticoService;
	
	@GetMapping("/sitios-turisticos")
	public List<SitioTuristico> index() {
		return sitioturisticoService.findAll();
	}

	@GetMapping("/sitio-turistico/{id}")
	public SitioTuristico show(@PathVariable Long id) {
		return this.sitioturisticoService.findById(id);
	}

	@PostMapping("/crear-sitio")
	@ResponseStatus(HttpStatus.CREATED)
	public SitioTuristico create(@RequestBody SitioTuristico sitioturistico) {
		this.sitioturisticoService.save(sitioturistico);
		return sitioturistico;
	}

	@PutMapping("/modificar-sitio/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public SitioTuristico update(@RequestBody SitioTuristico sitioturistico, @PathVariable Long id) {
		SitioTuristico currentSitioturistico = this.sitioturisticoService.findById(id);
		currentSitioturistico.setCantidadPersonas(sitioturistico.getCantidadPersonas());
		currentSitioturistico.setEstado(sitioturistico.getEstado());
		currentSitioturistico.setNombreLugar(sitioturistico.getNombreLugar());
		currentSitioturistico.setClasificacion(sitioturistico.getClasificacion());
		currentSitioturistico.setUbicacion(sitioturistico.getUbicacion());
		this.sitioturisticoService.save(currentSitioturistico);		
		return currentSitioturistico;
	}

	@DeleteMapping("/eliminar-sitio/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		SitioTuristico currentSitioturistico = this.sitioturisticoService.findById(id);
		this.sitioturisticoService.delete(currentSitioturistico);
	}
}
