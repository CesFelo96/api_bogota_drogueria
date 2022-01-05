package com.apiback_bog.api_bogota.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apiback_bog.api_bogota.API.UsuariosAPI;
import com.apiback_bog.api_bogota.model.UsuariosModel;



@RestController
@RequestMapping("/usuarios_bog")
public class UsuariosControlador {
	
	@Autowired
	UsuariosAPI userservice;
	
	@GetMapping ("/Listar")
	public List<UsuariosModel> obtenerUsuarios(){
		return userservice.listarUsuarios();
	}
	
	@PostMapping ("/Crear")
	public UsuariosModel crearUsuario(@RequestBody UsuariosModel user) {
		return userservice.guardarUsuario(user);
	}
	
	@GetMapping("/ListarId/{id}")
	public Optional<UsuariosModel> obternerPorId(@PathVariable("id") Long id){
		return userservice.listarUsuarioPorId(id);
	}
	
	@DeleteMapping("/Eliminar/{id}")
	public String eliminarUsuarioPorId(@PathVariable("id") Long id) {
		boolean eliminado = userservice.eliminarUsuario(id);
		if(eliminado) {
			return "Cliente eliminado";
		}else {
			return "Error Eliminado";
		}
	}
}
