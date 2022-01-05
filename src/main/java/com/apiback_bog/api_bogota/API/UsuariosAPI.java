package com.apiback_bog.api_bogota.API;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apiback_bog.api_bogota.DAO.IUsuariosDAO;
import com.apiback_bog.api_bogota.model.UsuariosModel;


@Service
public class UsuariosAPI {
	
	@Autowired
	private IUsuariosDAO userDAO; // inyeccion de dependencias
	
	
	//CREATE UPDATE
	public UsuariosModel guardarUsuario(UsuariosModel usuarios) {
		return userDAO.save(usuarios);//Crea un registro segun una entidad 
	}
	
	public Optional<UsuariosModel> listarUsuarioPorId(Long id){
		return userDAO.findById(id);
	}
	
	
	public List<UsuariosModel> listarUsuarios(){
		return userDAO.findAll();
	}
	

	public boolean eliminarUsuario(Long id) {
		try {
			userDAO.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
}
