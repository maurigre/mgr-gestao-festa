package br.com.mgr.gestao.festa.controllers;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.slf4j.Logger;

import br.com.mgr.gestao.festa.dataprovider.model.Convidado;
import br.com.mgr.gestao.festa.dataprovider.services.convidados.ConvidadosService;
import br.com.mgr.gestao.festa.dto.RequisicaoNovoConvidado;
import br.com.mgr.gestao.festa.validation.ConvidadoValidation;


@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    private static final Logger logger  =
            LoggerFactory.getLogger(ConvidadosController.class);
	
	@Autowired
	private ConvidadosService service;
    
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
        logger.info("Lista de convidados");
		return getView(new RequisicaoNovoConvidado());
	}


	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(
			@Valid RequisicaoNovoConvidado requisicao, 
			BindingResult result) {		

		if (result.hasErrors()) {
	        logger.error("Existe erros");
			return getView(requisicao);		
		}

		Convidado convidado = requisicao.toConvidado();
		service.save(convidado);		
		return listar();		
	}
	
	private ModelAndView getView(RequisicaoNovoConvidado requisicao) {
		ModelAndView view =	new ModelAndView("lista-convidados");
		view.addObject(requisicao);
		view.addObject("convidados", service.findAll());
		return view;
	}

}
