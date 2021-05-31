package edu.ucentral.servicio.usuarios.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ucentral.common.usuarios.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	@Override
    @Query("select p from Usuario p join fetch p.tipousuarios o")
	public List<Usuario> findAll();
	
	@Query("select p from Usuario p join fetch p.tipousuarios o where p.id = ?1")
	public Optional<Usuario> findById(Long id);
	
	
    @Query("SELECT u FROM Usuario u WHERE u.user =?1")
    public Usuario getUserByUsername(String user);
}
