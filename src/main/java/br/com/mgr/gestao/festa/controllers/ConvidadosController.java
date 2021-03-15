package br.com.mgr.gestao.festa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mgr.gestao.festa.dataprovider.services.convidados.ConvidadosService;


@Controller
public class ConvidadosController {
	
	@Autowired
	private ConvidadosService service;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {

		ModelAndView view =	new ModelAndView("ListaConvidados");
		view.addObject("convidados", service.findAll());
		return view;
	}

	
	

}
