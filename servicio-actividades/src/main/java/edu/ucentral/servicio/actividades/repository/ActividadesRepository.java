package edu.ucentral.servicio.actividades.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ucentral.servicio.actividades.model.Actividad;

public interface ActividadesRepository extends CrudRepository<Actividad, Long>{
	@Override
    @Query("select p from Actividad p join fetch p.sitiosturisticos o  join fetch o.clasificacion j ")
	public List<Actividad> findAll();
	
	@Query("select p from Actividad p join fetch p.sitiosturisticos o join fetch o.clasificacion j  where p.id = ?1")
	public Optional<Actividad> findById(Long id);
}
