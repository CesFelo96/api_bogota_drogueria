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
import com.apiback_bog.api_bogota.API.ProveedoresAPI;
import com.apiback_bog.api_bogota.model.ProveedoresModel;


@RestController
@RequestMapping("/proveedores_bog")
public class ProveedoresControlador {
	
	@Autowired
	ProveedoresAPI userservice;
	
	@GetMapping ("/Listar")
	public List<ProveedoresModel> obtenerProveedores(){
		return userservice.listarProveedores();
	}
	
	@PostMapping ("/Crear")
	public ProveedoresModel crearProveedor(@RequestBody ProveedoresModel proveedor) {
		return userservice.guardarProveedor(proveedor);
	}
	
	@GetMapping("/ListarId/{id}")
	public Optional<ProveedoresModel> obternerPorId(@PathVariable("id") Long id){
		return userservice.listarProveedoresPorId(id);
	}
	
	@DeleteMapping("/Eliminar/{id}")
	public String eliminarProveedorPorId(@PathVariable("id") Long id) {
		boolean eliminado = userservice.eliminarProveedor(id);
		if(eliminado) {
			return "Proveedor eliminado";
		}else {
			return "Error Eliminado";
		}
	}

}
