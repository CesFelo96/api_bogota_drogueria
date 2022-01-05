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
import com.apiback_bog.api_bogota.API.ProductosAPI;
import com.apiback_bog.api_bogota.model.ProductosModel;

@RestController
@RequestMapping ("/productos_bog")
public class ProductosControlador {
	
	@Autowired
	ProductosAPI itemservice;
	
	@GetMapping ("/Listar")
	public List<ProductosModel> obtenerProveedores(){
		return itemservice.listarProveedores();
	}
	
	@PostMapping ("/Crear")
	public ProductosModel crearProveedor(@RequestBody ProductosModel proveedor) {
		return itemservice.guardarProveedor(proveedor);
	}
	
	@GetMapping("/ListarId/{id}")
	public Optional<ProductosModel> obternerPorId(@PathVariable("id") Long id){
		return itemservice.listarProveedoresPorId(id);
	}
	
	@DeleteMapping("/Eliminar/{id}")
	public String eliminarProveedorPorId(@PathVariable("id") Long id) {
		boolean eliminado = itemservice.eliminarProveedor(id);
		if(eliminado) {
			return "Proveedor eliminado";
		}else {
			return "Error Eliminado";
		}
	}
}
