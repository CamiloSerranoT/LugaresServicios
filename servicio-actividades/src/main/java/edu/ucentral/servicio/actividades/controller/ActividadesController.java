package edu.ucentral.servicio.actividades.controller;

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

import edu.ucentral.servicio.actividades.model.Actividad;
import edu.ucentral.servicio.actividades.service.ActividadService;

@CrossOrigin(origins = "*")
@RestController
public class ActividadesController {
	
	@Autowired
	private ActividadService actividadService;
	
	@GetMapping("/actividades")
	public List<Actividad> index() {
		return actividadService.findAll();
	}

	@GetMapping("/actividad/{id}")
	public Actividad show(@PathVariable Long id) {
		return this.actividadService.findById(id);
	}

	@PostMapping("/crear-actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad create(@RequestBody Actividad actividad) {
		this.actividadService.save(actividad);
		return actividad;
	}

	@PutMapping("/modificar-actividad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad update(@RequestBody Actividad actividad, @PathVariable Long id) {
		Actividad currentActividad = this.actividadService.findById(id);
		currentActividad.setDescripcion(actividad.getDescripcion());
		currentActividad.setDuracion(actividad.getDuracion());
		currentActividad.setFechaInicio(actividad.getFechaInicio());
		currentActividad.setFechaFinal(actividad.getFechaFinal());
		currentActividad.setHora(actividad.getHora());
		currentActividad.setNombre(actividad.getNombre());
		currentActividad.setSitiosturisticos(actividad.getSitiosturisticos());
		actividadService.save(currentActividad);
		return currentActividad;
	}

	@DeleteMapping("/eliminar-actividad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Actividad currentUsuario = this.actividadService.findById(id);
		this.actividadService.delete(currentUsuario);
	}
	
}
