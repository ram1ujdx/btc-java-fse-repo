package com.btc.example.springboot.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.btc.example.springboot.model.Coder;

@Controller
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello(){
		System.out.println("Controller Passed");
		return "hello.jsp";
		
		
	}
	
	
	
	@PostMapping("/register")
	public ModelAndView registerTrainee(@ModelAttribute Coder coder) {
		
		ModelAndView mv=new ModelAndView("show");
		
		mv.addObject("coder", coder);
	
		
		return mv;
		
		
	}
	
//	@PostMapping("/register")
//	public ModelAndView registerTrainee(@RequestParam("tname") String tName, 
//							@RequestParam("temail") String email ) {
//		
//		ModelAndView mv=new ModelAndView("show.jsp");
//		
//		mv.addObject("tname", tName);
//		mv.addObject("email", email);
//		
//		return mv;
//		
//		
//	}
	

}
