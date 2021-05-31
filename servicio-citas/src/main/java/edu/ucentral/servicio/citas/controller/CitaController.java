package edu.ucentral.servicio.citas.controller;

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

//import edu.ucentral.common.lugares.model.SitioTuristico;
import edu.ucentral.servicio.citas.model.Cita;
import edu.ucentral.servicio.citas.service.CitaService;
//import edu.ucentral.servicio.lugares.service.LugaresService;

@CrossOrigin(origins = "*")
@RestController
public class CitaController {
	
	@Autowired
	private CitaService citaService;
	
	//@Autowired
	//private LugaresService sitioturisticoService;
	
	@GetMapping("/citas")
	public List<Cita> index() {
		return citaService.findAll();
	}

	@GetMapping("/cita/{id}")
	public Cita show(@PathVariable Long id) {
		return this.citaService.findById(id);
	}

	@PostMapping("/crear-cita")
	@ResponseStatus(HttpStatus.CREATED)
	public Cita create(@RequestBody Cita cita) {
		this.citaService.save(cita);
		return cita;
	}

	@PutMapping("/modificar-cita/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cita update(@RequestBody Cita cita, @PathVariable Long id) {
		Cita currentCita = this.citaService.findById(id);
		currentCita.setFecha(cita.getFecha());
		currentCita.setHora(cita.getHora());
		currentCita.setNumeroAcompanantes(cita.getNumeroAcompanantes());
		currentCita.setSitiosturisticos(cita.getSitiosturisticos());
		currentCita.setUsuarios(cita.getUsuarios());
		citaService.save(currentCita);
		return currentCita;
	}

	@DeleteMapping("/eliminar-cita/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Cita currentCita = this.citaService.findById(id);
		this.citaService.delete(currentCita);
	}
	
	/*
	@GetMapping("/citas/validacupo/{fecha}/{idSitioTuristico}/{nuevoNumeroAcompanates}")
	@ResponseBody
	public String  validaCupo(@PathVariable String fecha, @PathVariable Long idSitioTuristico,@PathVariable int nuevoNumeroAcompanates) {
		String mensaje ="";
		String estado ="";
		int totalAcompanantes = this.citaService.sumTotalAcompanatesByFechaAndSitio(fecha,idSitioTuristico);
		// consulto el sitio turistico para verificar el cupo : 
		SitioTuristico sitioturistico = this.sitioturisticoService.findById(idSitioTuristico);
		int cupo =sitioturistico.getCantidadPersonas();
		
		if((totalAcompanantes+nuevoNumeroAcompanates) > cupo) {
			mensaje="Esta superando el cupo "+cupo+" sitio turistico "+sitioturistico.getNombreLugar()+" total asignadas "+totalAcompanantes+" Adicionales "+nuevoNumeroAcompanates;
		    estado ="Incorecto";
		}else {
			mensaje="Valido Cupo "+cupo+" sitio turistico "+sitioturistico.getNombreLugar()+" total asignadas "+totalAcompanantes+" Adicionales "+nuevoNumeroAcompanates;
		    estado = "Correcto";
		} 
				
		return estado+"|"+mensaje;
	}*/
}
