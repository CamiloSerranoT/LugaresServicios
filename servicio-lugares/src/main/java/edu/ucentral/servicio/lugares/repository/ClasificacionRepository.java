package edu.ucentral.servicio.lugares.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.ucentral.common.lugares.model.Clasificacion;

public interface ClasificacionRepository extends PagingAndSortingRepository<Clasificacion, Long> {

}
