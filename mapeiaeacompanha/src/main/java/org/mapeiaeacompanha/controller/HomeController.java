package org.mapeiaeacompanha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index(){
        System.out.println("Entrando na home");
        return "home";
    }
	
	@RequestMapping("/teste/teste")
    public ModelAndView teste(){
        System.out.println("Entrando em teste");
        return new ModelAndView("/teste/teste");
    }
}
