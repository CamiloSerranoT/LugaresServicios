package edu.ucentral.servicio.citas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ucentral.servicio.citas.model.Cita;

public interface CitaRepository extends CrudRepository<Cita,Long> {
	
	@Override
    @Query("select c from Cita c join fetch c.usuarios u join fetch c.sitiosturisticos s "
    		+ " join fetch u.tipousuarios t   "
    		+ " join fetch s.clasificacion f ")
	public List<Cita> findAll();
	
	
	@Query("select c from Cita c join fetch c.usuarios u join fetch c.sitiosturisticos s " 
			+ " join fetch u.tipousuarios t " 
			+ " join fetch s.clasificacion f  "
			+ " where c.id = ?1")
	public Optional<Cita> findById(Long id);
	
	@Query(value = "SELECT sum(c.numero_acompanantes) FROM citas c " 
    		+ " WHERE c.sitiosturisticos = ?2 and  fecha =?1",nativeQuery = true )
    public int sumTotalAcompanatesByFechaAndSitio(String fecha,Long id); 
	
}
