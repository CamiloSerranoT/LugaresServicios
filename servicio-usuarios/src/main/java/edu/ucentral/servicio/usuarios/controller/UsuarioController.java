package edu.ucentral.servicio.usuarios.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.usuarios.model.Usuario;
import edu.ucentral.servicio.usuarios.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}
	

	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return this.usuarioService.findById(id);
	}

	@PostMapping("/crear-usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		this.usuarioService.save(usuario);
		return usuario;
	}

	@PutMapping("/modificar-usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario currentUsuario = this.usuarioService.findById(id);
		currentUsuario.setNombre(usuario.getNombre());
		currentUsuario.setCelular(usuario.getCelular());
		currentUsuario.setCorreo(usuario.getCorreo());
		currentUsuario.setTipousuarios(usuario.getTipousuarios());
		currentUsuario.setCedula(usuario.getCedula());
		currentUsuario.setUser(usuario.getUser());
		currentUsuario.setPassword(usuario.getPassword());
		this.usuarioService.save(currentUsuario);
		return currentUsuario;
	}

	@DeleteMapping("/eliminar-usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Usuario currentUsuario = this.usuarioService.findById(id);
		this.usuarioService.delete(currentUsuario);
	}
	
	@GetMapping("/login/{user}/{password}")
	@ResponseBody
	public String login(@PathVariable   String user,@PathVariable  String password) {
		return this.usuarioService.Login(user, password);
	}
}
