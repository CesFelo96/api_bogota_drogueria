package com.apiback_bog.api_bogota.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiback_bog.api_bogota.model.ProveedoresModel;

public interface IProveedoresDAO extends JpaRepository<ProveedoresModel, Long> {

}
