package org.encuesta.service;


import java.util.List;
import org.encuesta.dao.UsuarioDao;
import org.encuesta.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;


public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	public void setUsuariosDelete(UsuarioDao usuarioDao ){
		this.usuarioDao=usuarioDao;
	}
	public List <Usuario> getUsuariosDelete(){
		return usuarioDao.getlistaEliminados();
	}
}
