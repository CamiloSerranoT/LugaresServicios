package edu.ucentral.servicio.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucentral.common.usuarios.model.Usuario;
import edu.ucentral.servicio.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
		
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
	

	@Transactional
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario getUserByUsername(String user) {
		return usuarioRepository.getUserByUsername(user);
	}

	@Override
	public String Login(String user, String password) {
		Usuario usuario = usuarioRepository.getUserByUsername(user);
		String mensaje="";
		String estado="";
		
		if(user.equals("") || password.equals("") ) {
			mensaje="Datos incompletos";
			estado ="Incorrecto";
		}
		
		if(usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
			mensaje="Login Exitoso";
			estado ="Correcto";			
		}else {
			mensaje="Usuario - Contrasena Incorrectos";
		}
		
		return estado+"|"+mensaje;
	}
	
}
