package com.apiback_bog.api_bogota.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiback_bog.api_bogota.model.ClientesModel;

public interface IClientesDAO extends JpaRepository<ClientesModel, Long> {
	
}
