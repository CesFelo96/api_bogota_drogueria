package com.apiback_bog.api_bogota.API;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apiback_bog.api_bogota.DAO.IDetalle_VentaDAO;
import com.apiback_bog.api_bogota.model.Detalle_VentaModel;

@Service
public class Detalle_VentaAPI {
	
	@Autowired
	private IDetalle_VentaDAO Detalle_VentaDAO;
	
	public Detalle_VentaModel guardarDetalle_Venta(Detalle_VentaModel detalle_venta) {
		return Detalle_VentaDAO.save(detalle_venta);
	}
		
	public List<Detalle_VentaModel> listarDetalle_Venta(){
		return Detalle_VentaDAO.findAll();
	}

}
