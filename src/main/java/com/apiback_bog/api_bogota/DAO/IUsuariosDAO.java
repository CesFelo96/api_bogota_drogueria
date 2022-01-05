package com.apiback_bog.api_bogota.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apiback_bog.api_bogota.model.UsuariosModel;

public interface IUsuariosDAO extends JpaRepository<UsuariosModel, Long> {
	
}
