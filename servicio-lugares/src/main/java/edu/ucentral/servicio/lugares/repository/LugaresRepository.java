package edu.ucentral.servicio.lugares.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ucentral.common.lugares.model.SitioTuristico;

public interface LugaresRepository extends CrudRepository<SitioTuristico,Long> {
	@Override
    @Query("select p from SitioTuristico p join fetch p.clasificacion o")
	public List<SitioTuristico> findAll();
	
	@Query("select p from SitioTuristico p join fetch p.clasificacion o where p.id = ?1")
	public Optional<SitioTuristico> findById(Long id);
}
