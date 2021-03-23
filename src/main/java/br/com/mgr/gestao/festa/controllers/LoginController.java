package br.com.mgr.gestao.festa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@GetMapping
    @RequestMapping("/")
    public String home() {
        return "redirect:/convidados";
    }
	
	@GetMapping
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
	
}
