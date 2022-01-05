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
import com.apiback_bog.api_bogota.API.ClientesAPI;
import com.apiback_bog.api_bogota.model.ClientesModel;



@RestController
@RequestMapping("/clientes_bog")
public class ClientesControlador {
	
	@Autowired
	ClientesAPI userservice;
	
	@GetMapping ("/Listar")
	public List<ClientesModel> obtenerClientes(){
		return userservice.listarClientes();
	}
	
	@PostMapping ("/Crear")
	public ClientesModel crearUsuario(@RequestBody ClientesModel clientes) {
		return userservice.guardarCliente(clientes);
	}
	
	@GetMapping("/ListarId/{id}")
	public Optional<ClientesModel> obternerPorId(@PathVariable("id") Long id){
		return userservice.listarClientesPorId(id);
	}
	
	@DeleteMapping("/Eliminar/{id}")
	public String eliminarClientePorId(@PathVariable("id") Long id) {
		boolean eliminado = userservice.eliminarCliente(id);
		if(eliminado) {
			return "Cliente eliminado";
		}else {
			return "Error Eliminado";
		}
	}
}
