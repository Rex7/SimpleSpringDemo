package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	} 
	
	@RequestMapping("/home")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("about.jsp");
		return mv;
	}

}
