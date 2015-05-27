package org.encuesta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao{

	private EntityManager em;
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly=false)
	public boolean saveUsuario(Usuario usuario) {
		try{
			em.persist(usuario);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	@Transactional(readOnly=false)
	public boolean editUsuario(Usuario usuario) {
		try{
			em.merge(usuario);
			return true;
		}catch(Exception ex){}
		return false;
	}

	
	public Usuario findUsuario(String username, String pwd) {
		try{
			return (Usuario)em.createQuery("SELECT u FROM Usuario u WHERE u.username=:user AND u.password=:pwd AND u.enabled=true ")
			.setParameter("user", username)
			.setParameter("pwd", pwd).getSingleResult();
		}catch(Exception ex){
			System.out.println("ERROR " +ex.getLocalizedMessage());
		}
		return null;
	}

	public Usuario findUsuario(String username) {
		try{
			return (Usuario)em.createQuery("SELECT u FROM Users u WHERE u.username=:user")
			.setParameter("user", username).getSingleResult();
		}catch(Exception ex){}
		return null;
	}

	public List<Usuario> getlistaEliminados() {
		// TODO Auto-generated method stub
		return null;
	}	

}
