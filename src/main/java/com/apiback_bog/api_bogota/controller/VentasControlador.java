package com.apiback_bog.api_bogota.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apiback_bog.api_bogota.API.VentasAPI;
import com.apiback_bog.api_bogota.model.VentasModel;

@RestController
@RequestMapping("/ventas_bog")
public class VentasControlador {
	
	@Autowired
	VentasAPI userservice;
	
	@GetMapping ("/Listar")
	public List<VentasModel> obtenerVentas(){
		return userservice.listarVentas();
	}
	
	@PostMapping ("/Guardar")
	public VentasModel crearVenta(@RequestBody VentasModel venta) {
		return userservice.guardarVentas(venta);
	}
	
	

}
