package com.apiback_bog.api_bogota.API;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apiback_bog.api_bogota.DAO.IVentasDAO;
import com.apiback_bog.api_bogota.model.VentasModel;

@Service
public class VentasAPI {

	@Autowired
	private IVentasDAO ventaDAO;
	
	public VentasModel guardarVentas(VentasModel ventas) {
		return ventaDAO.save(ventas);
	}	
	
	public List<VentasModel> listarVentas(){
		return ventaDAO.findAll();
	}
	
}
