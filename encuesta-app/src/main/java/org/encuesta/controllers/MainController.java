package org.encuesta.controllers;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private ShaPasswordEncoder encoder;
	
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String adminIndex(){
	/*	Usuario u = new Usuario();
		u.setEnabled(true);
		u.setName("Victor de la Cruz");
		u.setUsername("5555555555");
		u.setPassword(encoder.encodePassword("123456", u.getUsername()));
		if(usuarioDao.saveUsuario(u))
			System.out.println("Usuario guardado en bd");
		System.out.println("hola");*/
		return "index";
	}
}
