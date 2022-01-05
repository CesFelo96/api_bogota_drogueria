package com.apiback_bog.api_bogota.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiback_bog.api_bogota.model.Detalle_VentaModel;

public interface IDetalle_VentaDAO extends JpaRepository<Detalle_VentaModel, Integer> {

}
