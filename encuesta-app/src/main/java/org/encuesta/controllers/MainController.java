package org.encuesta.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.encuesta.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.encuesta.domain.Usuario;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMethod;

public class MainController {
	@Autowired
	private UsuarioDao usuarioDao;
	private MessageDigestPasswordEncoder encoder;
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String adminIndex(){
	/*	Usuario u = new Usuario();
		u.setEnabled(true);
		u.setName("Victor de la Cruz");
		u.setUsername("5555555555");
		
		u.setPassword(encoder.encodePassword("123456", u.getUsername()));
		
		if(usuarioDao.saveUsuario(u))
			System.out.println("Usuario guardado en bd");*/
		return "index";
	}
	
	
    @RequestMapping(value="/iniciousers.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning iniciousers view");
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("users", this.usuarioDao.getlistaEliminados());
        
        return new ModelAndView("iniciousers","model", myModel);
    }
   public void setUsuarioDao(UsuarioDao userDao){
	   this.usuarioDao=userDao;
   }
	
}
