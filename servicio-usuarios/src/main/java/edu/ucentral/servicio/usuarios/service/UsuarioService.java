package edu.ucentral.servicio.usuarios.service;


import java.util.List;

import edu.ucentral.common.usuarios.model.Usuario;

public interface UsuarioService {
	public List<Usuario> findAll();
	public void save(Usuario usuario);
	public Usuario findById(Long id);
	public void delete(Usuario usuario);
	public Usuario getUserByUsername(String user);
	public String Login(String user,String password);
}
