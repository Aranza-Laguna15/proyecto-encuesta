package org.encuesta.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuariosDao implements UsuarioDao{
	private EntityManager em;
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	

/*
 * Query query = getEntityManager().createQuery("select c from Car c");
        List<Car> resultList = query.getResultList();
        return resultList;
 */
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Usuario> getlistaEliminados() {
		System.out.println("hola 1");
		String consulta="SELECT u FROM  user_eliminados u";
		return em.createQuery(consulta).getResultList();  
	
	}

	public boolean saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usuario findUsuario(String username, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario findUsuario(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
