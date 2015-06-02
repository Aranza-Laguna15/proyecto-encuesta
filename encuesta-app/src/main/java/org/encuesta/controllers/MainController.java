package org.encuesta.controllers;

import org.encuesta.dao.UsuarioDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MainController {
	@Autowired
	public UsuarioDaoImpl usuarioDaoIm;
	//private MessageDigestPasswordEncoder encoder;
	
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String adminIndex(Model model){
	/*	Usuario u = new Usuario();
		u.setEnabled(true);
		u.setName("Victor de la Cruz");
		u.setUsername("5555555555");
		
		u.setPassword(encoder.encodePassword("123456", u.getUsername()));
		
		if(usuarioDao.saveUsuario(u))
			System.out.println("Usuario guardado en bd");*/
		model.addAttribute("users",usuarioDaoIm.getlistaEliminados());
		return "index";
	}
	
    @RequestMapping(value="/iniciousers.htm", method=RequestMethod.GET)
    public String usuariosDelete(Model model){
    	model.addAttribute("users", usuarioDaoIm.getlistaEliminados());
        return "iniciousers";
    }
	
}
